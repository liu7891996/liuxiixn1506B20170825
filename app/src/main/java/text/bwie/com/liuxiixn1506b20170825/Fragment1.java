package text.bwie.com.liuxiixn1506b20170825;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.google.gson.Gson;

import org.xutils.DbManager;
import org.xutils.common.Callback;
import org.xutils.ex.DbException;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import me.maxwin.view.XListView;

/**
 * 类描述：fragment布局类
 * 姓名 ：刘希鑫
 */

public class Fragment1 extends Fragment implements XListView.IXListViewListener {
    public static final String ARG_TYPE = "type";
    private int mType;
    private XListView xListView;
    private List<DataBean> arr;
    private XlistAdapter adapter;
    private String url="http://ic.snssdk.com/2/article/v25/stream/?category=news_finance&count=20&min_behot_time=1455522899&bd_city=北京市&bd_latitude=40.049317&bd_longitude=116.296499&bd_loc_time=1455523440&loc_mode=5&lac=4527&cid=28883&iid=3642583580&device_id=11131669133&ac=wifi&channel=baidu&aid=13&app_name=news_article&version_code=460&device_platform=android&device_type=SCH-I919U&os_api=19&os_version=4.4.2&uuid=285592931621751&openudid=AC9E172CE2490000";

    //这个是本例中模拟的数据

    private Handler mHandler;

//用来模拟网络请求的（不要被迷惑）

    private int start = 0;

    private static int refreshCnt = 0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getActivity(),R.layout.fragment1,null);
        xListView = view.findViewById(R.id.xListView);
        x.view().inject(this,view);



        SharedPreferences share=getActivity().getSharedPreferences("CUN",Activity.MODE_PRIVATE);
        boolean jilu = share.getBoolean("jilu", false);
        if (jilu==true){
            getinieView();   //xlistview布局加载数据
            App app= (App) getActivity().getApplication();
           DbManager dbManager = app.getDbManager();
            try {
               arr = dbManager.findAll(DataBean.class);
               adapter.notifyDataSetChanged();

            } catch (DbException e) {
                e.printStackTrace();
            }




        }else{
            SharedPreferences shar=getActivity().getSharedPreferences("CUN",Activity.MODE_PRIVATE);
            SharedPreferences.Editor edit = shar.edit();
            edit.putBoolean("jilu",true);
            edit.commit();
            gethttp();//请求数据
            getinieView();//xlistview布局加载数据

            //跳转进入界面2
            xlisttiaozhuan();
        }



         return view;
    }

    private void xlisttiaozhuan() {
        xListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent=new Intent(getActivity(),MyActivity.class);
                intent.putExtra("url","");//传值，将图片传递过去
                startActivity(intent);

            }
        });


    }

    public static Fragment1 newInstance(int testType) {
        Fragment1 fragment = new Fragment1();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_TYPE, testType);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Bundle bundle = getArguments();
        if (bundle != null) {
            mType = bundle.getInt(ARG_TYPE);
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void getinieView() {

        arr=new ArrayList<>();

        xListView.setPullLoadEnable(true);
        xListView.setPullRefreshEnable(true);
        adapter=new XlistAdapter(getActivity(),arr);
        xListView.setAdapter(adapter);
 xListView.setXListViewListener(this);
        mHandler=new Handler();

    }
//网络请求数据
    public void gethttp() {
        RequestParams params=new RequestParams(url);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson=new Gson();
                Bean bean = gson.fromJson(result, Bean.class);
                 arr.addAll(bean.getData());
                adapter.notifyDataSetChanged();
                App app= (App)getActivity(). getApplication();
                DbManager dbManager = app.getDbManager();
                try {
                    dbManager.save(arr);
                } catch (DbException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    @Override
    public void onRefresh() {
mHandler.postDelayed(new Runnable() {
    @Override
    public void run() {

        start=++refreshCnt;
        arr.clear();
        gethttp();
        adapter.notifyDataSetChanged();
        onLoad();
    }
},2000);

    }

    @Override
    public void onLoadMore() {
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
              gethttp();
                adapter.notifyDataSetChanged();
                onLoad();
            }
        },2000);

    }
    public void onLoad(){
        xListView.stopRefresh();
        xListView.stopLoadMore();
        xListView.setRefreshTime("刚刚");
    }
}

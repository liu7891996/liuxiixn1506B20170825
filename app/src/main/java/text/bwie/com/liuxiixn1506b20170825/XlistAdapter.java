package text.bwie.com.liuxiixn1506b20170825;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;

import java.util.List;

/**
 * 类描述：xlistview适配器类
 * 姓名 ：刘希鑫
 */

public class XlistAdapter extends BaseAdapter {
     private Context context;
         private List<DataBean> arr;

    public XlistAdapter(Context context, List<DataBean> arr) {
        this.context = context;
        this.arr = arr;
    }

    @Override
         public int getCount() {
             return arr==null?0:arr.size();
         }

         @Override
         public Object getItem(int i) {
             return arr.get(i);
         }

         @Override
         public long getItemId(int i) {
             return i;
         }

         @Override
         public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHodle hodle;
             if (view==null){
                 view=View.inflate(context,R.layout.xlist_layout,null);
                   hodle=new ViewHodle();

                 hodle.image_url=view.findViewById(R.id.image_url);
                 hodle.text=view.findViewById(R.id.title);

                 view.setTag(hodle);
             }else {
             hodle= (ViewHodle) view.getTag();
             }
             DataBean dataBean = arr.get(i);
             hodle.text.setText(dataBean.getTitle());
             String article_alt_url = dataBean.getArticle_alt_url();
            //判断是否为空
             if (article_alt_url==null){
                 Glide.with(context).load(R.drawable.xlistview_arrow).into(hodle.image_url);
             }else{
                 GlideCache cache=new GlideCache();

                 Target<Drawable> into = Glide.with(context).load(dataBean.getDisplay_url()).into(hodle.image_url);

             }


             return view;
         }
         class ViewHodle{
           private TextView text;
             private ImageView image_url;


         }

}

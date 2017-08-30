package text.bwie.com.liuxiixn1506b20170825;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * 主类，用viewpager和tablayout布局，fragment复用
 */
@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewInject(R.id.tablayout)
    TabLayout tabLayout;
    @ViewInject(R.id.viewpager)
    ViewPager viewPager;
  private List<Fragment> arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
        initUiAndListeners();  
        
         }

    private void initUiAndListeners() {
        List<String> titles = new ArrayList<>();
        List<Fragment> fragments = new ArrayList<>();
        for (int i=1;i<15;i++){
            titles.add("标题"+i);
         fragments.add(Fragment1.newInstance(i));
        }

     initviewPagerAdapter(fragments,titles);


          }

    private void initviewPagerAdapter(List<Fragment> fragments, List<String> titles) {
        SimpleFragmentAdapter adapter =
                new SimpleFragmentAdapter(getSupportFragmentManager(), fragments, titles);
        viewPager.setOffscreenPageLimit(4);
        viewPager.setAdapter(adapter);
        tabLayout.setHorizontalScrollBarEnabled(true);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setFocusable(true);
    }
}

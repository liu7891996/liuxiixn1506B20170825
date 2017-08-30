package text.bwie.com.liuxiixn1506b20170825;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.List;

/**
 * 类描述：fragmeng与tablayout复用的适配器
 * 姓名 ：刘希鑫
 */

public class SimpleFragmentAdapter extends FragmentPagerAdapter{
    private List<Fragment> mFragments;
    private List<String> mTitles;

    public SimpleFragmentAdapter(FragmentManager fm, List<Fragment> fragments,
                                 List<String> titles) {
        super(fm);
        mFragments = fragments;
        mTitles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }

    @Override
    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        super.setPrimaryItem(container, position, object);

    }
}

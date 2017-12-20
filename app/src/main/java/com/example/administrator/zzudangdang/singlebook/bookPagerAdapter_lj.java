package com.example.administrator.zzudangdang.singlebook;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.administrator.zzudangdang.R;
import com.example.administrator.zzudangdang.util.MyApplication;

import java.util.List;

/**
 * Created by 沐莲心 on 2017/12/18.
 */

public class bookPagerAdapter_lj extends PagerAdapter {
    List<View> viewLists;

    public bookPagerAdapter_lj(List<View> lists) {
        viewLists = lists;
    }
    @Override
    public int getCount() {
        return viewLists.size();
    }
    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == arg1;
    }
    @Override
    public void destroyItem(View view, int position, Object object) {
        ((ViewPager) view).removeView(viewLists.get(position));
    }
    @Override
    public Object instantiateItem(View view, int position) {
        ((ViewPager) view).addView(viewLists.get(position), 0);
        beOrigin();
        switch(view.getId()){
            case R.layout.page1_lj:
                SingleBookActivity.textView1.setTextSize(15);
                SingleBookActivity.textView1.setTextColor(MyApplication.getResource().getColor(R.color.colorSelectedIcon));
                break;
            case R.layout.page2_lj:
                SingleBookActivity.textView2.setTextSize(15);
                SingleBookActivity.textView2.setTextColor(MyApplication.getResource().getColor(R.color.colorSelectedIcon));
                break;
            case R.layout.page3_lj:
                SingleBookActivity.textView3.setTextSize(15);
                SingleBookActivity.textView3.setTextColor(MyApplication.getResource().getColor(R.color.colorSelectedIcon));
                break;
            case R.layout.page4_lj:
                SingleBookActivity.textView4.setTextSize(15);
                SingleBookActivity.textView4.setTextColor(MyApplication.getResource().getColor(R.color.colorSelectedIcon));
                break;
        }

        return viewLists.get(position);
    }
    void beOrigin(){
        SingleBookActivity.textView1.setTextSize(18);
        SingleBookActivity.textView2.setTextSize(18);
        SingleBookActivity.textView3.setTextSize(18);
        SingleBookActivity.textView4.setTextSize(18);
        SingleBookActivity.textView1.setTextColor(MyApplication.getResource().getColor(R.color.color_text_log));
        SingleBookActivity.textView2.setTextColor(MyApplication.getResource().getColor(R.color.color_text_log));
        SingleBookActivity.textView3.setTextColor(MyApplication.getResource().getColor(R.color.color_text_log));
        SingleBookActivity.textView4.setTextColor(MyApplication.getResource().getColor(R.color.color_text_log));
    }

}

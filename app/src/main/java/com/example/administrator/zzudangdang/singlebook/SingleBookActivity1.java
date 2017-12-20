package com.example.administrator.zzudangdang.singlebook;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.zzudangdang.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 沐莲心 on 2017/12/18.
 */

public class SingleBookActivity1 extends AppCompatActivity {
    private ViewPager viewPager;
    private List<View> lists = new ArrayList<View>();
    private bookPagerAdapter_lj bookPagerAdapter_lj;
    private int offSet;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private int currentItem;
    private int bmpW;
    private Animation animation;
    private Matrix matrix = new Matrix();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singlebook);

        textView1 = (TextView) findViewById(R.id.thing);
        textView2 = (TextView) findViewById(R.id.introduce);
        textView3 = (TextView) findViewById(R.id.comments);
        textView4 = (TextView) findViewById(R.id.recommends);
        lists.add(getLayoutInflater().inflate(R.layout.page1_lj, null));
        lists.add(getLayoutInflater().inflate(R.layout.page2_lj, null));
        lists.add(getLayoutInflater().inflate(R.layout.page3_lj, null));
        lists.add(getLayoutInflater().inflate(R.layout.page4_lj, null));
        bookPagerAdapter_lj = new bookPagerAdapter_lj(lists);
        viewPager = (ViewPager) findViewById(R.id.viewpager_lj);
        viewPager.setAdapter(bookPagerAdapter_lj);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            int one = offSet * 2 + bmpW;
            int two = one * 2;
            int three = one * 3;

            @Override
            public void onPageSelected(int arg0) {
                Animation animation = null;
                switch (arg0) {
                    case 0:
                        if (currentItem == 1) {
                            animation = new TranslateAnimation(one, 0, 0, 0);
                        } else if (currentItem == 2) {
                            animation = new TranslateAnimation(two, 0, 0, 0);
                        } else if (currentItem == 3) {
                            animation = new TranslateAnimation(three, 0, 0, 0);
                        }
                        break;
                    case 1:
                        if (currentItem == 0) {
                            animation = new TranslateAnimation(0, one, 0, 0);
                        } else if (currentItem == 2) {
                            animation = new TranslateAnimation(two, one, 0, 0);
                        } else if (currentItem == 3) {
                            animation = new TranslateAnimation(three, one, 0, 0);
                        }
                        break;
                    case 2:
                        if (currentItem == 0) {
                            animation = new TranslateAnimation(0, two, 0, 0);
                        } else if (currentItem == 1) {
                            animation = new TranslateAnimation(one, two, 0, 0);
                        } else if (currentItem == 3) {
                            animation = new TranslateAnimation(three, two, 0, 0);
                        }
                    case 3:
                        if (currentItem == 0) {
                            animation = new TranslateAnimation(0, three, 0, 0);
                        }
                        else if (currentItem == 1) {
                            animation = new TranslateAnimation(one, three, 0, 0);
                        }
                        else if (currentItem == 2) {
                            animation = new TranslateAnimation(two, three, 0, 0);
                        }
                }


                currentItem = arg0;
                animation.setDuration(300);
                animation.setFillAfter(true);
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }


            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                viewPager.setCurrentItem(0);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                viewPager.setCurrentItem(1);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                viewPager.setCurrentItem(2);
            }

        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                viewPager.setCurrentItem(3);
            }

        });

    }


}

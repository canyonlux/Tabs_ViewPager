package com.example.tablayout_viewpager;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

public class CustomPageTransformer implements ViewPager2.PageTransformer {
    @Override
    public void transformPage(View page, float position) {
        page.setRotationY(position * -30);
    }
}


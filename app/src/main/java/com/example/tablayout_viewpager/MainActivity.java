package com.example.tablayout_viewpager;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa el ViewPager2 y el TabLayout
        ViewPager2 viewPager = findViewById(R.id.pager);
        TabLayout tabLayout = findViewById(R.id.appbartabs);

        // Configura el adaptador para el ViewPager2
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager(), getLifecycle());
        viewPager.setAdapter(sectionsPagerAdapter);

        // Configura el TabLayoutMediator para sincronizar TabLayout con ViewPager2
        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("TAB 1");
                    break;
                case 1:
                    tab.setText("TAB 2");
                    break;
                case 2:
                    tab.setText("TAB 3");
                    break;
            }
        }).attach();

        // Configura el oyente para cuando se selecciona una pestaña en TabLayout
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            Fragment fragment;
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new Fragment1();
                        break;
                    case 1:
                        fragment = new Fragment2();
                        break;
                    case 2:
                        fragment = new Fragment3();
                        break;
                }
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_fragment, fragment)
                        .commit();
                if (getSupportActionBar() != null) {
                    getSupportActionBar().setTitle(tab.getText());
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // Implementación opcional para la pestaña no seleccionada
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                // Implementación opcional para la pestaña ya seleccionada nuevamente
            }
        });
    }
}

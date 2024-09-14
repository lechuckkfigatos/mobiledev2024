package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class WeatherActivity extends AppCompatActivity {

    ViewPager2 Pager;
    VPAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        TabLayout tabLayout = findViewById(R.id.tab_layout);

        viewPagerAdapter = new VPAdapter(this);
        Pager = findViewById(R.id.view_pager);
        Pager.setAdapter(viewPagerAdapter);



        viewPagerAdapter.addFragment(new WeatherAndForecastFragment(), getString(R.string.Hanoi));
        viewPagerAdapter.addFragment(new WeatherAndForecastFragment(), getString(R.string.paris));
        viewPagerAdapter.addFragment(new WeatherAndForecastFragment(), getString(R.string.london));

        new TabLayoutMediator(tabLayout, Pager, (tab, position) -> {
            tab.setText(viewPagerAdapter.getTitle(position));
        }).attach();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("lil bro", "bro started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("lil bro", "bro resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("lil bro", "bro paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("lil bro", "bro stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("lil bro", "bro destroyed");
    }
}
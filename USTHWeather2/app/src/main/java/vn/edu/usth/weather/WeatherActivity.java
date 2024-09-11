package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class WeatherActivity extends AppCompatActivity {

    ViewPager2 Pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        VPAdapter adapter = new VPAdapter(this);
        Pager = findViewById(R.id.view_pager);
        Pager.setAdapter(adapter);
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
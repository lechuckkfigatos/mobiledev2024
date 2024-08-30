package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentTransaction;

public class WeatherActivity extends AppCompatActivity {

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        button = findViewById(R.id.frag_button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ForecastFragment forecastFragment = new ForecastFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.container, forecastFragment);
                transaction.commit();
            }
        });
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

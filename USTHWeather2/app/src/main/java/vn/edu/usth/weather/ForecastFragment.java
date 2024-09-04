package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_forecast, container, false);
        view.setBackgroundColor(0x20FF0000);

        LinearLayout ll = new LinearLayout(getContext());
        ll.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        ));
        ll.setOrientation(LinearLayout.VERTICAL);


        TextView textView5 = new TextView(getContext());
        textView5.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        textView5.setGravity(Gravity.CENTER);
        textView5.setText("Weather Forecast Thursday");
        textView5.setTextSize(24);
        textView5.setTextColor(Color.BLACK);



        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        textView.setText("Thursday morning: Storm");
        textView.setTextSize(20);
        textView.setTextColor(Color.BLACK);


        ImageView imageView3 = new ImageView(getContext());
        imageView3.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        imageView3.setImageResource(R.drawable.cyclone2);


        TextView textView3 = new TextView(getContext());
        textView3.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        textView3.setText("Thursday Afternoon: Rainy");
        textView3.setTextSize(20);
        textView3.setTextColor(Color.BLACK);

        ImageView imageView4 = new ImageView(getContext());
        imageView4.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        imageView4.setImageResource(R.drawable.rainyy);

        ll.addView(textView5);
        ll.addView(textView);
        ll.addView(imageView3);
        ll.addView(textView3);
        ll.addView(imageView4);

        return ll;
    }
}




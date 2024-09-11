package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class VPAdapter extends FragmentStateAdapter {
    private final int page_count = 3;

    public VPAdapter(FragmentActivity fa) {
        super(fa);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ForecastFragment();
            case 1:
                return new WeatherFragment();
            case 2:
                return new WeatherAndForecastFragment();
            default:
                return new ForecastFragment();
        }
    }

    @Override
    public int getItemCount() {
        return page_count;
    }
}
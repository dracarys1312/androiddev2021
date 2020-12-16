package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        if (savedInstanceState == null) {
            // During initial setup, plug in the details fragment.
        }

        Log.i("WeatherAcitivity", "onCreate");
        Log.i(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("WeatherAcitivity", "onStart");
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("WeatherAcitivity", "onResume");
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("WeatherAcitivity", "onPause");
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("WeatherAcitivity", "onStop");
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("WeatherAcitivity", "onDestroy");
        Log.i(TAG, "onDestroy");
    }
}

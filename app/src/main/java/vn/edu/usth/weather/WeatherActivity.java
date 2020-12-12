package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("WeatherAcitivity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("WeatherAcitivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("WeatherAcitivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("WeatherAcitivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("WeatherAcitivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("WeatherAcitivity", "onDestroy");
    }
}
package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        if (savedInstanceState == null) {
            // During initial setup, plug in the details fragment.
            //Creating LinearLayout.
            LinearLayout linearlayout = new LinearLayout(this);

            //Setting up LinearLayout Orientation
            linearlayout.setOrientation(LinearLayout.VERTICAL);

            LayoutParams linearlayoutlayoutparams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);

            setContentView(linearlayout, linearlayoutlayoutparams);

            LayoutParams LayoutParamsview = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

            //Creating textview
            TextView SampleTextView = new TextView(this);
            ImageView SampleImageView = new ImageView(this);

            //Adding text to TextView.
            SampleTextView.setText("Thursday");
            SampleImageView.setImageResource(R.drawable.cloudy);
            //Setting TextView text Size
            SampleTextView.setTextSize(25);

            SampleTextView.setLayoutParams(LayoutParamsview);
            SampleImageView.setLayoutParams(LayoutParamsview);
            linearlayout.addView(SampleTextView);
            linearlayout.addView(SampleImageView);

            // create fragment
            Log.i("WeatherActivity","Create Fragment");
            ForecastFragment forecastFragment = new ForecastFragment();

            forecastFragment.setArguments(getIntent().getExtras());

            getSupportFragmentManager().beginTransaction()
                    .add(android.R.id.content, forecastFragment).commit();
        }

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
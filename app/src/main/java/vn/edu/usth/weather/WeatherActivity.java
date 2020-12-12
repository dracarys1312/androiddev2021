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

            //Creating textview .
            TextView SampleTextView1 = new TextView(this);
            TextView SampleTextView2 = new TextView(this);

            //Adding text to TextView.
            SampleTextView1.setText("First TextView Text");
            SampleTextView2.setText("Second TextView Text");

            //Setting TextView text Size
            SampleTextView1.setTextSize(25);
            SampleTextView2.setTextSize(25);

            SampleTextView1.setLayoutParams(LayoutParamsview);
            SampleTextView2.setLayoutParams(LayoutParamsview);

            //Adding textview to linear layout using Add View function.
            linearlayout.addView(SampleTextView1);
            linearlayout.addView(SampleTextView2);

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
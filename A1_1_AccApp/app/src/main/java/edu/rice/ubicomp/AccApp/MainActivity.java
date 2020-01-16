package edu.rice.ubicomp.AccApp;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


import edu.rice.ubicomp.AccApp.HelloApp.R;

public class MainActivity extends AppCompatActivity implements SensorEventListener{

    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private TextView mXAccelerationTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the sensors
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        //mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);


    }

    //@Override
    protected void onResume() {

        super.onResume();
        //mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);

    }

    //when button is clicked
    public void changeText(View view) {

        Log.d("message", "Button Pressed");
        TextView textbox = findViewById(R.id.text1);
        textbox.setText("Button Pressed! Acc start!");
        mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);

    }

    @Override
    public void onSensorChanged(SensorEvent event) {

        Sensor sensor = event.sensor;
        if (sensor.getType() == Sensor.TYPE_ACCELEROMETER)
        {

            if (sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
                float x = event.values[0];

                Log.d("x:", Float.toString(x));

                mXAccelerationTextView = findViewById(R.id.textView_x);

                mXAccelerationTextView.setText(Float.toString(x));
            }

        }

    }



    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {}




}

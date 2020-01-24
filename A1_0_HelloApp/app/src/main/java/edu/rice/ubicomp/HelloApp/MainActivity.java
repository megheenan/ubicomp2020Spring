package edu.rice.ubicomp.HelloApp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import edu.rice.ubicomp.HelloApp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(View view) {
        Log.d("message", "Button Pressed");
        TextView textbox = findViewById(R.id.text1);
        textbox.setText("Button Pressed!");
    }

    //we just implemented the following methods for testing. we don't need them for this Helloapp.
    //you can see how Android activity cycle works in Logcat window if you run the app, go back home, hit a return button,
    //or come back to the app again.

    @Override
    protected void onStart() {
        Log.d("message", "Start");
        super.onStart();

    }

    @Override
    protected void onRestart() {
        Log.d("message", "ReStart");
        super.onRestart();

    }

    @Override
    protected void onResume() {
        Log.d("message", "resume");
        super.onResume();

    }

    @Override
    protected void onPause() {
        Log.d("message", "Pause");
        super.onPause();

    }

    @Override
    protected void onStop() {
        Log.d("message", "Stop");
        super.onStop();

    }


    @Override
    protected void onDestroy() {
        Log.d("message", "Destroy");
        super.onDestroy();

    }

}

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
}

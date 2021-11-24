package com.simplemobiletools.filemanager.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;


public class HelloPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_page2);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String name = editText.getText().toString();
        if(!name.isEmpty()){
            TextView textView = (TextView) findViewById(R.id.textView);

            long currentTime = System.currentTimeMillis();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
            Date date = new Date(currentTime);
            String t = formatter.format(date);
            name = name.length()>15?name.substring(0, 15):name;
            textView.setText("Hello, " + name
                + "\n\nUser: " + System.getProperty("user.name")
                + "\nOS: " + System.getProperty("os.name")
                + "\nTime: " + t
            );
            textView.setTextColor(Color.WHITE);
        }

    }
}

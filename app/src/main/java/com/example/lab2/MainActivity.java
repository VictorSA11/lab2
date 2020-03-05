package com.example.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //


    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, MessageActivity.class);
        EditText editText = findViewById(R.id.text_message);
        intent.putExtra("MESSAGE",  editText.getText().toString());
        startActivity(intent);

    }
}

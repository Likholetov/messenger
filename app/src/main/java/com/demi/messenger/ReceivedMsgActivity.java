package com.demi.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMsgActivity extends AppCompatActivity {

    private TextView textViewReceivedMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_msg);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        textViewReceivedMessage = findViewById(R.id.textViewReceivedMessage);
        textViewReceivedMessage.setText(msg);
    }
}

package com.demi.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMessage = findViewById(R.id.editTextMessage);
    }

    public void onClickSendMessage(View view) {
        String msg = editTextMessage.getText().toString();
        //  Test
        //        Intent intent = new Intent(this, ReceivedMsgActivity.class);
        //        intent.putExtra("msg", msg);
        //        startActivity(intent);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, msg);
        Intent chosenIntent = Intent.createChooser(intent, getString(R.string.choose_app));
        startActivity(chosenIntent);
    }
}

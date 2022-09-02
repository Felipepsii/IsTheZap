package com.example.ozap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.preference.EditTextPreference;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private Button buttonSendMessage;
    private EditText editTextPhoneNumber;
    private EditText editTextMessage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSendMessage = findViewById(R.id.buttonSend);
        editTextMessage= findViewById(R.id.inputTextMessage);
        editTextPhoneNumber = findViewById(R.id.inputTextPhoneNumber);

    }
}

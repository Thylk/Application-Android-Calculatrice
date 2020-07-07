package com.example.tp6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final int CODE_CALCULATRICE = 1;
    Button versCal = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        versCal = (Button)findViewById(R.id.buttonVersCalculatrice);
        versCal.setOnClickListener(clickCal);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == CalculatriceActivity.RESULT_CANCELED) {
            // code to handle cancelled state
        } else if (requestCode == CODE_CALCULATRICE) {
            String returnedResult = data.getData().toString();
            EditText editResult = findViewById(R.id.textResultat);
            editResult.setText(returnedResult);
        }
    }

    public OnClickListener clickCal = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, CalculatriceActivity.class);
            startActivityForResult(intent, CODE_CALCULATRICE);
        }
    };

}

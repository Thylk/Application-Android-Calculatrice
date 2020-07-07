package com.example.tp6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CalculatriceActivity extends AppCompatActivity implements OnClickListener{

    // AFFICHER RESULT AVEC START ACTIVITY
    //public static final String EXTRA_MESSAGE = "com.example.tp6.MESSAGE";

    private TextView textResult;

    private String zero = "0";
    private String un = "1";
    private String deux = "2";
    private String trois = "3";
    private String quatre = "4";
    private String cinq = "5";
    private String six = "6";
    private String sept = "7";
    private String huit = "8";
    private String neuf = "9";
    private final char plus = '+';
    private final char moins = '-';
    private final char mult = '*';
    private final char div = '/';

    private double val1 = Double.NaN;
    private double val2;

    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatrice);

        this.textResult = (TextView) findViewById(R.id.textResult);

        // FACTORY FOR BUTTONS
        Button btn0 = (Button) findViewById(R.id.button0);
        btn0.setOnClickListener(this);

        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(this);

        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);

        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(this);

        Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(this);

        Button btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(this);

        Button btn6 = (Button) findViewById(R.id.button6);
        btn6.setOnClickListener(this);

        Button btn7 = (Button) findViewById(R.id.button7);
        btn7.setOnClickListener(this);

        Button btn8 = (Button) findViewById(R.id.button8);
        btn8.setOnClickListener(this);

        Button btn9 = (Button) findViewById(R.id.button9);
        btn9.setOnClickListener(this);

        Button btnPlus = (Button) findViewById(R.id.buttonplus);
        btnPlus.setOnClickListener(this);

        Button btnMoins = (Button) findViewById(R.id.buttonmoins);
        btnMoins.setOnClickListener(this);

        Button btnMult = (Button) findViewById(R.id.buttonmult);
        btnMult.setOnClickListener(this);

        Button btnDiv = (Button) findViewById(R.id.buttondiv);
        btnDiv.setOnClickListener(this);

        Button btnEgal = (Button) findViewById(R.id.buttonegal);
        btnEgal.setOnClickListener(this);

        Button btnEnvoyerRes = (Button) findViewById(R.id.buttonEnvoyerResult);
        btnEnvoyerRes.setOnClickListener(this);

        Button btnClear = (Button) findViewById(R.id.buttonClear);
        btnClear.setOnClickListener(this);

        this.textResult.setText("");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0:
                if (textResult.getText().toString() == "+") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "-") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "*") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "/") {
                    textResult.setText("");
                }
                textResult.setText(textResult.getText().toString() + zero);
                break;
            case R.id.button1:
                if (textResult.getText().toString() == "+") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "-") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "*") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "/") {
                    textResult.setText("");
                }
                textResult.setText(textResult.getText().toString() + un);
                break;
            case R.id.button2:
                if (textResult.getText().toString() == "+") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "-") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "*") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "/") {
                    textResult.setText("");
                }
                textResult.setText(textResult.getText().toString() + deux);
                break;
            case R.id.button3:
                if (textResult.getText().toString() == "+") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "-") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "*") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "/") {
                    textResult.setText("");
                }
                textResult.setText(textResult.getText().toString() + trois);
                break;
            case R.id.button4:
                if (textResult.getText().toString() == "+") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "-") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "*") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "/") {
                    textResult.setText("");
                }
                textResult.setText(textResult.getText().toString() + quatre);
                break;
            case R.id.button5:
                if (textResult.getText().toString() == "+") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "-") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "*") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "/") {
                    textResult.setText("");
                }
                textResult.setText(textResult.getText().toString() + cinq);
                break;
            case R.id.button6:
                if (textResult.getText().toString() == "+") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "-") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "*") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "/") {
                    textResult.setText("");
                }
                textResult.setText(textResult.getText().toString() + six);
                break;
            case R.id.button7:
                if (textResult.getText().toString() == "+") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "-") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "*") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "/") {
                    textResult.setText("");
                }
                textResult.setText(textResult.getText().toString() + sept);
                break;
            case R.id.button8:
                if (textResult.getText().toString() == "+") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "-") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "*") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "/") {
                    textResult.setText("");
                }
                textResult.setText(textResult.getText().toString() + huit);
                break;
            case R.id.button9:
                if (textResult.getText().toString() == "+") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "-") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "*") {
                    textResult.setText("");
                }
                if (textResult.getText().toString() == "/") {
                    textResult.setText("");
                }
                textResult.setText(textResult.getText().toString() + neuf);
                break;
            case R.id.buttonplus:
                if (textResult.getText().toString() == "/") {
                    textResult.setText("+");
                }
                if (textResult.getText().toString() == "*") {
                    textResult.setText("+");
                }
                if (textResult.getText().toString() == "-") {
                    textResult.setText("+");
                }
                if (textResult.getText().toString() == "+") {
                    break;
                } else {
                    if (textResult.getText().toString() != "") {
                        ACTION = plus;
                        val1 = Double.parseDouble(textResult.getText().toString());
                        textResult.setText("+");
                    } else {
                        textResult.setText("+");
                    }
                }
                break;
            case R.id.buttonmoins:
                if (textResult.getText().toString() == "/") {
                    textResult.setText("-");
                }
                if (textResult.getText().toString() == "*") {
                    textResult.setText("-");
                }
                if (textResult.getText().toString() == "+") {
                    textResult.setText("-");
                }
                if (textResult.getText().toString() == "-") {
                    break;
                } else {
                    if (textResult.getText().toString() != "") {
                        ACTION = moins;
                        val1 = Double.parseDouble(textResult.getText().toString());
                        textResult.setText("-");
                    } else {
                        textResult.setText("-");
                    }
                }
                break;
            case R.id.buttonmult:
                if (textResult.getText().toString() == "/") {
                    textResult.setText("*");
                    break;
                }
                if (textResult.getText().toString() == "+") {
                    textResult.setText("*");
                    break;
                }
                if (textResult.getText().toString() == "-") {
                    textResult.setText("*");
                    break;
                }
                if (textResult.getText().toString() == "*") {
                    break;
                }
                if (textResult.getText().toString() != "") {
                    ACTION = mult;
                    val1 = Double.parseDouble(textResult.getText().toString());
                    textResult.setText("*");
                } else {
                    textResult.setText("*");
                }
                break;
            case R.id.buttondiv:
                if (textResult.getText().toString() == "+") {
                    textResult.setText("/");
                    break;
                }
                if (textResult.getText().toString() == "-") {
                    textResult.setText("/");
                    break;
                }
                if (textResult.getText().toString() == "*") {
                    textResult.setText("/");
                    break;
                }
                if (textResult.getText().toString() == "/") {
                    break;
                }
                if (textResult.getText().toString() != "") {
                    ACTION = div;
                    val1 = Double.parseDouble(textResult.getText().toString());
                    textResult.setText("/");
                } else {
                    textResult.setText("/");
                }
                break;
            case R.id.buttonegal:
                if (textResult.getText() == "") {
                    break;
                }
                if (!Double.isNaN(val1)) {
                    val2 = Double.parseDouble(textResult.getText().toString());

                    switch(ACTION) {
                        case plus:
                            double resultAdd = val1 + val2;
                            textResult.setText(String.valueOf(resultAdd));
                            break;
                        case moins:
                            double resultSub = val1 - val2;
                            textResult.setText(String.valueOf(resultSub));
                            break;
                        case mult:
                            double resultMul = val1 * val2;
                            textResult.setText(String.valueOf(resultMul));
                            break;
                        case div:
                            double resultDiv = val1 / val2;
                            textResult.setText(String.valueOf(resultDiv));
                            break;
                    }
                }
                else {
                    val1 = Double.parseDouble(textResult.getText().toString());
                }
                break;
            case R.id.buttonClear:
                textResult.setText("");
                break;
            case R.id.buttonEnvoyerResult:

                Intent data = new Intent();
                String message = textResult.getText().toString();

                data.setData(Uri.parse(message));
                setResult(RESULT_OK, data);
                finish();

                break;
            default:
                break;
        }
    }

}

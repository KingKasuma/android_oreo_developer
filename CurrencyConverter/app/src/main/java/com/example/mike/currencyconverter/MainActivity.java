package com.example.mike.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){
        Log.i("Info", "Button pressed");

        EditText editText = (EditText) findViewById(R.id.editText);

        String amountPounds = editText.getText().toString();

        double amountInPoundsDouble = Double.parseDouble(amountPounds);

        double amountInDollarsDouble = amountInPoundsDouble * 1.3;

        //String amountInDollarsString = Double.toString(amountInDollarsDouble); //saca el retultado completo
        String amountInDollarsString = String.format("%.2f", amountInDollarsDouble); //redondea a 2 decimales

        Toast.makeText(this, "£" + amountPounds + " is $"+amountInDollarsString, Toast.LENGTH_LONG).show();

        Log.i("Amount in dollars", amountInDollarsString);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

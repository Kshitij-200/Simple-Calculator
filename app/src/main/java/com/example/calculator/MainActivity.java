package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText1 = findViewById(R.id.edittext1);
        EditText editText2 = findViewById(R.id.editext2);
        TextView textView1 = findViewById(R.id.textView);
        Button button1 = findViewById(R.id.sum);
        Button button2 = findViewById(R.id.subtract);
        Button button3 = findViewById(R.id.into);
        Button button4 = findViewById(R.id.divide);
        Objects.requireNonNull(getSupportActionBar()).hide();



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                String no1 = editText1.getText().toString();
                String no2 = editText2.getText().toString();
                if (no1.isEmpty()){
                    editText1.setError("Enter number 1");
                    editText1.requestFocus();
                    return;
                }
                if (no2.isEmpty()){
                    editText2.setError("Enter number 2");
                    editText2.requestFocus();
                    return;
                }
                float sum = Float.parseFloat(no1);
                float sum1 = Float.parseFloat(no2);
                int result = (int) (sum + sum1);
                textView1.setText("sum = " + result);

                Toast.makeText(MainActivity.this, "Sum = " + result, Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no1 = editText1.getText().toString();
                String no2 = editText2.getText().toString();
                if (no1.isEmpty()){
                    editText1.setError("Enter number 1");
                    editText1.requestFocus();
                    return;
                }
                if (no2.isEmpty()){
                    editText2.setError("Enter number 2");
                    editText2.requestFocus();
                    return;
                }
                float sum = Float.parseFloat(no1);
                float sum1 = Float.parseFloat(no2);
                float result = sum - sum1;
                textView1.setText("subtarct = " + result);

                Toast.makeText(MainActivity.this, "Subtraction = " + result, Toast.LENGTH_SHORT).show();

            }
        });
//
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no1 = editText1.getText().toString();
                String no2 = editText2.getText().toString();
                if (no1.isEmpty()){
                    editText1.setError("Enter number 1");
                    editText1.requestFocus();
                    return;
                }
                if (no2.isEmpty()){
                    editText2.setError("Enter number 2");
                    editText2.requestFocus();
                    return;
                }
                float sum = Float.parseFloat(no1);
                float sum1 = Float.parseFloat(no2);
                double  result = (double) sum * sum1;
                textView1.setText("Multiply = " + result);
                Snackbar.make(v,"Multiply = " + result,Snackbar.LENGTH_LONG).show();


            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {

                String no1 = editText1.getText().toString();

                String no2 = editText2.getText().toString();
                if (no1.isEmpty()){
                    editText1.setError("Enter number 1");
                    editText1.requestFocus();
                    return;
                }
                if (no2.isEmpty()){
                    editText2.setError("Enter number 2");
                    editText2.requestFocus();
                    return;
                }

                float sum = Float.parseFloat(no1);
                float sum1 = Float.parseFloat(no2);
                double result = (double)(sum/sum1);
                if (sum1 == 0){
                    textView1.setText("Infinity");
                }else {

                    textView1.setText("Divide = " + result);
                }
                Snackbar.make(v,"Divide = " + result,Snackbar.LENGTH_LONG).show();

//                Snackbar.make(v,R.id.editext2,Snackbar.ANIMATION_MODE_SLIDE).show();
            }
        });
    }
    public void onclick(View view){

    }

}
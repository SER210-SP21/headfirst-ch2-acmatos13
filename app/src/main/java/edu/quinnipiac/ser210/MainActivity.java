package edu.quinnipiac.ser210;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText i1;
    EditText i2;
    TextView res;

    Button add;
    Button subtract;
    Button multiply;
    Button divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button) findViewById(R.id.addition);
        subtract = (Button) findViewById(R.id.subtraction);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.division);

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String value = i1.getText().toString();
                String value2 = i2.getText().toString();

                int number1 = Integer.parseInt(value);
                int number2 = Integer.parseInt(value2);
                res.setText("Result: " + (number1 + number2));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String value = i1.getText().toString();
                String value2 = i2.getText().toString();

                int number1 = Integer.parseInt(value);
                int number2 = Integer.parseInt(value2);
                res.setText("Result: " + (number1 - number2));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String value = i1.getText().toString();
                String value2 = i2.getText().toString();

                int number1 = Integer.parseInt(value);
                int number2 = Integer.parseInt(value2);
                res.setText("Result: " + (number1 * number2));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String value = i1.getText().toString();
                String value2 = i2.getText().toString();

                int number1 = Integer.parseInt(value);
                int number2 = Integer.parseInt(value2);
                res.setText("Result: " + (number1 / number2));
            }
        });

        i1 = (EditText) findViewById(R.id.input1);
        i2 = (EditText) findViewById(R.id.input2);

        res = (TextView) findViewById(R.id.result);
    }
}
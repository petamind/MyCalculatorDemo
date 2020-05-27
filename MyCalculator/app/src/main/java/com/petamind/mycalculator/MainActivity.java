package com.petamind.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onClick(View v) {
        //System.out.println("Button clicked on " + v.toString());
        TextView tv = (TextView) v;
        TextView resultTV = findViewById(R.id.resultTV);
        String oldText = resultTV.getText().toString();
        switch (tv.getText().toString()){
            case "Del":
                if (oldText.length() > 0) {
                    String newText = oldText.substring(0, oldText.length() - 1);
                    resultTV.setText(newText);
                }
                break;
            case "=":
                Infix infix = new Infix();
                String expression = resultTV.getText().toString().replaceAll("x", "*");
                String result = "" + infix.infix(expression);
                resultTV.setText(result);
                break;
            default:
                String toAppendString = tv.getText().toString();
                String newText = oldText + toAppendString;
                resultTV.setText(newText);
                //other buttons
                break;
        }
    }
}

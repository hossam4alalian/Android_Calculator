package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView numbers,result,operation;
    double tempNum=0;
    double answer=0;
    String op="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numbers=(TextView) findViewById(R.id.numbers);
        result=(TextView) findViewById(R.id.result);
        operation=(TextView) findViewById(R.id.op);


        numbers();
        calc();


    }
    public void numbers(){

        Button point=(Button) findViewById(R.id.point);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText()+".");
            }
        });

        Button num1=(Button) findViewById(R.id.btn1);
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText()+"1");
            }
        });

        Button num2=(Button) findViewById(R.id.btn2);
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText()+"2");
            }
        });

        Button num3=(Button) findViewById(R.id.btn3);
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText()+"3");
            }
        });

        Button num4=(Button) findViewById(R.id.btn4);
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText()+"4");
            }
        });

        Button num5=(Button) findViewById(R.id.btn5);
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText()+"5");
            }
        });

        Button num6=(Button) findViewById(R.id.btn6);
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText()+"6");
            }
        });

        Button num7=(Button) findViewById(R.id.btn7);
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText()+"7");
            }
        });

        Button num8=(Button) findViewById(R.id.btn8);
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText()+"8");
            }
        });

        Button num9=(Button) findViewById(R.id.btn9);
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText()+"9");
            }
        });

        Button num0=(Button) findViewById(R.id.btn0);
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText()+"0");
            }
        });

    }
    double lastResult=tempNum;
    Button add;
    public void calc(){
        add=(Button) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringNum=numbers.getText().toString();
                double intNum;
                if(stringNum==""){
                    intNum=0;
                }
                else{
                    intNum= Double.parseDouble(stringNum);
                }

                    tempNum+=intNum;

                operation.setText("+");
                op="+";
                numbers.setText("");
            }
        });

        Button minus=(Button) findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringNum=numbers.getText().toString();
                double intNum;
                if(stringNum==""){
                    intNum=0;
                }
                else{
                    intNum= Double.parseDouble(stringNum);
                }
                add.setBackground(add.getBackground());


                tempNum-=intNum;
                operation.setText("-");
                op="-";
                numbers.setText("");
            }
        });

        Button multiply=(Button) findViewById(R.id.multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringNum=numbers.getText().toString();
                double intNum;
                if(stringNum!=""){
                    intNum= Double.parseDouble(stringNum);
                    tempNum/=intNum;
                }
                else{
                    intNum=tempNum;
                    lastResult*=intNum;
                }
                operation.setText("*");
                op="*";
                numbers.setText("");
            }
        });

        Button devide=(Button) findViewById(R.id.devide);
        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringNum=numbers.getText().toString();
                double intNum;

                if(stringNum!=""){
                    intNum= Double.parseDouble(stringNum);
                    tempNum/=intNum;
                }
                else{
                    intNum=tempNum;
                    lastResult/=intNum;
                }


                operation.setText("/");
                op="/";
                numbers.setText("");
            }
        });

        Button equals=(Button) findViewById(R.id.equals);
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op=="+"){
                    String stringNum=numbers.getText().toString();
                    double intNum= Integer.parseInt(stringNum);
                    tempNum+=intNum;
                }
                if(op=="-"){
                    String stringNum=numbers.getText().toString();
                    double intNum= Integer.parseInt(stringNum);
                    tempNum-=intNum;
                }
                if(op=="/"){
                    String stringNum=numbers.getText().toString();
                    double intNum= Integer.parseInt(stringNum);
                    tempNum/=intNum;
                }
                if(op=="*"){
                    String stringNum=numbers.getText().toString();
                    double intNum= Integer.parseInt(stringNum);
                    tempNum*=intNum;
                }


                result.setText(tempNum+"");
                op="";
                operation.setText("");
                numbers.setText("");
            }
        });

        Button clear=(Button) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op="";
                operation.setText("");
                numbers.setText("");
            }
        });
        Button clearResult=(Button) findViewById(R.id.clearResult);
        clearResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempNum=0;
                result.setText("Results...");
            }
        });

    }

}

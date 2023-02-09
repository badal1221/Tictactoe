package com.example.tiktaktoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,resetscr;
    private TextView textView1,textView2,textView3,textView4;
    int flag=0,count=0;
    private  String TEXT_CONTENTS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        resetscr=findViewById(R.id.resetscr);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textview4);
        textView1.setText("X");
        textView2.setText("O");
        textView3.setText("0");
        textView4.setText("0");
        resetscr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(textView3.getText().toString())>Integer.parseInt(textView4.getText().toString()))
                    Toast.makeText(MainActivity.this, "WINNER IS X", Toast.LENGTH_SHORT).show();
                else if(Integer.parseInt(textView3.getText().toString())<Integer.parseInt(textView4.getText().toString()))
                    Toast.makeText(MainActivity.this, "WINNER IS O", Toast.LENGTH_SHORT).show();
                else
                    if(Integer.parseInt(textView3.getText().toString())==0)
                        Toast.makeText(MainActivity.this, "RESTART", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity.this, "IT'S A DRAW", Toast.LENGTH_SHORT).show();
                textView3.setText("0");
                textView4.setText("0");
                clrr();
            }
        });
    }
    public void clck(View view) {
        Button curbtn=(Button) view;
           if(curbtn.getText().equals("")) {
               count++;
               if (flag == 0) {
                   curbtn.setText("X");
                   flag = 1;
               } else {
                   curbtn.setText("O");
                   flag = 0;
               }
               if (count >= 5) {
                   if (btn1.getText().toString().equals(btn2.getText().toString()) && btn1.getText().toString().equals(btn3.getText().toString()) && !btn1.getText().toString().equals("")) {
                       Toast.makeText(MainActivity.this, "THIS ROUND WINNER IS " + btn1.getText().toString(), Toast.LENGTH_SHORT).show();
                       if(btn1.getText().toString().equals("X"))
                           textView3.setText(String.valueOf(Integer.parseInt(textView3.getText().toString())+1));
                       else
                           textView4.setText(String.valueOf(Integer.parseInt(textView4.getText().toString())+1));
                       bgset(btn1,btn2,btn3);
                       clr();
                   } else if (btn4.getText().toString().equals(btn5.getText().toString()) && btn4.getText().toString().equals(btn6.getText().toString()) && !btn4.getText().toString().equals("")) {
                       Toast.makeText(MainActivity.this, "THIS ROUND WINNER IS " + btn4.getText().toString(), Toast.LENGTH_SHORT).show();
                       if(btn4.getText().toString().equals("X"))
                           textView3.setText(String.valueOf(Integer.parseInt(textView3.getText().toString())+1));
                       else
                           textView4.setText(String.valueOf(Integer.parseInt(textView4.getText().toString())+1));
                       bgset(btn4,btn5,btn6);
                       clr();
                   } else if (btn7.getText().toString().equals(btn8.getText().toString()) && btn7.getText().toString().equals(btn9.getText().toString()) && !btn7.getText().toString().equals("")) {
                       Toast.makeText(MainActivity.this, "THIS ROUND WINNER IS " + btn7.getText().toString(), Toast.LENGTH_SHORT).show();
                       if(btn7.getText().toString().equals("X"))
                           textView3.setText(String.valueOf(Integer.parseInt(textView3.getText().toString())+1));
                       else
                           textView4.setText(String.valueOf(Integer.parseInt(textView4.getText().toString())+1));
                       bgset(btn7,btn8,btn9);
                       clr();
                   } else if (btn1.getText().toString().equals(btn4.getText().toString()) && btn1.getText().toString().equals(btn7.getText().toString()) && !btn1.getText().toString().equals("")) {
                       Toast.makeText(MainActivity.this, "THIS ROUND WINNER IS " + btn1.getText().toString(), Toast.LENGTH_SHORT).show();
                       if(btn1.getText().toString().equals("X"))
                           textView3.setText(String.valueOf(Integer.parseInt(textView3.getText().toString())+1));
                       else
                           textView4.setText(String.valueOf(Integer.parseInt(textView4.getText().toString())+1));
                       bgset(btn1,btn4,btn7);
                       clr();
                   } else if (btn2.getText().toString().equals(btn5.getText().toString()) && btn2.getText().toString().equals(btn8.getText().toString()) && !btn2.getText().toString().equals("")) {
                       Toast.makeText(MainActivity.this, "THIS ROUND WINNER IS " + btn2.getText().toString(), Toast.LENGTH_SHORT).show();
                       if(btn2.getText().toString().equals("X"))
                           textView3.setText(String.valueOf(Integer.parseInt(textView3.getText().toString())+1));
                       else
                           textView4.setText(String.valueOf(Integer.parseInt(textView4.getText().toString())+1));
                       bgset(btn2,btn5,btn8);
                       clr();
                   } else if (btn3.getText().toString().equals(btn6.getText().toString()) && btn3.getText().toString().equals(btn9.getText().toString()) && !btn3.getText().toString().equals("")) {
                       Toast.makeText(MainActivity.this, "THIS ROUND WINNER IS " + btn3.getText().toString(), Toast.LENGTH_SHORT).show();
                       if(btn3.getText().toString().equals("X"))
                           textView3.setText(String.valueOf(Integer.parseInt(textView3.getText().toString())+1));
                       else
                           textView4.setText(String.valueOf(Integer.parseInt(textView4.getText().toString())+1));
                       bgset(btn3,btn6,btn9);
                       clr();
                   } else if (btn1.getText().toString().equals(btn5.getText().toString()) && btn1.getText().toString().equals(btn9.getText().toString()) && !btn1.getText().toString().equals("")) {
                       Toast.makeText(MainActivity.this, "THIS ROUND WINNER IS " + btn1.getText().toString(), Toast.LENGTH_SHORT).show();
                       if(btn1.getText().toString().equals("X"))
                           textView3.setText(String.valueOf(Integer.parseInt(textView3.getText().toString())+1));
                       else
                           textView4.setText(String.valueOf(Integer.parseInt(textView4.getText().toString())+1));
                       bgset(btn1,btn5,btn9);
                       clr();
                   } else if (btn3.getText().toString().equals(btn5.getText().toString()) && btn3.getText().toString().equals(btn7.getText().toString()) && !btn3.getText().toString().equals("")) {
                       Toast.makeText(MainActivity.this, "THIS ROUND WINNER IS " + btn3.getText().toString(), Toast.LENGTH_SHORT).show();
                       if(btn3.getText().toString().equals("X"))
                           textView3.setText(String.valueOf(Integer.parseInt(textView3.getText().toString())+1));
                       else
                           textView4.setText(String.valueOf(Integer.parseInt(textView4.getText().toString())+1));
                       bgset(btn3,btn5,btn7);
                       clr();
                   } else if (count == 9) {
                       Toast.makeText(MainActivity.this, "THIS ROUND IS A DRAW", Toast.LENGTH_SHORT).show();
                       clr();
                   }
               }
           }
    }
    private void clr(){
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE, WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                flag=(flag+1)%2;
                clrr();
            }
        },2000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
            }
        },2000);
    }
    void bgset(Button btnn1,Button btnn2,Button btnn3){
        btnn1.setBackgroundResource(R.drawable.custom_btnn_bg2);
        btnn2.setBackgroundResource(R.drawable.custom_btnn_bg2);
        btnn3.setBackgroundResource(R.drawable.custom_btnn_bg2);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        },2000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                btnn1.setBackgroundResource(R.drawable.custom_btnn_bg);
                btnn2.setBackgroundResource(R.drawable.custom_btnn_bg);
                btnn3.setBackgroundResource(R.drawable.custom_btnn_bg);
            }
        },2000);
    }
    private void clrr(){
        count=0;
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }
}
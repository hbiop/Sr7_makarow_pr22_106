package com.example.sr7_makarow_pr22_106;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CreatePassword extends AppCompatActivity implements View.OnClickListener {
    Button num1,num2,num3,num4,num5,num6,num7,num8,num9,num0;
    ImageView im1, im2 , im3, im4, imBack;
    StringBuilder password;
    TextView skip;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_Sr7_makarow_pr22_106);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_password);
        init();
        checkLength();
    }
    public void init()
    {
        password = new StringBuilder();
        num1 = findViewById(R.id.button11);
        num1.setOnClickListener(this);
        num2 = findViewById(R.id.button3);
        num2.setOnClickListener(this);
        num3 = findViewById(R.id.button2);
        num3.setOnClickListener(this);
        num4 = findViewById(R.id.button12);
        num4.setOnClickListener(this);
        num5 = findViewById(R.id.button6);
        num5.setOnClickListener(this);
        num6 = findViewById(R.id.button5);
        num6.setOnClickListener(this);
        num7 = findViewById(R.id.button13);
        num7.setOnClickListener(this);
        num8 = findViewById(R.id.button8);
        num8.setOnClickListener(this);
        num9 = findViewById(R.id.button9);
        num9.setOnClickListener(this);
        num0 = findViewById(R.id.button10);
        num0.setOnClickListener(this);
        im1 = findViewById(R.id.imageView);
        im2 = findViewById(R.id.imageView3);
        im3 = findViewById(R.id.imageView4);
        im4 = findViewById(R.id.imageView6);
        imBack = findViewById(R.id.imageView5);
        imBack.setOnClickListener(this);
        skip = findViewById(R.id.textView);
        skip.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button11:
                password.append("1");
                checkLength();
                break;
            case R.id.button3:
                password.append("2");
                checkLength();
                break;
            case R.id.button2:
                password.append("3");
                checkLength();
                break;
            case R.id.button12:
                password.append("4");
                checkLength();
                break;
            case R.id.button6:
                password.append("5");
                checkLength();
                break;
            case R.id.button5:
                password.append("6");
                checkLength();
                break;
            case R.id.button13:
                password.append("7");
                checkLength();
                break;
            case R.id.button8:
                password.append("8");
                checkLength();
                break;
            case R.id.button9:
                password.append("9");
                checkLength();
                break;
            case R.id.button10:
                password.append("0");
                checkLength();
                break;
            case R.id.imageView5:
                password.deleteCharAt(password.length() - 1);
                checkLength();
                break;
            case R.id.textView:
                startActivity(new Intent(CreatePassword.this , MainActivity.class));
                break;
        }
    }
    public void checkLength()
    {
        if(password.length() == 0)
        {
            im1.setImageResource(R.drawable.ellipse_58);
            im2.setImageResource(R.drawable.ellipse_58);
            im3.setImageResource(R.drawable.ellipse_58);
            im4.setImageResource(R.drawable.ellipse_58);
        }
        if(password.length() == 1)
        {
            im1.setImageResource(R.drawable.ellipse_57);
            im2.setImageResource(R.drawable.ellipse_58);
            im3.setImageResource(R.drawable.ellipse_58);
            im4.setImageResource(R.drawable.ellipse_58);
        }
        if(password.length() == 2)
        {
            im1.setImageResource(R.drawable.ellipse_57);
            im2.setImageResource(R.drawable.ellipse_57);
            im3.setImageResource(R.drawable.ellipse_58);
            im4.setImageResource(R.drawable.ellipse_58);
        }
        if(password.length() == 3)
        {
            im1.setImageResource(R.drawable.ellipse_57);
            im2.setImageResource(R.drawable.ellipse_57);
            im3.setImageResource(R.drawable.ellipse_57);
            im4.setImageResource(R.drawable.ellipse_58);
        }
        if(password.length() == 4)
        {
            im1.setImageResource(R.drawable.ellipse_57);
            im2.setImageResource(R.drawable.ellipse_57);
            im3.setImageResource(R.drawable.ellipse_57);
            im4.setImageResource(R.drawable.ellipse_57);
            startActivity(new Intent(CreatePassword.this , MainActivity.class));
        }
    }
}

package com.example.sr7_makarow_pr22_106;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Email extends AppCompatActivity implements TextWatcher, View.OnClickListener {
    EditText ed, ed2, ed3, ed4;
    TextView tv1, tv2;
    CountDownTimer timer;
    ImageView back;
    int count;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_Sr7_makarow_pr22_106);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email);
        ed = findViewById(R.id.editTextText);
        ed.addTextChangedListener(this);
        ed2 = findViewById(R.id.editTextText2);
        ed2.addTextChangedListener(this);
        ed3 = findViewById(R.id.editTextText3);
        ed3.addTextChangedListener(this);
        ed4 = findViewById(R.id.editTextText4);
        ed4.addTextChangedListener(this);
        tv1 = findViewById(R.id.textView2);
        tv1.setOnClickListener(this);
        tv2 = findViewById(R.id.textView3);
        back = findViewById(R.id.imageView);
        back.setOnClickListener(this);
        count = 60;
        timer = new CountDownTimer(60000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                count--;
                tv2.setText("будет через "+ count + " секунд");
            }

            @Override
            public void onFinish() {
                tv1.setText("Отправить код");
                tv2.setVisibility(View.INVISIBLE);
            }
        }.start();
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        Boolean FocusChanged = false;
        if(ed.hasFocus() && FocusChanged == false)
        {
            ed2.requestFocus();
            FocusChanged = true;
        }
        if(ed2.hasFocus() && FocusChanged == false)
        {
            ed3.requestFocus();
            FocusChanged = true;
        }
        if(ed3.hasFocus() && FocusChanged == false)
        {
            ed4.requestFocus();
            FocusChanged = true;
        }
        if(ed.getText().length() >0  && ed2.getText().length() >0 && ed3.getText().length() >0 && ed4.getText().length() >0)
        {
            startActivity(new Intent(Email.this, CreatePassword.class));
        }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.textView2:
                if(count == 0)
                {
                    timer.start();
                    tv1.setText("Отправить код повторно можно");
                    tv2.setVisibility(View.VISIBLE);
                    count = 60;
                }
            case R.id.imageView:
                startActivity(new Intent(this,SignIn.class));
        }
    }
}

package com.example.sr7_makarow_pr22_106;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener, TextWatcher{
    Button next;
    EditText editText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_Sr7_makarow_pr22_106);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
        next = findViewById(R.id.next);
        next.setBackgroundColor(getResources().getColor(R.color.btn_deactive));
        next.setOnClickListener(this);
        next.setEnabled(false);
        editText = findViewById(R.id.editTextText);
        editText.setOnTouchListener(this);
        editText.addTextChangedListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.next:
                startActivity(new Intent(SignIn.this, Email.class));
                break;
        }

    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        editText.getText().clear();
        return false;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        if(editText.getText().length() > 0)
        {
            next.setEnabled(true);
            next.setBackgroundColor(getResources().getColor(R.color.btn_active));
        }
        else
        {
            next.setEnabled(false);
            next.setBackgroundColor(getResources().getColor(R.color.btn_deactive));
        }
    }
}

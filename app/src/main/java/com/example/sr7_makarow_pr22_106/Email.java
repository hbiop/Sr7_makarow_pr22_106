package com.example.sr7_makarow_pr22_106;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Email extends AppCompatActivity implements TextWatcher {
    EditText ed, ed2, ed3, ed4;
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
            startActivity(new Intent(Email.this, SignIn.class));
        }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}

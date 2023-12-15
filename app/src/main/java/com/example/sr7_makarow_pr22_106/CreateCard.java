package com.example.sr7_makarow_pr22_106;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CreateCard extends AppCompatActivity implements TextWatcher, View.OnTouchListener {
    Spinner spinner;
    Button next;
    EditText name, familia, otchestvo, data;
    boolean name_change, familia_change, otchestvo_change, data_change;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_Sr7_makarow_pr22_106);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_card);
        spinner = findViewById(R.id.spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.pol_array,R.layout.spinner_dropdown_layout);
        spinner.setAdapter(adapter);
        name = findViewById(R.id.editTextText5);
        familia = findViewById(R.id.editTextText6);
        otchestvo = findViewById(R.id.editTextText7);
        data = findViewById(R.id.editTextText8);
        next = findViewById(R.id.btn_next);
        name.addTextChangedListener(this);
        name.setOnTouchListener(this);
        familia.addTextChangedListener(this);
        familia.setOnTouchListener(this);
        otchestvo.addTextChangedListener(this);
        otchestvo.setOnTouchListener(this);
        data.addTextChangedListener(this);
        data.setOnTouchListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        if(name.getText().length() > 0 && familia.getText().length() > 0 && otchestvo.getText().length() > 0 && data.getText().length() > 0 && name_change && familia_change && otchestvo_change && data_change)
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

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (v.getId())
        {
            case R.id.editTextText5:
                name.getText().clear();
                name_change = true;
                if(familia.getText().length() == 0)
                {
                    familia.setText("Фамилия");
                }
                if(otchestvo.getText().length() == 0)
                {
                    otchestvo.setText("Отчество");
                }
                if(data.getText().length() == 0)
                {
                    data.setText("Дата рождения");
                }
                break;
            case R.id.editTextText6:
                familia.getText().clear();
                familia_change = true;
                if(name.getText().length() == 0)
                {
                    name.setText("Имя");
                    name_change = false;
                }
                if(otchestvo.getText().length() == 0)
                {
                    otchestvo.setText("Отчество");
                    otchestvo_change = false;
                }
                if(data.getText().length() == 0)
                {
                    data.setText("Дата рождения");
                    data_change = false;
                }
                break;
            case R.id.editTextText7:
                otchestvo.getText().clear();
                otchestvo_change = true;
                if(familia.getText().length() == 0)
                {
                    familia.setText("Фамилия");
                    familia_change = false;
                }
                if(name.getText().length() == 0)
                {
                    name.setText("Имя");
                    name_change = false;
                }
                if(data.getText().length() == 0)
                {
                    data.setText("Дата рождения");
                    data_change = false;
                }
                break;
            case R.id.editTextText8:
                data.getText().clear();
                data_change = true;
                if(familia.getText().length() == 0)
                {
                    familia.setText("Фамилия");
                    familia_change = false;
                }
                if(otchestvo.getText().length() == 0)
                {
                    otchestvo.setText("Отчество");
                    otchestvo_change = false;
                }
                if(name.getText().length() == 0)
                {
                    name.setText("Имя");
                    name_change = false;
                }
                break;
        }

        return false;
    }
}

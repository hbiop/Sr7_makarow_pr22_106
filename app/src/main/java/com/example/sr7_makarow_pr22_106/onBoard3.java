package com.example.sr7_makarow_pr22_106;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class onBoard3 extends Fragment {
    ImageView image, image2;
    TextView text, text2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.onboard3, container, false);
        image = (ImageView) view.findViewById(R.id.pic1);
        image2 = (ImageView) view.findViewById(R.id.imageView4);
        text = view.findViewById(R.id.textView);
        text.setText("Мониторинг");
        text2 = view.findViewById(R.id.textView2);
        text2.setText("Наши врачи всегда наблюдают");
        int im = R.drawable.il2;
        image.setImageResource(im);
        im = R.drawable.state3;
        image2.setImageResource(im);
        return view;
    }
}

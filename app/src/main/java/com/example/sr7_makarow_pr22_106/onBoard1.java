package com.example.sr7_makarow_pr22_106;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class onBoard1 extends Fragment {
    ImageView image, image2;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return (ViewGroup)inflater.inflate(R.layout.onboard1,container,false);
        View view = inflater.inflate(R.layout.onboard1, container, false);
        image = (ImageView) view.findViewById(R.id.pic1);
        image2 = (ImageView) view.findViewById(R.id.imageView4);
        int im = R.drawable.illustration;
        image.setImageResource(im);
        im = R.drawable.state1;
        image2.setImageResource(im);
        return view;
    }
}

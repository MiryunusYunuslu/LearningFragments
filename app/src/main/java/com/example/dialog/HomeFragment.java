package com.example.dialog;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class HomeFragment extends Fragment {
    private Button passbutton, b1, b2;
    private Dialog resetpassword;
    private ImageView image;
    private EditText editText;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        passbutton = view.findViewById(R.id.passbutton);
        passbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showresetpassword();
            }
        });
        return view;
    }
    //DIALOGGG
    private void showresetpassword() {
        resetpassword = new Dialog(getContext());
        /*
        WindowManager.LayoutParams params=new WindowManager.LayoutParams();
        params.copyFrom(resetpassword.getWindow().getAttributes());
        params.width=WindowManager.LayoutParams.WRAP_CONTENT;
        params.height=WindowManager.LayoutParams.WRAP_CONTENT;
         */
        resetpassword.setContentView(R.layout.second_layout);
        b1 = resetpassword.findViewById(R.id.button1);
        b2 = resetpassword.findViewById(R.id.button2);
        editText = resetpassword.findViewById(R.id.edit1);
        image = resetpassword.findViewById(R.id.image1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetpassword.dismiss();
            }
        });
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetpassword.dismiss();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(editText.getText().toString())) {
                    Toast.makeText(getContext(), "Your Password Changed", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //resetpassword.getWindow().setAttributes(params);
        resetpassword.show();
    }


}
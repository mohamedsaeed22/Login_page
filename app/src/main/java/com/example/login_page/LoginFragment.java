package com.example.login_page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputLayout;

public class LoginFragment extends Fragment {

    TextInputLayout user, pass;
    TextView forget;
    Button btn_login;
    float i = 0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private void animation() {
        user.setVisibility(View.VISIBLE);
        pass.setVisibility(View.VISIBLE);
        forget.setVisibility(View.VISIBLE);
        btn_login.setVisibility(View.VISIBLE);
        user.setTranslationX(600);
        pass.setTranslationX(800);
        forget.setTranslationX(1000);
        btn_login.setTranslationX(1200);
        user.setAlpha(i);
        pass.setAlpha(i);
        forget.setAlpha(i);
        btn_login.setAlpha(i);
        user.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forget.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        btn_login.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(900).start();
    }

    @Override
    public void onResume() {
        super.onResume();
        animation();
    }


    @Override
    public void onPause() {
        super.onPause();
        user.setVisibility(View.INVISIBLE);
        pass.setVisibility(View.INVISIBLE);
        forget.setVisibility(View.INVISIBLE);
        btn_login.setVisibility(View.INVISIBLE);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup v = (ViewGroup) inflater.inflate(R.layout.fragment_login, container, false);
        user = v.findViewById(R.id.login_et_user);
        pass = v.findViewById(R.id.login_et_pass);
        forget = v.findViewById(R.id.login_tv_forget);
        btn_login = v.findViewById(R.id.login_btn_login);

        animation();

        return v;
    }

}

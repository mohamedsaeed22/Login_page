package com.example.login_page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputLayout;


public class SignupFragment extends Fragment {
    TextInputLayout mail, name, pass, fPass;
    Button signup;
    float i = 0;

    @Override
    public void onResume() {
        super.onResume();
        mail.setVisibility(View.VISIBLE);
        name.setVisibility(View.VISIBLE);
        pass.setVisibility(View.VISIBLE);
        fPass.setVisibility(View.VISIBLE);
        signup.setVisibility(View.VISIBLE);
      setAnimation();
    }

    @Override
    public void onPause() {
        super.onPause();

        mail.setVisibility(View.INVISIBLE);
        name.setVisibility(View.INVISIBLE);
        pass.setVisibility(View.INVISIBLE);
        fPass.setVisibility(View.INVISIBLE);
        signup.setVisibility(View.INVISIBLE);

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup v = (ViewGroup) inflater.inflate(R.layout.fragment_signup, container, false);

        mail = v.findViewById(R.id.et_email);
        name = v.findViewById(R.id.ed_username);
        pass = v.findViewById(R.id.et_password);
        fPass = v.findViewById(R.id.et_fpassword);
        signup = v.findViewById(R.id.btn_signup);

        setAnimation();
        return v;
    }

    void setAnimation(){

        mail.setTranslationX(600);
        name.setTranslationX(800);
        pass.setTranslationX(1000);
        fPass.setTranslationX(1200);
        signup.setTranslationX(1400);

        mail.setAlpha(i);
        pass.setAlpha(i);
        name.setAlpha(i);
        fPass.setAlpha(i);
        signup.setAlpha(i);

        mail.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        name.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        pass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        fPass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(900).start();
        signup.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(1100).start();
    }
}

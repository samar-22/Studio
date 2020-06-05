package com.example.myapplication.view;

import android.os.Bundle;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.interfaces.LoginIF;
import com.example.myapplication.model.User;
import com.example.myapplication.viewModel.UserVM;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class MainActivity extends AppCompatActivity {

    User user = new User("email", "password");
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserVM userVM = new UserVM(new User("email", "password"));
        activityMainBinding.setLogin(userVM);

        activityMainBinding.setLoginEvent(new LoginIF() {
            @Override
            public void onLoginClick() {
                Toast.makeText(MainActivity.this, activityMainBinding.getLogin().getEmail(), Toast.LENGTH_LONG).show();
            }
        });


        //setContentView(R.layout.activity_main);
    }
}

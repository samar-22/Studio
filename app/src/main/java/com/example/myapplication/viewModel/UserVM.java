package com.example.myapplication.viewModel;

import com.example.myapplication.R;
import com.example.myapplication.model.User;

import androidx.databinding.BaseObservable;

public class UserVM extends BaseObservable {


    public String hintEmail;
    public String hintPassword;
    private String email;
    private String Password;

    public UserVM(User user) {
        this.hintEmail = user.hintEmail;
        this.hintPassword = user.hintPassword;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(R.id.emailID);
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
        notifyPropertyChanged(R.id.PwdID);

    }

    public String getHintEmail() {
        return hintEmail;
    }

    public void setHintEmail(String hintEmail) {
        this.hintEmail = hintEmail;
    }

    public String getHintPassword() {
        return hintPassword;
    }

    public void setHintPassword(String hintPassword) {
        this.hintPassword = hintPassword;
    }
}

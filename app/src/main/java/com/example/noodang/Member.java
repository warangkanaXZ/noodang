package com.example.noodang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Member  {
    private String Name;
    private String Gender;

    public Member(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
package com.xuwab.databindingtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.xuwab.databindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding=DataBindingUtil.setContentView(this,R.layout.activity_main);
        user=new User("jone snow",23);
        binding.setUser(user);
        binding.setMain(this);

    }
    public  String printTest1(){
        Toast.makeText(this,"Tom",Toast.LENGTH_LONG).show();
        return "Tom";
    }

    public  void printTest2(){
        Toast.makeText(this,"view",Toast.LENGTH_LONG).show();
    }
    public  void printTest3(String str){
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }
    public void printTest4(String str,boolean isShow){
        if(isShow){
            Toast.makeText(this,str,Toast.LENGTH_LONG).show();
        }
    }
    public void printTestObservable(){

    }
}

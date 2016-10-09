package com.xuwab.databindingtest;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Toast;

import com.xuwab.databindingtest.databinding.ActivityMainBinding;
import com.xuwab.databindingtest.databinding.IncludeBinding;

//import com.xuwab.databindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
//     final User user=new User("jone snow",23);
    private ObservableArrayMap<String,Object> user=new ObservableArrayMap<>();
    private   ActivityMainBinding binding;
    private boolean isVisibility=false;
    private IncludeBinding includeBinding;
    private View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main);
//        setContentView(R.layout.activity_main);
//        ActivityMainBinding binding=ActivityMainBinding.inflate(getLayoutInflater());
        user.put("name","James");
        user.put("age",24);
        binding.setUser(user);
        binding.setMain(this);
        binding.vs.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
                view=inflated;
            }
        });
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
//        user.setName("Hodo");
//        Toast.makeText(MainActivity.this,user.getName(),Toast.LENGTH_LONG).show();
    }
    public void printTestObservableField(){
//        user.mName.set("Sansa");
    }
    public void printTestObservableArrayMap(){
        user.put("name","JamesBrother");
        user.put("age",38);
    }
    public void showViewStub(){
        if(!binding.vs.isInflated()){
            binding.vs.getViewStub().inflate();
        }else {
            if(!isVisibility){
                view.setVisibility(View.VISIBLE);
            }else {
                view.setVisibility(View.GONE);
            }
        }
        isVisibility=!isVisibility;
    }
}

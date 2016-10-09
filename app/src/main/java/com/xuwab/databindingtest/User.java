package com.xuwab.databindingtest;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

/**
 * Created by Administrator on 2016/10/8.
 */

//public class User extends BaseObservable{
public class User {
    public final ObservableField<String> mName=new ObservableField<>();
    public final ObservableField<Integer> mAge=new ObservableField<>();

    public User(String name,int age) {
        mName.set(name);
        mAge.set(age);
    }

    //    private String name;
//    private int age;

//    @Bindable
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//        notifyPropertyChanged(com.xuwab.databindingtest.BR.name);
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public User(String name, int age) {
//
//        this.name = name;
//        this.age = age;
//    }


}

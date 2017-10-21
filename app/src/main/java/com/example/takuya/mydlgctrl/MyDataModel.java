package com.example.takuya.mydlgctrl;

import java.util.Comparator;

/**
 * Created by takuya on 2017/10/21.
 */

public class MyDataModel implements Comparable<MyDataModel> {

    public String name;
    public String adress;
    public String tel;

    @Override
    public int compareTo(MyDataModel d1) {
        return this.tel.compareTo(d1.tel);
        //return d1.tel.compareTo(d2.tel);
        //return d1.name <  ? -1 : 1;
    }
}

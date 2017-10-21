package com.example.takuya.mydlgctrl;

import java.util.Comparator;

/**
 * Created by takuya on 2017/10/22.
 */

public class MyComparator implements Comparator<MyDataModel> {
    @Override
    public int compare(MyDataModel d1, MyDataModel d2) {
        return d1.name.compareTo(d2.name);
        //return d1.name <  ? -1 : 1;
    }
}

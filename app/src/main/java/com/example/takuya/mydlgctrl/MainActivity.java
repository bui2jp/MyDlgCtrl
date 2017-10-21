package com.example.takuya.mydlgctrl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayList<MyDataModel> myDataModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //test data
        myDataModels = new ArrayList<MyDataModel>();

        MyDataModel aaa = new MyDataModel();
        aaa.name = "aaa";
        aaa.adress = "adress 111";
        aaa.tel = "111";

        MyDataModel bbb = new MyDataModel();
        bbb.name = "bbb";
        bbb.adress = "adress 111";
        bbb.tel = "111";

        MyDataModel ccc = new MyDataModel();
        ccc.name = "ccc";
        ccc.adress = "adress 111";
        ccc.tel = "111";

        MyDataModel ddd = new MyDataModel();
        ddd.name = "ddd";
        ddd.adress = "adress 111";
        ddd.tel = "111";

        MyDataModel eee = new MyDataModel();
        eee.name = "eee";
        eee.adress = "adress 111";
        eee.tel = "111";


        myDataModels.add(bbb);
        myDataModels.add(ccc);
        myDataModels.add(ddd);
        myDataModels.add(eee);
        myDataModels.add(aaa);

        for(MyDataModel model : myDataModels){
            Log.d("test",model.name);
        }

        Collections.sort(myDataModels, new MyComparator());
        Log.d("test","Sorted.....");

        for(MyDataModel model : myDataModels){
            Log.d("test",model.name);
        }
    }
}

package com.example.takuya.mydlgctrl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<MyDataModel> myDataModels;

        //test data
        myDataModels = new ArrayList<MyDataModel>();

        MyDataModel aaa = new MyDataModel();
        aaa.name = "aaa";
        aaa.adress = "adress 111";
        aaa.tel = "1";

        MyDataModel bbb = new MyDataModel();
        bbb.name = "bbb";
        bbb.adress = "adress 111";
        bbb.tel = "11";

        MyDataModel ccc = new MyDataModel();
        ccc.name = "ccc";
        ccc.adress = "adress 111";
        ccc.tel = "5";

        MyDataModel ddd = new MyDataModel();
        ddd.name = "3";
        ddd.adress = "adress 111";
        ddd.tel = "2";

        MyDataModel eee = new MyDataModel();
        eee.name = "eee";
        eee.adress = "adress 111";
        eee.tel = "9";


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

        Collections.sort(myDataModels);
        Log.d("test","Sorted222222.....");
        for(MyDataModel model : myDataModels){
            Log.d("test",model.tel);
        }
    }


    @Override
    public void onClick(View view){
        Log.d("onClick","start");
        Toast.makeText(this,"test",Toast.LENGTH_SHORT).show();

        MyDlgFragment dlg = new MyDlgFragment();
        dlg.show(getSupportFragmentManager(),"test");

        Log.d("onClick","end");
    }

}

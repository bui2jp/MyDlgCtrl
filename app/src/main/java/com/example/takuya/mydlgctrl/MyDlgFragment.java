package com.example.takuya.mydlgctrl;

import android.app.Dialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by takuya on 2017/10/22.
 */

public class MyDlgFragment extends DialogFragment{

    @Override
    public void onStart() {
        super.onStart();

        //ArrayAdapterを設定
        //CharSequence[] datalist = {"aaa","bbb","ccc"};
        String[] datalist = {"aaa","bbb","ccc"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getContext(), R.layout.mylistitem, datalist
        );


        ListView listView = (ListView)getDialog().findViewById(R.id.myListView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String msg = position + "番目のアイテムがクリックされました";
                Toast.makeText(getContext(), msg, Toast.LENGTH_LONG).show();
                dismiss();
            }
        });

        //listView.setAdapter(adapter);

        EditText editText = (EditText)getDialog().findViewById(R.id.textViewDlg);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("beforeTextChanged","start");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("onTextChanged","start");
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Log.d("afterTextChanged","start");
            }}
        );
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder
                .setTitle("test title")
                //.setMessage("set Messageでタイトルを設定する")
                .setView(R.layout.mydialogfragment)
//                .setPositiveButton("はい", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        // FIRE ZE MISSILES!
//
//                    }
//                })
//                .setNegativeButton("キャンセル", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        // User cancelled the dialog
//                    }
//                })
        ;


        // Create the AlertDialog object and return it
        return builder.create();
    }
}

package com.report.reportgen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.report.reportgen.ResultCard.Resultlogic;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText name, android, iot, web;
    private Button btnCalc;
    private TextView tview;
    String names;
    Double androidm, iotm, webm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.StName);
        android = findViewById(R.id.Androidm);
        iot = findViewById(R.id.IoTm);
        web = findViewById(R.id.Webm);
        btnCalc = findViewById(R.id.btntotal);
        tview=findViewById(R.id.tview);
        btnCalc.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(name.getText().toString())) {
            name.setError("Enter name");
            return;

        }

        else if (TextUtils.isEmpty(android.getText().toString())) {
            android.setError("Enter android marks");
            return;

        }

       else if (TextUtils.isEmpty(iot.getText().toString())) {
            iot.setError("Enter iot marks");
            return;
        }
       else if (TextUtils.isEmpty(web.getText().toString())) {
            web.setError("Enter web marks");
            return;

        }
        names=name.getText().toString();
        androidm=Double.parseDouble(android.getText().toString());
        iotm=Double.parseDouble(iot.getText().toString());
        webm=Double.parseDouble(web.getText().toString());

        Resultlogic res =new Resultlogic(names,androidm,iotm,webm);

        if(v.getId()==(R.id.btntotal)){

            double per=res.percent();
            String st= res.condition();

            tview.append( (String.valueOf(names + " your percentage is "+ per + " result is " + st + "\n" )));
            clear();


        }


    }
    public void clear(){
        name.setText("");
        android.setText("");
        iot.setText("");
        web.setText("");
    }
}





package com.example.jeso.cetis1084av_app003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et1,et2;
    TextView txtresultado;
    Button btncalcular;

    Integer numero1,numero2,resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.etNum1);
        et2=(EditText) findViewById(R.id.etNum2);
        btncalcular=(Button) findViewById(R.id.btnCalculo);
        txtresultado=(TextView) findViewById(R.id.txtResulatdo);
        btncalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        numero1=Integer.valueOf((et1.getText().toString()));
        numero2=Integer.valueOf((et2.getText().toString()));
        if (numero1>numero2){
            resultado=numero1-numero2;
            txtresultado.setText("El numero "+numero1+" es mayor que el numero "+numero2+" entonces se resta y da "  + resultado.toString());
            Toast.makeText(getApplicationContext(),"El numero mayor es "+ numero1,Toast.LENGTH_LONG).show();
         }
        else if (numero1<numero2){
            resultado=numero1+numero2;
            txtresultado.setText("El numero "+numero1+" es menor que el numero "+numero2+" entonces se suma y da "  +resultado.toString());
            Toast.makeText(getApplicationContext(),"El numero mayor es "+ numero2,Toast.LENGTH_LONG).show();
        }
        }


    }


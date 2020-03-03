package com.example.guia1_hm13054;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2,n3;
    TextView res;
    Button btn1,btn2,btn3;
    Metodos met;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(EditText) findViewById(R.id.lblN1);
        n2=(EditText)findViewById(R.id.lblN2);
        n3=(EditText) findViewById(R.id.lblN3);
        res=(TextView) findViewById(R.id.lblResultado);
        met=new Metodos();
        getSupportActionBar().hide();
    }
    public void Sumar(View v){
        if(verifica(n1.getText().toString(),n2.getText().toString(),n3.getText().toString())){
            return;
        }
        res.setText(met.resultadoSuma(n1.getText().toString()
                ,n2.getText().toString(),n3.getText().toString()));

    }
    public void Restar(View v){
        if(verifica(n1.getText().toString(),n2.getText().toString(),n3.getText().toString())){
            return;
        }
        res.setText(met.resultadoResta(n1.getText().toString()
                ,n2.getText().toString(),n3.getText().toString()));

    }
    public void Multiplicar(View v){
        if(verifica(n1.getText().toString(),n2.getText().toString(),n3.getText().toString())){
            return;
        }
        res.setText(met.resultadoMultiplicacion(n1.getText().toString()
                    ,n2.getText().toString(),n3.getText().toString()));

    }
    private boolean verifica(String texto1,String texto2,String texto3){
        if(texto1.isEmpty() || texto2.isEmpty() || texto3.isEmpty()){
            Toast.makeText(this,"Ingrese un numero",Toast.LENGTH_SHORT).show();
            return true;
        }else{
            return false;
        }
    }



}

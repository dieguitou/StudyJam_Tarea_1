package com.example.enrique.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText cajauno;
    private EditText cajados;
    private Button boton;
    private TextView cajaresulado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajauno=(EditText) findViewById(R.id.cj1);
        cajados=(EditText) findViewById(R.id.cj2);
        cajaresulado=(TextView) findViewById(R.id.rs);
    }
    public  void sumar(View view)
    {
        Toast.makeText(getApplicationContext(),"hola study jump",Toast.LENGTH_LONG).show();
        String cl=cajauno.getText().toString();
        String c2=cajados.getText().toString();
         int a=Integer.parseInt(cl);
         int b=Integer.parseInt(c2);
        int resultado=a+b;

        cajaresulado.setText(""+resultado);
    }
    public  void restar(View view)
    {
        Toast.makeText(getApplicationContext(),"hola study jump",Toast.LENGTH_LONG).show();
        String cl=cajauno.getText().toString();
        String c2=cajados.getText().toString();
        int a=Integer.parseInt(cl);
        int b=Integer.parseInt(c2);
        int resultado=a-b;

        cajaresulado.setText(""+resultado);
    }
    public  void multiplicar(View view)
    {
        Toast.makeText(getApplicationContext(),"hola study jump",Toast.LENGTH_LONG).show();
        String cl=cajauno.getText().toString();
        String c2=cajados.getText().toString();
        int a=Integer.parseInt(cl);
        int b=Integer.parseInt(c2);
        int resultado=a*b;

        cajaresulado.setText(""+resultado);
    }
    public  void dividir(View view)
    {
        Toast.makeText(getApplicationContext(),"hola study jump",Toast.LENGTH_LONG).show();
        String cl=cajauno.getText().toString();
        String c2=cajados.getText().toString();
        double a=Integer.parseInt(cl);
        double b=Integer.parseInt(c2);
        double resultado=a/b;

        cajaresulado.setText(""+resultado);
    }
}

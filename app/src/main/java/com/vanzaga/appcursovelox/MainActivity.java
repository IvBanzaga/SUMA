package com.vanzaga.appcursovelox;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText txt_num1;
    private EditText txt_num2;
    private Button btn_sumar;
    private TextView text_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_num1 = (EditText) findViewById(R.id.txt_num1);
        txt_num2 = (EditText) findViewById(R.id.txt_num2);
        btn_sumar = (Button) findViewById(R.id.btn_sumar);
        text_resultado = (TextView) findViewById(R.id.text_resultado);

        // Configurar el botón para realizar la suma
        /*btn_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sumar();
            }
        });*/

    }

    public void Sumar (View view){

        // Obtener los valores de los EditText
        String valor1 = txt_num1.getText().toString();
        String valor2 = txt_num2.getText().toString();

        // Convertir los valores a enteros
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        // Sumar los valores
        int suma = num1 + num2;

        // Mostrar el resultado en el TextView
        String result = String.valueOf(suma);

        // Asignamos el resultado al TextView
        text_resultado.setText(result);

    }

}
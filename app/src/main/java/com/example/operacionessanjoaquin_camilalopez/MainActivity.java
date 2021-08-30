package com.example.operacionessanjoaquin_camilalopez;
// Biblioteca de clases
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private EditText edit1, edit2;// declaro datos
    private TextView texto;

    //ciclo de vida: onCreate

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText)findViewById(R.id.et1);
        edit2 = (EditText)findViewById(R.id.et2);
        texto = (TextView)findViewById(R.id.tv);
    }
        // suma dos numeros

        public void Suma(View view)
        {
            int num1 = Integer.parseInt(edit1.getText().toString()); //conversion de datos
            int num2 = Integer.parseInt(edit2.getText().toString());
            int resultado = num1 + num2; // hago la suma

            texto.setText("la suma es: " + resultado);
        }
         public void Resta(View view)
        {
            int num1 = Integer.parseInt(edit1.getText().toString()); //conversion de datos
            int num2 = Integer.parseInt(edit2.getText().toString());
            int resultado = num1 - num2; // hago la resta

            texto.setText("la resta es: " + resultado);
        }
        public void Multiplicar(View view)
        {
            int num1 = Integer.parseInt(edit1.getText().toString()); //conversion de datos
            int num2 = Integer.parseInt(edit2.getText().toString());
            int resultado = num1 * num2; // hago la multiplicacion

            texto.setText("la multiplicacion es: " + resultado);
        }
        public void Dividir(View view)
        {
            int num1 = Integer.parseInt(edit1.getText().toString()); //conversion de datos
            int num2 = Integer.parseInt(edit2.getText().toString());
            int resultado = num1 / num2; // hago la division

            texto.setText("la division es: " + resultado);
        }
    }


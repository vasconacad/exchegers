package com.exchengers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario;
    EditText senha;

    Button entrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrar = (Button) findViewById(R.id.buttonEntrar);
        usuario =(EditText) findViewById(R.id.editTextUsuario);
        senha =(EditText) findViewById(R.id.editTextSenha);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("admin".equals(usuario.getText().toString()) && "1234".equals(senha.getText().toString()))
                {
                    startActivity(new Intent(MainActivity.this, TelaSelecao.class));
                } else {
                    Toast messageErros = Toast.makeText(MainActivity.this,
                            "Credenciais inválidas",
                            Toast.LENGTH_LONG);
                    messageErros.show();
                }
            }
        });

    }
}
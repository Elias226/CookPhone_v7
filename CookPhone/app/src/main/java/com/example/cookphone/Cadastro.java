package com.example.cookphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {
    EditText nome, email, senha, data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void voltarLogin(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void salvarCadastro(View view) {
        nome = findViewById(R.id.edt_nome_perfil);
        email = findViewById(R.id.edt_email_perfil);
        senha = findViewById(R.id.edt_senha_perfil);
        data = findViewById(R.id.edt_data_perfil);

        Intent ii = new Intent(this, MainActivity.class);
        ii.putExtra("nomeCadastro", nome.getText().toString());
        ii.putExtra("emailCadastro", email.getText().toString());
        ii.putExtra("senhaCadastro", senha.getText().toString());
        ii.putExtra("dataCadastro", data.getText().toString());

        Toast.makeText(Cadastro.this, "Cadastro finalizado", Toast.LENGTH_SHORT).show();
        startActivity(ii);
    }
}
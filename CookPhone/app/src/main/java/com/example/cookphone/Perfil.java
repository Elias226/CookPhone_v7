package com.example.cookphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Perfil extends AppCompatActivity {

    EditText usuario, email, senha, data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        usuario = findViewById(R.id.edt_nome_perfil);
        email = findViewById(R.id.edt_email_perfil);
        senha = findViewById(R.id.edt_senha_perfil);
        data = findViewById(R.id.edt_data_perfil);
    }

    public void editarUsuario(View view){
        usuario.setEnabled(true);
    }
    public void editarEmail(View view){
        email.setEnabled(true);
    }
    public void editarSenha(View view){
        senha.setEnabled(true);
    }
    public void editarData(View view){
        data.setEnabled(true);
    }

    public void salvarPerfil(View view) {
        Intent i = new Intent(this, TiposReceita.class);

        startActivity(i);
        Toast.makeText(Perfil.this, "Pefil atualizado", Toast.LENGTH_SHORT).show();
    }
}
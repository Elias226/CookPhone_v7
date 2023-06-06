package com.example.cookphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.util.prefs.Preferences;

public class MainActivity extends AppCompatActivity {

    EditText edtNome, edtSenha;

    boolean viewSenha = false;

    ImageButton imgBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle extras = getIntent().getExtras();

        if(extras != null) {
            String s1 = extras.getString("nomeCadastro");
            edtNome = findViewById(R.id.edt_nome_login);
            edtNome.setText(s1);

            edtSenha = findViewById(R.id.edt_senha_login);
        }

        imgBtn = findViewById(R.id.imgbuttonEye);
    }

    public void Entrar(View view) {
        Intent i = new Intent(this, TiposReceita.class);
        startActivity(i);
    }

    public void Cadastro(View view) {
        Intent ii = new Intent(this, Cadastro.class);
        startActivity(ii);
    }

    public void verSenha(View view) {

        if(!viewSenha){
            viewSenha = true;
            imgBtn.setImageResource(R.drawable.eye);
            //edtSenha.setVisibility();
        }else {
            viewSenha = false;
            imgBtn.setImageResource(R.drawable.close_eye);
        }
        //edtSenha.setInputType(edtSenha.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        //edtSenha.getInputType();
        /*if(viewSenha)
            edtSenha.setInputType();
        else */

    }

}
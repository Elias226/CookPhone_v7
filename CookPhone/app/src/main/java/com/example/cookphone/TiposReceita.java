package com.example.cookphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TiposReceita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_receita);
    }

    public void irMenu_Sobremesas(View view) {
        Intent i = new Intent(this, menu.class);
        i.putExtra("selecionador", 0);
        startActivity(i);
    }

    public void irMenu_Massas(View view) {
        Intent i = new Intent(this, menu.class);
        i.putExtra("selecionador", 1);
        startActivity(i);
    }

    public void irMenu_Sanduiches(View view) {
        Intent i = new Intent(this, menu.class);
        i.putExtra("selecionador", 2);
        startActivity(i);
    }

    public void irMenu_Saladas(View view) {
        Intent i = new Intent(this, menu.class);
        i.putExtra("selecionador", 3);
        startActivity(i);
    }
    public void irPerfil(View view) {
        Intent ii = new Intent(this, Perfil.class);
        startActivity(ii);
    }
}
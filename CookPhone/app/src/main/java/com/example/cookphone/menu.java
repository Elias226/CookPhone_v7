package com.example.cookphone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class menu extends AppCompatActivity {


    ArrayList<receitaModelo> receitaModelos = new ArrayList<>();

    int[] imgs_sobremesas = {R.drawable.mingau, R.drawable.brownie, R.drawable.pudim, R.drawable.grand_gateau, R.drawable.mousse,
            R.drawable.banoffee, R.drawable.milkshake, R.drawable.maca_amor, R.drawable.churros, R.drawable.bolo_ninho};

    int[] imgs_massas = {R.drawable.capeletti, R.drawable.conchiglione, R.drawable.empanada, R.drawable.espaguete, R.drawable.lasanha,
            R.drawable.lasanha_quatro_queijos, R.drawable.lasanha_vegana, R.drawable.nhoque, R.drawable.panqueca, R.drawable.ravioli};

    int[] imgs_sanduiches = {R.drawable.sanduiche_almondegas, R.drawable.sanduiche_baicon_queijo_ovo, R.drawable.sanduiche_frango, R.drawable.sanduiche_lagosta, R.drawable.sanduiche_linguica,
            R.drawable.sanduiche_atum, R.drawable.sanduiche_pernil, R.drawable.sanduiche_peru, R.drawable.sanduiche_saladas, R.drawable.sanduiche_salame};

    int[] imgs_saladas = {R.drawable.salada_arabe, R.drawable.salada_carne_desfiada, R.drawable.salada_cesar_camarao, R.drawable.salada_couve_flor, R.drawable.salada_frango_desfiado,
            R.drawable.salada_marroquina_cenoura, R.drawable.salada_morango, R.drawable.salada_ovos, R.drawable.salada_pessego, R.drawable.salada_soja};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Bundle extras = getIntent().getExtras();
        int selecionador = extras.getInt("selecionador");

        setUpReceitasModelos(selecionador);
        RecyclerView rv = findViewById(R.id.meuRecyclerView);
        RS_RecyclerViewAdapter receitaAdapter = new RS_RecyclerViewAdapter(receitaModelos);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(layoutManager);
        //rv.setHasFixedSize(true);
        //rv.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));
        rv.setAdapter(receitaAdapter);
    }

    private void setUpReceitasModelos(int selecionador) {

        String[] nomes = null;
        String[] notas = null;

        int[] imgs = null;

        if(selecionador == 0){
            nomes = getResources().getStringArray(R.array.receita_sobremesa_nome);
            notas = getResources().getStringArray(R.array.receita_sobremesa_nota);
            imgs = imgs_sobremesas;
        }else if(selecionador == 1) {
            nomes = getResources().getStringArray(R.array.receita_massas_nome);
            notas = getResources().getStringArray(R.array.receita_massas_nota);
            imgs = imgs_massas;
        }else if(selecionador == 2) {
            nomes = getResources().getStringArray(R.array.receita_sanduiches_nome);
            notas = getResources().getStringArray(R.array.receita_sanduiches_nota);
            imgs = imgs_sanduiches;
        }else if(selecionador == 3){
            nomes = getResources().getStringArray(R.array.receita_salada_nome);
            notas = getResources().getStringArray(R.array.receita_salada_nota);
            imgs = imgs_saladas;
        }

        for(int i = 0; i < nomes.length; i++) {
            receitaModelos.add(new receitaModelo(nomes[i], notas[i], imgs[i]));
        }
    }
}
package com.example.cookphone;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class receitaModelo {
    private String nome;
    private String nota;
    private int img;

    public receitaModelo(String nome, String nota, int img) {
        this.nome = nome;
        this.nota = nota;
        this.img = img;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}

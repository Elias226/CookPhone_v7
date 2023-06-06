package com.example.cookphone;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.time.Instant;
import java.util.List;

public class RS_RecyclerViewAdapter extends RecyclerView.Adapter<RS_RecyclerViewAdapter.MyViewHolder> {

    private List<receitaModelo> listaReceitas;

    public RS_RecyclerViewAdapter(List<receitaModelo> listaReceitas) {
        this.listaReceitas = listaReceitas;
    }

    @NonNull
    @Override
    public RS_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemReceita = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_row, parent, false);
        return new MyViewHolder(itemReceita);
    }

    @Override
    public void onBindViewHolder(@NonNull RS_RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.txtNome.setText(String.valueOf(listaReceitas.get(position).getNome()));
        holder.txtNota.setText(String.valueOf(listaReceitas.get(position).getNota()));
        holder.imgReceita.setImageResource(listaReceitas.get(position).getImg());
        holder.imgReceita.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), receita.class);
                i.putExtra("imgReceita", listaReceitas.get(position).getImg());

            }
        });
    }

    @Override
    public int getItemCount() {
        //RETORNA O NUMERO DE LINHAS O RECYCLERVIEW
        return listaReceitas.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txtNome;
        TextView txtNota;
        ImageView imgReceita;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNome = (TextView) itemView.findViewById(R.id.txt_nome_receita_menu);
            txtNota = (TextView) itemView.findViewById(R.id.txt_nota_receita_menu);
            imgReceita = (ImageView) itemView.findViewById(R.id.img_receita_menu);
        }
    }
}
package com.example.prova3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NoticiasAdapter extends RecyclerView.Adapter<NoticiasAdapter.ViewHolder>{
    private List<Noticias> noticiasList;

    public NoticiasAdapter(List<Noticias>list){
        this.noticiasList = list;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView titulo, descricao;

        public ViewHolder(View view) {
            super(view);
            titulo = view.findViewById(R.id.text_noticia);
            /*descricao = view.findViewById(R.id.text_mais);*/
        }
    }
    @NonNull
    @Override
    public NoticiasAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoticiasAdapter.ViewHolder holder, int position) {
        Noticias noticiario = noticiasList.get(position);
        holder.titulo.setText(noticiario.getTitulo());
        /*holder.descricao.setText(noticiario.getDescricao());*/
    }

    @Override
    public int getItemCount() {
        return noticiasList.size();
    }
}

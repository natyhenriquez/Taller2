package com.example.taller2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.PeliculaViewHolder> {

    private List<Pelicula> listaPeliculas;

    public PeliculaAdapter(List<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    @NonNull
    @Override
    public PeliculaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pelicula, parent, false);
        return new PeliculaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PeliculaViewHolder holder, int position) {
        Pelicula pelicula = listaPeliculas.get(position);
        holder.txtTitulo.setText(pelicula.getTitulo());
        holder.txtGenero.setText(pelicula.getGenero());
        holder.txtAnio.setText(pelicula.getAnio());
        holder.imgPelicula.setImageResource(pelicula.getImagenResId());
    }

    @Override
    public int getItemCount() {
        return listaPeliculas.size();
    }

    public static class PeliculaViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitulo, txtGenero, txtAnio;
        ImageView imgPelicula;

        public PeliculaViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtGenero = itemView.findViewById(R.id.txtGenero);
            txtAnio = itemView.findViewById(R.id.txtAnio);
            imgPelicula = itemView.findViewById(R.id.imgPelicula);
        }
    }
}
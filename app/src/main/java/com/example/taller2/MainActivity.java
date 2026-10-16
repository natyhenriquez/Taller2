package com.example.taller2;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PeliculaAdapter peliculaAdapter;
    private List<Pelicula> peliculaList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewPeliculas);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        peliculaList = new ArrayList<>();
        peliculaList.add(new Pelicula("Interestelar", "2014", "Ciencia Ficción / Drama", R.drawable.terestelr));
        peliculaList.add(new Pelicula("Ferris Bueller's Day Off", "1986", "Comedia", R.drawable.f51e0d6a95ab522e3d04538e460629eb));
        peliculaList.add(new Pelicula("Evil dead", "1981", "Terror", R.drawable.evildead));
        peliculaList.add(new Pelicula("Spider-Man: Into the Spider-Verse", "2018", "Acción / Aventura", R.drawable.spiderman));
        peliculaList.add(new Pelicula("Pulp Fiction", "1994", "Crimen / Comedia negra", R.drawable.pulp));
        peliculaList.add(new Pelicula("A Nightmare on Elm Street", "1984", "Terror / Crimen", R.drawable.elmstreet));

        peliculaAdapter = new PeliculaAdapter(peliculaList);
        recyclerView.setAdapter(peliculaAdapter);
    }
}
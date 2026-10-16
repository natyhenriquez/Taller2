package com.example.taller2;

public class Pelicula {
    private String titulo;
    private String anio;
    private String genero;
    private int imagenResId;

    public Pelicula(String titulo, String anio, String genero, int imagenResId) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
        this.imagenResId = imagenResId;
    }
    public String getTitulo() { return titulo; }
    public String getAnio() { return anio; }
    public String getGenero() { return genero; }
    public int getImagenResId() { return imagenResId; }
}

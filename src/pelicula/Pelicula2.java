
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula;

/**
 *
 * @author estuam
 */
public class Pelicula2 {
public String titulo;
    public String genero;
    public double duracion;
    public String autor;


public void mostrarinformacion (){
    System.out.println("titulo:" + this.titulo + "genero" + this.genero + "autor" + this.autor + "duracion" + this.duracion);
}

public void reproducir () {
    System.out.println("titulo:" + this.titulo);
    }
}


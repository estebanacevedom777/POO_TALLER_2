/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pelicula;

/**
 *
 * @author estuam
 */
public class Pelicula {

public static void main(String[] args) {
       Pelicula2 pista= new Pelicula2 ();
       
       pista.titulo = "volver al futuro";
       pista.genero = "ficcion";
       pista.autor = "Steven Spilberg";
       pista.duracion = 1.56;
       
       pista.mostrarinformacion();
       pista.reproducir();
       
    }
}
 
  
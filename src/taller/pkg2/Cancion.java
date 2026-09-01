/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg2;

/**
 *
 * atributos y sus tipos
 */
public class Cancion {
public String titulo;
public String artista;
public double duracion;    
/**
 *
 * muestra la informacion ingresada
 */
public void mostarInformacion (){
System.out.println("el artista es: " + this.artista + "el titulo es: " + this.titulo + "tiene una duracion de" + this.duracion );
}
/**
 *
 * reproduce la Cancion
 */
public void reproducir (){
    System.out.println("Reproduciendo..."+ this.titulo);
}
}

    


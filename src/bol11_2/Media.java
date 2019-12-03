/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol11_2;

import java.util.Scanner;

/**
 *
 * @author Josemolamazo
 */
public class Media {
    private String nom;
    private String autor;
    private int duradaSegons;
    
    public Media(){
    
    }
    public Media(String nome, String aut, int ds){
        nom = nome;
        autor = aut;
        duradaSegons = ds;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuradaSegons() {
        return duradaSegons;
    }

    public void setDuradaSegons(int duradaSegons) {
        this.duradaSegons = duradaSegons;
    }
    public void metodo(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Teclee nome: ");
        setNom(sc.next());
        System.out.println("Teclee autor: ");
        setAutor(sc.next());
        System.out.println("Teclee durada: ");
        setDuradaSegons(sc.nextInt());
        System.out.println("Datos: "+"\n"+getNom()+"\n"+getAutor()+"\n"+getDuradaSegons());
    }
    
}

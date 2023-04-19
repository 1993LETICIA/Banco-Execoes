/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lehvi
 */
public class GerenciadorDeImpostoDeRenda {
     private double total;

    public void adiciona (Tributavel t) {
        System.out.println("Adicionando taxa tributária: " + t);
        this.total += t.calculaTributos();
    }

    public double getTotal () {
        return this.total;

    }
}

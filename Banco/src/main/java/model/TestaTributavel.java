/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
public class TestaTributavel {
    public static void main(String[] args) throws ValorInvalidoException {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        cc.calculaTributos();
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
        

    }
}


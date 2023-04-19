/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lehvi
 */
public class Main {

    public static void main(String[] args) throws ValorInvalidoException {
    
    ContaCorrente cc = new ContaCorrente();
    ContaPoupanca cp = new ContaPoupanca();

    cc.deposita(1000);
    cp.deposita(1000);

    AtualizadorDeContas adc = new AtualizadorDeContas(0.10);
    adc.roda(cc);
    adc.roda(cp);
    System.out.println("\nSaldo Total: " + adc.getSaldoTotal());
  }
}
    


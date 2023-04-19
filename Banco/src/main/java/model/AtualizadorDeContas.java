/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lehvi
 */
public class AtualizadorDeContas {
  private double saldoTotal = 0;
  private double selic;
  
  public AtualizadorDeContas(double selic) {
    this.selic = selic;
  }
  
  public void roda(Conta c) {
    System.out.println("\nSaldo anterior: " + c.getSaldo());
    c.atualiza(selic);
    System.out.println("Saldo final: " + c.getSaldo());
    saldoTotal += c.getSaldo();
  }
  
  public double getSaldoTotal() {
    return saldoTotal;
  }
}


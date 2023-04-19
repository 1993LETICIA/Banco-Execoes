/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lehvi
 */

public abstract class Conta {
    protected double saldo;

    public void deposita(double valor) throws ValorInvalidoException {
        if (valor < 0) {
            throw new ValorInvalidoException(valor);
        } else {
            this.saldo += valor - 0.10;
        }
    }

  public abstract void atualiza(double taxaSelic);

  public double getSaldo() {
    return this.saldo;
  }
}



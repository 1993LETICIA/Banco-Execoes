/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lehvi
 */
public class ContaPoupanca extends Conta {
  @Override
  public void atualiza(double taxa) {
      try {
          super.deposita(this.getSaldo() * taxa * 3);
      } catch (ValorInvalidoException ex) {
          Logger.getLogger(ContaPoupanca.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
}

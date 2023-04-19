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
public class ContaCorrente extends Conta implements Tributavel{
    @Override
    public void atualiza(double taxa) {
        try {
            super.deposita(this.getSaldo() * taxa * 2);
        } catch (ValorInvalidoException ex) {
            Logger.getLogger(ContaCorrente.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            super.deposita(-1);
        } catch (ValorInvalidoException ex) {
            Logger.getLogger(ContaCorrente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
  }

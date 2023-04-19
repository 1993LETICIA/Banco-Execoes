/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lehvi
 */
public class TestaDeposita {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        try {
            cp.deposita(-100);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}


/*A tentativa de depósito de um valor negativo é realizada dentro do bloco try.
Caso seja lançada uma exceção do tipo IllegalArgumentException, o bloco catch será executado, 
exibindo uma mensagem de erro.

Com a utilização do try/catch, 
o programa trata o erro de depósito de um valor inválido sem interromper sua execução.*/

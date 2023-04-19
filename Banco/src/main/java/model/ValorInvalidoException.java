/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lehvi
 */

 
public class ValorInvalidoException extends Exception {
    public ValorInvalidoException(double valor) {
        super("Valor inválido: " + valor);
    }
}



/* A exceção ValorInvalidoException é uma exceção verificada (checked exception), 
o que significa que ela precisa ser tratada ou declarada na assinatura do método que a lança.
Isso pode tornar o código mais verboso, 
mas também mais seguro, pois nos a lidar com possíveis erros.*/







/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.aula02;

import br.edu.ifms.LoginChain.*;
import br.edu.ifms.usuario.Usuario;

/**
 *
 * @author Délcio
 */
public class Teste {
    
    public static void main (String[] args){
        Usuario u0 = new Usuario();
        u0.nome = "José Luiz";
        u0.login = "joselui2";
        u0.senha = "Senha5enh@";
        
        Validador val0 = new LoginAlfaNumerico();
        Validador val1 = new LoginSeisChar();
        Validador val2 = new LoginPrimeiraLetra();
        Validador val3 = new LoginConterNumero();
        Validador val4 = new SenhaOitoChar();
        Validador val5 = new SenhaMaiusculaMinuscula();
        Validador val6 = new SenhaConterNumero();
        Validador val7 = new SenhaCaractereEspecial();
        
        // Definindo a cadeia de objetos que vai validar o login e a senha
        // do usuário
        val0.setProximo(val1);
        val1.setProximo(val2);
        val2.setProximo(val3);
        val3.setProximo(val4);
        val4.setProximo(val5);
        val5.setProximo(val6);
        val6.setProximo(val7);
        
        if (val0.validar(u0) == true){
            System.out.println("Login e senha validados");
        }
        else {
            System.out.println("Algo deu errado");
        }
    }
    
}

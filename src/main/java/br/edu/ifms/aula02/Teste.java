/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.aula02;

import br.edu.ifms.loginChain.*;
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
        u0.senha = "Senha5enha";
        
        Validador val0 = new LoginAlfanumerico();
        Validador val1 = new LoginOitoChar();
        Validador val2 = new SenhaAlfanumerica();
        Validador val3 = new SenhaOitoChar();
        
        // Definindo a cadeia de objetos que vai validar o login e a senha
        // do usuário
        val0.setProximo(val1);
        val1.setProximo(val2);
        val2.setProximo(val3);
        
        if (val0.validar(u0) == true){
            System.out.println("Login e senha validados");
        }
        else {
            System.out.println("Algo deu errado");
        }
    }
    
}

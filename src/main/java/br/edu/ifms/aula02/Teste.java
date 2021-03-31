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
 * @author lsurq
 */
public class Teste {
    
    public static void main (String[] args){
        Usuario u0 = new Usuario();
        u0.nome = "José Luiz";
        u0.login = "joseluiz";
        u0.senha = "senha12345@";
        
        LoginOitoChar val0 = new LoginOitoChar();
        SenhaOitoChar val1 = new SenhaOitoChar();
        LoginAlfanumerico val2 = new LoginAlfanumerico();
        SenhaAlphanumerica val3 = new SenhaAlphanumerica();
        
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

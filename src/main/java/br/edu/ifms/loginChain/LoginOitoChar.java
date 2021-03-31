/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loginChain;

import br.edu.ifms.usuario.Usuario;

/**
 *
 * @author lsurq
 */
public class LoginOitoChar implements Validador {
    
    private Validador proximo;
    
    /**
     * Verifica se o login do usuário tem pelo menos 8 caracteres
     * @param usuario
     * @return true ou false
     */    
    @Override
    public boolean validar(Usuario usuario) {
       if (usuario.login.length() >= 8){
           if (this.proximo == null)
               return true;
           else 
               return this.proximo.validar(usuario);
       } 
       else{
           System.out.println("O login deve ter pelo menos 8 caracateres");
           return false;
       }
    }
    
    @Override
    public void setProximo (Validador proximo){
        this.proximo = proximo;
    }
}

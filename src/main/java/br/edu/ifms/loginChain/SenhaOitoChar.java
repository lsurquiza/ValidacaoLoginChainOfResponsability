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
public class SenhaOitoChar implements Validador {
    
    private Validador proximo;

    @Override
    public boolean validar(Usuario usuario) {
      if (usuario.senha.length() >= 8){
           if (this.proximo == null)
               return true;
           else 
               return this.proximo.validar(usuario);
       } 
       else{
           System.out.println("A senha deve ter pelo menos 8 caracateres");
           return false;
       }
    }
    
    @Override
    public void setProximo (Validador proximo){
        this.proximo = proximo;
    }
}

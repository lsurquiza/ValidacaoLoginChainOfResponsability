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
public class SenhaAlphanumerica implements Validador {

    private Validador proximo;
    
    @Override
    public boolean validar(Usuario usuario) {
        if (usuario.senha.matches("[0-9a-zA-Z]*") == true){
            if (this.proximo == null)
                return true;
            else 
                return this.proximo.validar(usuario);
        }
        else {
            System.out.println("A senha deve conter caracteres alphanuméricos");
            return false;
        }
    }

    @Override
    public void setProximo(Validador proximo) {
        this.proximo = proximo;
    }
    
}

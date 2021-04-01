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
public interface Validador {
    
    public boolean validar (Usuario usuario);
    public void setProximo (Validador proximo);
    
}

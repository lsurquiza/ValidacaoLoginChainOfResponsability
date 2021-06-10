package br.edu.ifms.LoginChain;

import br.edu.ifms.usuario.Usuario;

public interface Validador {

	public boolean validar (Usuario usuario);
	public void setProximo(Validador proximo);
}

package br.edu.ifms.LoginChain;

import br.edu.ifms.usuario.Usuario;

/**
 *
 * @author lsurq
 */
public class SenhaOitoChar implements Validador {
	
	private Validador proximo;

	@Override
	public boolean validar(Usuario usuario) {
		if(usuario.senha.length() >= 8 ) {
			if(this.proximo == null) {
				return true;
			}
			else {
				return this.proximo.validar(usuario);
			}
		}
		else {
			System.out.println("A senha deve ter pelo menos 8 caracteres");
			return false;
		}
		
	}

	public Validador getProximo() {
		return proximo;
	}

	public void setProximo(Validador proximo) {
		this.proximo = proximo;
	}
	
	

}

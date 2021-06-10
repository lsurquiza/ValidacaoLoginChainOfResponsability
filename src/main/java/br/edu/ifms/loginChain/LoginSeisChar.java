package br.edu.ifms.LoginChain;

import br.edu.ifms.usuario.Usuario;

public class LoginSeisChar implements Validador{
	
	private Validador proximo;	
	
	/*
	 * Verifica se o login do usuario tem 6 caracteres!
	 */

	@Override
	public boolean validar(Usuario usuario) {
		if(usuario.login.length() >= 6 ) {
			if(this.proximo == null) {
				return true;
			}
			else {
				return this.proximo.validar(usuario);
			}
		}
		else {
			System.out.println("O login deve ter pelo menos 6 caracteres");
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

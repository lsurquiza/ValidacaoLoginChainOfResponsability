package br.edu.ifms.LoginChain;

import br.edu.ifms.usuario.Usuario;

public class LoginPrimeiraLetra implements Validador{

	private Validador proximo;
	
	@Override
	public boolean validar(Usuario usuario) {
		if(usuario.login.substring(0,1).matches("[a-zA-Z]")) {
			if(this.proximo == null) {
				return true;
			}
			else {
				return this.proximo.validar(usuario);
			}
		}
		else {
			System.out.println("O primeiro caractere do login deve ser uma letra");
			return false;
		}

	}

	@Override
	public void setProximo(Validador proximo) {
		this.proximo = proximo;
	}

	public Validador getProximo() {
		return proximo;
	}

}

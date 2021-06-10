package br.edu.ifms.LoginChain;

import br.edu.ifms.usuario.Usuario;

public class LoginConterNumero implements Validador {

	private Validador proximo;
	boolean numero; 
	
	@Override
	public boolean validar(Usuario usuario) {
		
		for(char l : usuario.login.toCharArray()) {
			if(l >= '0' && l <= '9') {
				numero = true;
			}
		}
		
		if(numero) {
			if(this.proximo == null) {
				return true;
			}
			else {
				return this.proximo.validar(usuario);
			}
		}
		else {
			System.out.println("O login deve conter pelo menos um numero");
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

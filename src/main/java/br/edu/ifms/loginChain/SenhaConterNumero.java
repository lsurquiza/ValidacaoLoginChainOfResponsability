package br.edu.ifms.LoginChain;

import br.edu.ifms.usuario.Usuario;

public class SenhaConterNumero implements Validador {

	private Validador proximo;
	
	@Override
	public boolean validar(Usuario usuario) {
		boolean numero = false;
		
		for(char s : usuario.senha.toCharArray()) {
			if(s >= '0' && s <= '9') {
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
			System.out.println("A senha deve conter pelo menos um numero");
			return false;
		}
	}

	@Override
	public void setProximo(Validador proximo) {
		this.proximo = proximo;
	}

}

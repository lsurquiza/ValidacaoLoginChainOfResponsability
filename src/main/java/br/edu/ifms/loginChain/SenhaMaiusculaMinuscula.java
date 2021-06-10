package br.edu.ifms.LoginChain;

import br.edu.ifms.usuario.Usuario;

public class SenhaMaiusculaMinuscula implements Validador {

	private Validador proximo;
	
	@Override
	public boolean validar(Usuario usuario) {
		
		boolean maiuscula = false;
		boolean minuscula = false;
		
		for(char s : usuario.senha.toCharArray()) {
			if(s >= 'A' && s <= 'Z') {
				maiuscula = true;
			} else if(s >= 'a' && s <= 'z') {
				minuscula = true;
			}
		}
		
		if(maiuscula && minuscula) {
			if(this.proximo == null) {
				return true;
			}
			else {
				return this.proximo.validar(usuario);
			}
		}
		else {
			System.out.println("A senha deve conter letras maiusculas e minusculas");
			return false;
		}		
	}

	@Override
	public void setProximo(Validador proximo) {
		this.proximo = proximo;
	}

}

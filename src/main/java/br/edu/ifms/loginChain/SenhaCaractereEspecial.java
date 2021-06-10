package br.edu.ifms.LoginChain;

import br.edu.ifms.usuario.Usuario;

public class SenhaCaractereEspecial implements Validador {

	private Validador Proximo;
	
	@Override
	public boolean validar(Usuario usuario) {
		boolean especial = false;
		
		for(char e : usuario.senha.toCharArray()) {
			if(e == '@' || e == '$' || e == '%' || e == '&' || e == '!') {
				especial = true;
			}
		}
		
		if(especial) {
			if(this.Proximo == null) {
				return true;
			}
			else {
				return this.Proximo.validar(usuario);
			}
		}
		else {
			System.out.println("A senha deve conter um desses caracteres especiais: @, $, %, &, !");
			return false;
		}
	}

	@Override
	public void setProximo(Validador proximo) {
		this.Proximo = proximo;
	}

}

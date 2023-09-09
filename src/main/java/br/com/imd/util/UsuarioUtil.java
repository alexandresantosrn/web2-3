package br.com.imd.util;

import java.util.ArrayList;
import java.util.List;

import br.com.imd.domain.Usuario;
import br.com.imd.repositories.UsuarioRepository;

public class UsuarioUtil {

	private static List<Usuario> usuarios = new ArrayList<Usuario>();

	public static int getNextId() {
		usuarios = UsuarioRepository.getUsuarios();
		int var = 0;
		int temp = 0;

		for (Usuario usuario : usuarios) {
			temp = usuario.getId();

			if (temp > var) {
				var = temp;
			}
		}

		return var + 1;
	}
}

package br.com.imd.util;

import java.util.ArrayList;
import java.util.List;

import br.com.imd.domain.Papel;
import br.com.imd.repositories.PapelRepository;

public class PapelUtil {

	private static List<Papel> papeis = new ArrayList<Papel>();

	public static int getNextId() {
		papeis = PapelRepository.getPapeis();
		int var = 0;
		int temp = 0;

		for (Papel papel : papeis) {
			temp = papel.getId();

			if (temp > var) {
				var = temp;
			}
		}

		return var + 1;
	}
}

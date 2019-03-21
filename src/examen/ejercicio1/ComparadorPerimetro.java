package examen.ejercicio1;

import java.util.Comparator;

public class ComparadorPerimetro implements Comparator<Figuras> {

	@Override
	public int compare(Figuras a, Figuras b) {
		if (a.getPerimetro() < b.getPerimetro())
			return -1;
		else if (a.getPerimetro() > b.getPerimetro())
			return 1;
		return 0;
	}
}

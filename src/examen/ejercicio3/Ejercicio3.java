package examen.ejercicio3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Escriba aqui el numero de compuestos quimicos que va a escribir: ");
		String s = in.nextLine();
		Palabras(s);
	}

	public static void Palabras(String s) {
		Set<Set<String>> resultado = new HashSet<>();
		Set<String> sinrepetir = new HashSet<>();
		Set<String> repetidas = new HashSet<>();

		String palabra = "";

		for (int i = 0; i < palabra.length(); i++) {

			if (Character.isAlphabetic(palabra.charAt(i))) {

				if (i == s.length() - 1 || !Character.isAlphabetic(s.charAt(i + 1))) {
					if (sinrepetir.contains(palabra)) {
						repetidas.add(palabra);
						sinrepetir.remove(palabra);
					} else if (!repetidas.contains(palabra))
						sinrepetir.add(palabra);
				}
			}

			resultado.add(sinrepetir);

		}

	}

	private static void mostrarColeccion(Set<Set<String>> resultado) {
		Iterator<Set<String>> g = resultado.iterator();
		while (g.hasNext()) {
			System.out.println(g.next());
		}

	}

}

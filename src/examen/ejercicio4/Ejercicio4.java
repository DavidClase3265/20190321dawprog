package examen.ejercicio4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Escriba aqui su agenda de telefonos: ");
		String s = in.nextLine().toUpperCase();

		Map<String, String> agenda = new HashMap<>();

		// Caracter

		String caracter = ConseguirCaracter(s);

		String separador = Pattern.quote(caracter);
		String[] cadena = s.split(separador);

		String nombre = cadena[0];
		String numero = cadena[1];

		// reemplazar
		if (agenda.containsKey(nombre) && caracter == "-") {
			agenda.remove(nombre, numero);
			agenda.put(nombre, numero);
			System.out.println(nombre + " Se asigna con el nuevo numero  " + numero);
		}

		else if (!agenda.containsKey(nombre) && caracter == "-") {
			agenda.put(nombre, numero);
			System.out.println(nombre + " no se encuentra en la agenda, se acaba de añadir un contacto nuevo ");
		}

		// buscar
		else if (agenda.containsKey(nombre) && caracter == ":") {
			System.out.println(nombre + agenda.get(nombre));
		}

		else if (!agenda.containsKey(nombre) && caracter == ":") {
			System.out.println(nombre + " no se encuentra en la agenda");
		}
 
	}

	// metodo conseguir caracter
	public static String ConseguirCaracter(String cadena) {
		String caracter = null;
		for (int i = 1; i < cadena.length(); i++) {
			if (cadena.charAt(i) == ':') {
				caracter = ":";
			} else if (cadena.charAt(i) == '-') {
				caracter = "-";
			}
		}
		return caracter;
	}

}

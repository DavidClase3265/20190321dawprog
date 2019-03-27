package examen.ejercicio4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String s=null; 
		do {
			System.out.println("Entrada: ");
			Scanner in = new Scanner(System.in);
			s= in.nextLine().toUpperCase();
			
			Map<String, String> agenda = new HashMap<>();
			
		//Caracter
		String caracter = ConseguirCaracter(s);
		
		String[] cadena = s.split(caracter);
		
		if (caracter.equals("-")) {
		String nombre = cadena[0];
		String numero = cadena[1];

			
					if (agenda.containsKey(nombre))
						agenda.put(nombre, numero);	
			}
		
			if (caracter.equals(":")) {
				String buscar = cadena[0];
				String nombre = cadena[1];
					if (agenda.containsValue(nombre))
						System.out.println("Salida: " + nombre + agenda.get(nombre));
					else
						System.out.println("Salida: " + nombre + " no se encuentra en la agenda");		
			}
		
		System.out.println();
			
		}while(s.equals("fin")==false);
	}

	//Metodo Conseguir Caracter
	public static String ConseguirCaracter(String cadena) {
		String caracter = "";
		for (int i=0; i<cadena.length(); i++) {
			if (cadena.charAt(i) == ':') {
				caracter = ":";
			} else if (cadena.charAt(i) == '-') {
				caracter = "-";
			}
		}
		return caracter;
	}

}

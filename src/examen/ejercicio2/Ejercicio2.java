package examen.ejercicio2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import examen.ejercicio1.Circulo;
import examen.ejercicio1.ComparadorPerimetro;
import examen.ejercicio1.Cuadrado;
import examen.ejercicio1.Figuras;
import examen.ejercicio1.Rectangulo;
import examen.ejercicio1.Relleno;
import examen.ejercicio1.Sprite;

public class Ejercicio2 {

	public static void main(String[] args) {

		Set<Figuras> conjunto = new HashSet<>();
		conjunto.add(new Rectangulo(Color.black, Relleno.contorno, 300d, 300d));
		conjunto.add(new Cuadrado(Color.white, Relleno.contorno, 500d, 300d));
		conjunto.add(new Circulo(Color.red, Relleno.contorno, 900d, 700d));
		conjunto.add(new Sprite(Color.red, Relleno.contorno, 500d, 300d));

		List<Figuras> lista = new ArrayList<Figuras>();
		lista.add(new Rectangulo(Color.black, Relleno.contorno, 300d, 300d));
		lista.add(new Cuadrado(Color.white, Relleno.contorno, 500d, 300d));
		lista.add(new Circulo(Color.red, Relleno.contorno, 900d, 700d));

		Collections.sort(lista);
		Collections.sort(lista, new ComparadorPerimetro());
		// Collections.sort(lista, Collections.reverseOrder(new ComparadorRelleno()));

		mostrarLista(lista);

	}

	public static void mostrarLista(List<Figuras> lista) {
		Iterator<Figuras> i = lista.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}

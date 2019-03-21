package examen.ejercicio1;

import java.awt.Color;
import java.util.Arrays;

public class Rectangulo extends Figuras {

	private int longitudbase;
	private int altura;

	public Rectangulo(Color color, Relleno relleno, double coordX, double coordY) {
		super(color, relleno, coordX, coordY);

	}

	@Override
	public String toString() {
		return "Rectangulo [longitudbase=" + longitudbase + ", altura=" + altura
				+ "] [color=\" + color + \", relleno=\" + relleno + \", area=\" + area + \", perimetro=\" + perimetro\r\n"
				+ "				+ \", coordX=\" + coordX + \", coordY=\" + coordY + \"]";
	}

	public double getArea() {
		return area = altura * longitudbase;
	}

	public double getPerimetro() {
		return perimetro = 2 * (altura + longitudbase);
	}

}

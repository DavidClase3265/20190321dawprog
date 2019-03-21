package examen.ejercicio1;

import java.awt.Color;
import java.util.Arrays;

public class Circulo extends Figuras {
	private int radio;

	public Circulo(Color color, Relleno relleno, double coordX, double coordY) {
		super(color, relleno, coordX, coordY);

	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio
				+ "] [color=\" + color + \", relleno=\" + relleno + \", area=\" + area + \", perimetro=\" + perimetro\r\n"
				+ "				+ \", coordX=\" + coordX + \", coordY=\" + coordY + \"]";
	}

	public double getArea() {
		return area = Math.PI * (radio * radio);
	}

	public double getPerimetro() {

		return perimetro = 2 * (Math.PI + radio);

	}

}

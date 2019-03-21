package examen.ejercicio1;

import java.awt.Color;
import java.util.Arrays;

public class Cuadrado extends Figuras {

	private int longitudlado;

	public Cuadrado(Color color, Relleno relleno, double coordX, double coordY) {
		super(color, relleno, coordX, coordY);

	}

	@Override
	public String toString() {
		return "Cuadrado [longitudlado=" + longitudlado
				+ "] [color=\" + color + \", relleno=\" + relleno + \", area=\" + area + \", perimetro=\" + perimetro\r\n"
				+ "				+ \", coordX=\" + coordX + \", coordY=\" + coordY + \"]";
	}

	public double getArea() {
		return area = longitudlado * longitudlado;
	}

	public double getPerimetro() {

		return perimetro = longitudlado * 4;
	}

}

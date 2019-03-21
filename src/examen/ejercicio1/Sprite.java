package examen.ejercicio1;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class Sprite extends Figuras {
	BufferedImage img = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
	private double coordX;
	private double coordY;

	public Sprite(Color color, Relleno relleno, double coordX, double coordY) {
		super(color, relleno, coordX, coordY);

	}

	public double getCoordX() {
		return coordX;
	}

	public void setCoordX(double coordX) {
		this.coordX = coordX;
	}

	public double getCoordY() {
		return coordY;
	}

	public void setCoordY(double coordY) {
		this.coordY = coordY;
	}

}

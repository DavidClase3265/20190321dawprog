package examen.ejercicio1;

import java.awt.Color;
import java.util.Arrays;

public class Figuras implements Comparable<Figuras> {

	private Color color;
	private Relleno relleno;
	private double coordX;
	private double coordY;
	protected double area = getArea();
	protected double perimetro = getPerimetro();

	public Figuras(Color color, Relleno relleno, double coordX, double coordY) {
		super();
		this.color = color;
		this.relleno = relleno;
		this.coordX = coordX;
		this.coordY = coordY;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Relleno getRelleno() {
		return relleno;
	}

	public void setRelleno(Relleno relleno) {
		this.relleno = relleno;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
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

	@Override
	public String toString() {
		return "Figuras [color=" + color + ", relleno=" + relleno + ", area=" + area + ", perimetro=" + perimetro
				+ ", coordX=" + coordX + ", coordY=" + coordY + "]";
	}

	@Override
	public int compareTo(Figuras o) {
		if (area < o.area)
			return -1;
		else if (area > o.area)
			return 1;
		return 0;
	}

}

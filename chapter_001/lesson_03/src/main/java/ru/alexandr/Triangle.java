package ru.alexandr;
	/**
	* Triangle.
	* @author Alexander Golubev.
	* @since 30.11.2016
	* @version 1.0
	*/
public class Triangle {
	/**
	* поле хранит координаты точки a.
	*/
	private Point a;
	/**
	* поле хранит координаты точки b.
	*/
	private Point b;
	/**
	* поле хранит координаты точки c.
	*/
	private Point c;
	/**
	* Метод создает треугольник.
	* @param a point triangle.
	* @param b point triangle.
	* @param c point triangle.
	*/
	public Triangle(Point a, Point b, Point c) {
	this.a = a;
	this.b = b;
	this.c = c;
	}
	/**
	* Метод вычисляет площадь треугольника.
	* @return result - результат вычислений.
	*/
	public double area() {
		double result;
		double ab = this.a.distanceTo(this.b);
		double ac = this.a.distanceTo(this.c);
		double bc = this.b.distanceTo(this.c);
		if ((bc < (ab + ac)) && (ac < (ab + bc)) && (ab < (bc + ac))) {
			double p = (a + b + c) / 2;
			result = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
		} else {
			result = 0;
		}
		return result;
	}
}
package ru.alexandr;
	/**
	* Point.
	* @author Alexander Golubev.
	* @since 30.11.2016
	* @version 1.0
	*/
public class Point {
	/**
	* поле хранит координаты точки x.
	*/
	private double x;
	/**
	* поле хранит координаты точки y.
	*/
	private double y;
	/**
	* Метод создает объект Point.
	* @param x переменная точки координат.
	* @param y переменная точки координат.
	*/
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	/**
	* Метод вычисляет растояние между точками.
	* @param point - объект к которому нужно вычислить растояние.
	* @return возвращает вычисленное растояние меду точками.
	*/
	public double distanceTo(Point point) {
		return Math.sqrt(Math.pow(point.y - this.y, 2) + Math.pow(point.x - this.x, 2));
	}
}
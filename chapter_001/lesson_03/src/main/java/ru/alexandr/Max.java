package ru.alexandr;
	/**
	* Max.
	* @author Alexander Golubev.
	* @since 07.12.2016
	* @version 1.0
	*/
public class Max {
	/**
	* поле хранит переменную max.
	*/
	private int max;
	/**
	* Метод вычисляет максимум.
	* @param first - min namber.
	* @param second - max namber.
	*/
	public void max(int first, int second) {
		this.max = first < second ? min : max;
	}
	/**
	* Метод возвращает результат.
	* @return возвращает результат.
	*/
	public int getMax() {
		return this.result;
	}
}
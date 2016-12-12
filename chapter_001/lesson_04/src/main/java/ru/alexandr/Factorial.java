package ru.alexandr;
	/**
	* Factorial.
	* @author Alexander Golubev.
	* @since 12.12.2016
	* @version 1.0
	*/
public class Factorial {
	/**
	* Поле хранит переменную result.
	*/
	private int result;
	/**
	* Метод вычисляет факториал.
	* @param first - первый агрумент.
	* @param second - второй аргумент.
	* @return return - возвращает значение.
	*/
	public int factorial(int first, int second) {
		for (first = 1; first < second; first++) {
			result = first * first;
		}
		return result;
	}
}
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
	* @param first - первая переменная.
	* @param second - вторая переменная.
	* @return return - возвращает значение.
	*/
	public int max(int first, int second) {
		return first > second ? first : second;
	}
}
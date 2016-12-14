package ru.alexandr;
	/**
	* Counter.
	* @author Alexander Golubev.
	* @since 12.12.2016
	* @version 1.0
	*/
public class Counter {
	/**
	* Метод вычисляет сумму частных чисел.
	* @param start - первый агрумент.
	* @param finish - второй аргумент.
	* @return return - возвращает значение.
	*/
	public int add(int start, int finish) {
		int result = 0;
		for (int a = start; a < finish; a++) {
			result += a % 2 == 0 ? a : 0;
		}
		return result;
	}
}
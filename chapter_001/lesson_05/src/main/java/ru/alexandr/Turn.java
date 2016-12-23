package ru.alexandr;
	/**
	* Turn.
	* @author Alexander Golubev.
	* @since 19.12.2016
	* @version 1.0
	*/
public class Turn {
	/**
	* Метод переворачивает массив.
	* @param array массив.
	* @return result - возвращает результат.
	*/
	public int[] back(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int arrays = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = arrays;
		}
		return array;
	}
}
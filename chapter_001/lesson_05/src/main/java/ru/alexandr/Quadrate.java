package ru.alexandr;
	/**
	* Quadrate turn.
	* @author Alexander Golubev.
	* @since 19.12.2016
	* @version 1.0
	*/
public class Quadrate {
	/**
	* Метод поварачивает массив на 90 градусов.
	* @param value квадратный массив.
	* @return result - возвращает результат.
	*/
	public int[][] turn(int[][] value) {
		int temp;
		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < value.length - 1; j++) {
				temp = value[i][j + 1];
				value[i][j + 1] = value[j + 1][i];
				value[j + 1][i] = temp;
			}
		}
		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < value.length / 2; j++) {
				temp = value[i][j];
				value[i][j] = value[i][value.length - j - 1];
				value[i][value.length - j - 1] = temp;
			}
		}
		return value;
	}
}
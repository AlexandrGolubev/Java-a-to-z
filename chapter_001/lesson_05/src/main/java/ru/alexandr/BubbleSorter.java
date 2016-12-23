package ru.alexandr;
	/**
	* BubbleSorter.
	* @author Alexander Golubev.
	* @since 19.12.2016
	* @version 1.0
	*/
public class BubbleSorter {
	/**
	* Метод сортирует массив.
	* @param value массив.
	* @return result - возвращает результат.
	*/
	public int[] sort(int[] value) {
		int tmp;
		for (int i = 1; i < value.length; i++) {
			for (int j = value.length - 1; j >= i; j--) {
				if (value[j - 1] > value[j]) {
					tmp = value[j - 1];
					value[j - 1] = value[j];
					value[j] = tmp;
				}
			}
		}
		return value;
	}
}
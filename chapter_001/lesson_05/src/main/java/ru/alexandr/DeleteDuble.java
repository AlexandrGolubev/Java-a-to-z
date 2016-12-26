package ru.alexandr;
	import java.util.Arrays;
	/**
	* DeleteDuble.
	* @author Alexander Golubev.
	* @since 26.12.2016
	* @version 1.0
	*/
public class DeleteDuble {
	/**
	* Метод удаляет дублирующие строки.
	* @param words массив.
	* @return result - возвращает результат.
	*/
	public String[] delete(String[] words) {
		String[] word = Arrays.copyOf(words, 2);
		for (int i = 0; i < word.length; i++) {
			String temp = word[i];
		}
		return word;
	}
}
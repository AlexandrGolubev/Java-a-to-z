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
		String temp;
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i] != null && words[i].equals(words[j])) {
					words[j] = null;
				}
			}
		}
		for (int i = 0; i < words.length - 1; i++) {
			for (int j = 0; j < words.length - 1 - i; j++) {
				if (words[j] == null && words[j + 1] != null) {
					words[j] = words[j + 1];
					words[j + 1] = null;
				}
			}
		}
		String[] word = Arrays.copyOf(words, 2);
		for (int i = 0; i < word.length; i++) {
			temp = word[i];
		}
		return word;
	}
}
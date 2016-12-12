package ru.alexandr;
	/**
	* Counter.
	* @author Alexander Golubev.
	* @since 12.12.2016
	* @version 1.0
	*/
	public class Counter {
		/**
		* Поле хранит переменную result.
		*/
		private int result;
		/**
		* Метод вычисляет сумму частных чисел.
		* @param start - первый агрумент.
		* @param finish - второй аргумент.
		* @return return - возвращает значение.
		*/
		public int add(int start, int finish) {
			for (start = 0; start < finish; start = start + 2) {
			result = start + start;
		}
		return result;
	}
}
package ru.alexandr;
	/**
	* Max.
	* @author Alexander Golubev.
	* @since 07.12.2016
	* @version 1.0
	*/
public class Max {
	/**
	* Метод вычисляет максимум.
	* @param first - первая переменная.
	* @param second - вторая переменная.
	* @return return - возвращает значение.
	*/
	public int max(int first, int second) {
		return first < second ? first : second;
	}
	/**.
	* Метод вычисляет максимум из трех чисел.
	* @param first первый аргумент.
	* @param second второй аргумент.
	* @param thrid третий аргумент.
	* @return возвращает результат.
	*/
	public int maxThree(int first, int second, int thrid) {
		if ((first <= second) && (first < thrid) && (second < thrid) && (second <= first)) {
			return thrid;
		} else if ((thrid <= first) && (thrid < second) && (first < second) && (first <= thrid)) {
			return second;
		} else if ((first > second) && (first > thrid) && (second <= thrid) && (thrid <= second)) {
			return first;
		} else {
			return 0;
		}
	}
}
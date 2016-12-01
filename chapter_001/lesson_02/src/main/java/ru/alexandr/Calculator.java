package ru.alexandr;

	/**
	 * Calculator.
	 * @author Alexander Golubev
	 * @since 30.11.2016
	 * @version 1.0
	 */

public class Calculator {

	/**
	 * Переменная "result".
	 */
	private double result;

	/**
	 * Метод вычисляет сложение двух чисел
	 * и сохраняет результат вычислений в "result".
	 * @param first - первое число (слогаемое).
	 * @param second - второе число (слогаемое).
	 */
	public void add(double first, double second) {
			this.result = first + second;
	}

	/**
	 * Метод вычисляет разность двух чисел
	 * и сохраняет результат вычислений в "result".
	 * @param first - первое число (уменьшаемое).
	 * @param second - второе число (вычитаемое).
	 */
	public void substract(double first, double second) {
			this.result = first - second;
	}

	/**
	 * Метод вычиляет произведение двух чисел
	 * и сохраняет результат вычислений в "result".
	 * @param first - первое число (множимое).
	 * @param second - второе число (множитель).
	 */
	public void multiple(double first, double second) {
			this.result = first * second;
	}

	/**
	 * Метод вычисляет частное двух чисел
	 * и сохраняет результат вычислений в "result".
	 * @param first - первое число (делимое).
	 * @param second - второе число (делитель).
	 */
	public void div(double first, double second) {
			this.result = first / second;
	}
	/**
	* Метод возвращает результат.
	* @return возвращает результат.
	*/
	public double getResult() {
		return this.result;
	}

}
package ru.alexandr;
	/**
	* DeleteDuble.
	* @author Alexander Golubev.
	* @since 26.12.2016
	* @version 1.0
	*/
public class TalkTest {
	/**
	* Метод удаляет дублирующие строки.
	* @param origin строка.
	* @param sub подстрока.
	* @return result - возвращает результат.
	*/
	public boolean contains(String origin, String sub) {
		boolean containsResult = false;
		char[] originArray = origin.toCharArray();
		char[] subArray = sub.toCharArray();
		for (int i = 0; i < originArray.length; i++) {
            if (originArray[i] == subArray[0]) {
                for (int j = 0; j < subArray.length; j++) {
                    if (originArray[i] == subArray[j]) {
                        i++;
                        containsResult = true;
                    } else {
                        break;
                    }
                }
            }
        }
        return containsResult;
	}
}
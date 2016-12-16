package ru.alexandr;
	/**
	* The building of the pyramid.
	* @author Alexander Golubev.
	* @since 15.12.2016
	* @version 1.0
	*/
public class Paint {
	/**
	* Метод строит пирамиду.
	* @param h - высота пирамиды.
	* @return return - возвращает строки.
	*/
    public String piramid(int h) {
		StringBuilder stringBuilder = new StringBuilder();
		int index = 2;
		for (int i = 1; i <= h; i++) {
			for (int j = 2; j <= h - 1; j++) {
				stringBuilder.append(" ");
            }
			stringBuilder.append(" ^");
			if (i != 1) {
				for (int j = 2; j <= index; j++) {
				stringBuilder.append(" ");
				}
				stringBuilder.append("^");
			}
		}
		return stringBuilder.toString();
	}
}
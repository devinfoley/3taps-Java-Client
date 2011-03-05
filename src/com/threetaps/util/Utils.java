package com.threetaps.util;

import java.util.List;

public class Utils {

	public static String join(List<String> strings) {
		if (strings != null && strings.size() > 0) {
			StringBuffer joinBuffer = new StringBuffer();
			for (String string : strings) {
				joinBuffer.append(string);
				joinBuffer.append(",");
			}
			joinBuffer.deleteCharAt(joinBuffer.length() - 1);

			return joinBuffer.toString();
		}

		return "";
	}

}

package org.alicebot.ab.utils;

public class StringUtils {

	public String[] splitDotComma(String toSplit){
		String[] parts = toSplit.split(";");
		return parts;
	}
}

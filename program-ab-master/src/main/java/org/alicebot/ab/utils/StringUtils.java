package org.alicebot.ab.utils;

public class StringUtils {

	public String[] splitDotComma(String toSplit){
		String[] parts = toSplit.split(";");
		return parts;
	}
	
	public String [] splitAttValue(String toSplit){ //Name: Bernardo
		String[] parts = toSplit.split(":");
		return parts;
	}
}

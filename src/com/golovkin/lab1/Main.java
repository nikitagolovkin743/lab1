package com.golovkin.lab1;

import com.golovkin.lab1.utils.CaseConverter;

public class Main {
	private static final String errorMessage = "Введите первым аргументом UPPERCASE или LOWERCASE, а затем строку, регистр которой необходимо преобразовать";
	
	private static final String UPPERCASE_ARG_KEYWORD = "UPPERCASE";
	private static final String LOWERCASE_ARG_KEYWORD = "LOWERCASE";
	
	private Main() {
	}
	
	public static void main(String... args) {
		String outputMessage;
		if (args.length >= 2) {
			String str = args[1];
			
			if (args[0].equalsIgnoreCase(UPPERCASE_ARG_KEYWORD))
			{
				outputMessage = CaseConverter.toUpperCase(str);
			}
			else if (args[0].equalsIgnoreCase(LOWERCASE_ARG_KEYWORD))
			{
				outputMessage = CaseConverter.toLowerCase(str);
			}
			else {
				outputMessage = errorMessage;
			}
		}
		else {
			outputMessage = errorMessage;
		}
		
		System.out.println(outputMessage);
	}
}
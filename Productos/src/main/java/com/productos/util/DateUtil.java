package com.productos.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class DateUtil {
	
	public static final String  DATE_FORMATTER = "dd/MM/yyyy";
	
	public static String localDateTimeToString(LocalDateTime date, String formatter){
		DateTimeFormatter format = DateTimeFormatter.ofPattern(formatter);
		return  date.format(format);
	} 
	
}

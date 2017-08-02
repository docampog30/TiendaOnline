package com.productos.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class DateUtil {
	
	public static final String  DATE_FORMATTER = "dd/MM/yyyy";
	
	public static String localDateToString(LocalDate date, String formatter){
		DateTimeFormatter format = DateTimeFormatter.ofPattern(formatter);
		return  date.format(format);
	} 
	
	public static LocalDate StringToLocalDate(String date, String format){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		return LocalDate.parse(date, formatter);
	} 
	
	
	
}

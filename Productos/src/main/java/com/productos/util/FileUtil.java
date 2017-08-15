package com.productos.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileUtil {
	
	  public static List<String> readfile(String filename) {
		  try {
				return Files.newBufferedReader(Paths.get(filename))
				.lines().collect(Collectors.toList());
			} catch (IOException e) {
				e.printStackTrace();
				return new ArrayList<>();
			}
	  }
	
}

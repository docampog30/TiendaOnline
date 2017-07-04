package com.productos.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.productos.services.ProductoService;

@Service
public class ScheduledTasks {
	
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    
    @Autowired
	private ProductoService productoService;

    @Async
    public void reportCurrentTime() {
    	System.out.println("The time is now "+dateFormat.format(new Date()));
    	productoService.consultarProductos();
    }
}

package com.productos.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.productos.services.ProductoService;

@Service
public class ScheduledTasks {
	
    private static final SimpleDateFormat DATEFORMAT = new SimpleDateFormat("HH:mm:ss");
    
    @Autowired
	private ProductoService productoService;

    @Async
    public void searchProductsProcess() {
    	System.out.println("Start Guarda Productos "+DATEFORMAT.format(new Date()));
    	productoService.guardarProductosProcess();
    	System.out.println("finish guarda Productos "+DATEFORMAT.format(new Date()));
    }
    
    //@Scheduled(cron = "0 0 23 * * ?")
    public void searchProductsEveryDay(){
    	productoService.guardarProductosDiarios();
    }
}

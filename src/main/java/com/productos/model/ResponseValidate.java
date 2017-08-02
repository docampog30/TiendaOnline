package com.productos.model;

import java.util.List;

public class ResponseValidate {

    private String message;

    private String error;

    private int status;

    private List<String> cause;

    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
    public void setError(String error){
        this.error = error;
    }
    public String getError(){
        return this.error;
    }
    public void setStatus(int status){
        this.status = status;
    }
    public int getStatus(){
        return this.status;
    }
    public void setCause(List<String> cause){
        this.cause = cause;
    }
    public List<String> getCause(){
        return this.cause;
    }
}

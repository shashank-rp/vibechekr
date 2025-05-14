package com.rith.vibechekr.common.utils;

public class Resource <E>{
    public E data;
    public Status status;
    public String message;

    public Resource(E data,Status status,String message){
        this.data = data;
        this.status = status;
        this.message = message;
    }

    public static <E> Resource<E> success(E data){
        return new Resource<>(data,Status.SUCCESS,"Successfully processed");
    }

    public static <E> Resource<E> error(String message){
        return new Resource<>(null,Status.ERROR,message);
    }

    public enum Status{
        SUCCESS,ERROR,LOADING
    }
}

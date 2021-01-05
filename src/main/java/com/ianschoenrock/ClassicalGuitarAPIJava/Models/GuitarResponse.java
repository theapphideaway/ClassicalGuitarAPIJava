package com.ianschoenrock.ClassicalGuitarAPIJava.Models;

import java.util.List;

public class GuitarResponse {
    public final int status;
    public final String message;
    public final List<Guitar> guitars;

    public GuitarResponse(int status, String message, List<Guitar> guitars){
        this.status = status;
        this.message = message;
        this.guitars = guitars;
    }

    public int getStatus(){
        return status;
    }

    public String getMessage(){
        return message;
    }

    public List<Guitar> getGuitars(){
        return guitars;
    }
}

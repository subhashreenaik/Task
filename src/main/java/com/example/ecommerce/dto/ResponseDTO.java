package com.example.ecommerce.dto;


public class ResponseDTO {
	String message;
    Object data;
    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
        
    }

}

package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.dto.ResponseDTO;
import com.example.ecommerce.entity.ItemData;
import com.example.ecommerce.service.Eservice;



@RestController
@RequestMapping("/dashboard")
public class DashboardController {

	@Autowired
	Eservice service;
	
	@GetMapping(value= {"/getAll"})
	public ResponseEntity<ResponseDTO> getbookData(){
	    List<ItemData> itemList =service.getIteamData();
	    ResponseDTO responseDTO = new ResponseDTO("Get Call Success",itemList);
	    return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
}

package com.devsuperior.sds4.semanaDevSuperior4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devsuperior.sds4.semanaDevSuperior4.dto.SellerDTO;
import com.devsuperior.sds4.semanaDevSuperior4.services.SellerService;

@Controller
@RequestMapping(value = "/sellers")
public class SellerController {
	
	@Autowired
	private SellerService service;

	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll(){
		List<SellerDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
		
}

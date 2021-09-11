package com.devsuperior.sds4.semanaDevSuperior4.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devsuperior.sds4.semanaDevSuperior4.dto.SaleDTO;
import com.devsuperior.sds4.semanaDevSuperior4.dto.SaleSucessDTO;
import com.devsuperior.sds4.semanaDevSuperior4.dto.SaleSumDTO;
import com.devsuperior.sds4.semanaDevSuperior4.services.SaleService;

@Controller
@RequestMapping(value = "/sales")
public class SaleController implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> result = service.findAll(pageable);
		return ResponseEntity.ok().body(result);
	
	}
	
	@GetMapping(value = "/sum-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGrupedBySeller(){
		List<SaleSumDTO> list = service.amountGrupedBySeller();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/sucess-by-seller")
	public ResponseEntity<List<SaleSucessDTO>> sucessGrupedBySeller(){
		List<SaleSucessDTO> list = service.sucessGrupedBySeller();
		return ResponseEntity.ok().body(list);
	}

}

package com.devsuperior.sds4.semanaDevSuperior4.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.sds4.semanaDevSuperior4.dto.SellerDTO;
import com.devsuperior.sds4.semanaDevSuperior4.entities.Seller;
import com.devsuperior.sds4.semanaDevSuperior4.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	@Transactional(readOnly = true)
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
	
}

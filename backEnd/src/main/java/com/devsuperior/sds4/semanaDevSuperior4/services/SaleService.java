package com.devsuperior.sds4.semanaDevSuperior4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.sds4.semanaDevSuperior4.dto.SaleDTO;
import com.devsuperior.sds4.semanaDevSuperior4.entities.Sale;
import com.devsuperior.sds4.semanaDevSuperior4.repositories.SaleRepository;
import com.devsuperior.sds4.semanaDevSuperior4.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
}

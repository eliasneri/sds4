package com.devsuperior.sds4.semanaDevSuperior4.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devsuperior.sds4.semanaDevSuperior4.dto.SaleSucessDTO;
import com.devsuperior.sds4.semanaDevSuperior4.dto.SaleSumDTO;
import com.devsuperior.sds4.semanaDevSuperior4.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new com.devsuperior.sds4.semanaDevSuperior4.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj  GROUP BY obj.seller")
	List<SaleSumDTO> amountGrupedBySeller();
	
	@Query("SELECT new com.devsuperior.sds4.semanaDevSuperior4.dto.SaleSucessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale AS obj  GROUP BY obj.seller")
	List<SaleSucessDTO> sucessGrupedBySeller();

}

package com.devsuperior.sds4.semanaDevSuperior4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.sds4.semanaDevSuperior4.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{

}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Address;
import com.example.demo.model.Treehouse;
import java.util.List;

// jpa repository

@Repository
public interface TreeRepository extends JpaRepository<Treehouse, Long> {
    
	@Query(nativeQuery = true,value = "SELECT distinct e.price from Treehouse e")
	public List<Object> getPrices();
	
	@Query(nativeQuery = true,value = "SELECT distinct e.size from Treehouse e")
	public List<Object> getSizes();
	
	@Query(value = "CALL uspGetFilteredTreehouses(:Size,:Price,:CityName);", nativeQuery = true)
	public List<Treehouse> getFilteredTreehouses(@Param("Size") Integer  Size,@Param("Price") Integer  Price,@Param("CityName") String CityName);
}

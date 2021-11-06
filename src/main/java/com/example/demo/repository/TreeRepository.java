package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Treehouse;
import java.util.List;

// jpa repository

@Repository
public interface TreeRepository extends JpaRepository<Treehouse, Long> {
	// find by treehouseID
//	List<Treehouse> findById(int TreehouseID);
	

	// lets create a method where we can find tree houses that are in a specific city
	
//	// sorted by size when entering name
//    @Query("from Treehouse where name =?1 order by size")
//    List<Treehouse> findByNameSorted(String name);
//    
}

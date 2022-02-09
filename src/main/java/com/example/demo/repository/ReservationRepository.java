package com.example.demo.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long >{

	
	@Query(value = "CALL  uspGetValidatedDates (:StartDate, :EndDate,:treehouseID);", nativeQuery = true)
	public int getReserveDateValidation (@Param("StartDate") Date  StartDate,@Param("EndDate") Date  EndDate,@Param("treehouseID") int treehouseID);
	
	@Query(value = "CALL  uspActiveReservation (:paymentID, :resId);", nativeQuery = true)
	public int setActiveReservation (@Param("paymentID") Long  PaymentID,@Param("resId") Long  ReservationID);
	
}

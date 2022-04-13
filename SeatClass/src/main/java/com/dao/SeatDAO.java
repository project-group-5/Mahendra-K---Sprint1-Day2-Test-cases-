package com.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.model.SeatDetails;

@Repository
public interface SeatDAO {
	 public void addSeat(SeatDetails seat);
	 public SeatDetails findSeat(int Seatnumber);
	 public List<SeatDetails> findAllSeat();
	 public boolean updateSeat(SeatDetails seat);
	 public boolean deleteSeat(int Seatnumber);


}
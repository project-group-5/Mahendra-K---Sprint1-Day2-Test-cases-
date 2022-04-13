package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.SeatDetails;

@Service

public class SeatService {
	
	@Autowired
	SeatDAO seatDAOImpl;

	public void add(SeatDetails seat) {
		seatDAOImpl.addSeat(seat);
		
	}
	public SeatDetails find(int Seatnumber) {
		return seatDAOImpl.findSeat(Seatnumber);
	}
	public List<SeatDetails> findAll(){
		return seatDAOImpl.findAllSeat();
	}
	public boolean update(SeatDetails seat) {
		return seatDAOImpl.updateSeat(seat);
	}
	public boolean delete(int Seatnumber) {
		return seatDAOImpl.deleteSeat(Seatnumber);
	}

}
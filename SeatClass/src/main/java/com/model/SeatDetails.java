package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
@Entity

public class SeatDetails {
	@Id
	@GeneratedValue
	private int Seatnumber;
	@Max(1000)
	@Min(100)
	private int Seatcost;
	private String Seattype;
	
    public SeatDetails() {
		
	}

	public int getSeatnumber() {
		return Seatnumber;
	}

	public void setSeatnumber(int Seatnumber) {
		this.Seatnumber = Seatnumber;
	}

	public int getSeatcost() {
		return Seatcost;
	}

	public void setSeatcost(int Seatcost) {
		this.Seatcost = Seatcost;
	}

	public String getSeattype() {
		return Seattype;
	}

	public void setSeattype(String Seattype) {
		this.Seattype = Seattype;
	}

	
}

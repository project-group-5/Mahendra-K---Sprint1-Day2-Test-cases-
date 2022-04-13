package com.SeatBookingProject.SeatClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.SeatService;
import com.model.SeatDetails;


import junit.framework.Assert;
import java.util.*;

@SpringBootTest
class SeatTest {
	@Autowired
	SeatService service;

	@Test
	void testAdd() {
		
		SeatDetails seat=new SeatDetails();
		seat.setSeattype("AC");
		seat.setSeatcost(500);
		service.add(seat);
		
		SeatDetails seat1=service.find(seat.getSeatnumber());
		Assert.assertEquals("AC",seat1.getSeattype());
		Assert.assertEquals(500,seat1.getSeatcost());
		
	}

	@Test
	void testFind() {
	     SeatDetails seat=new SeatDetails();
	     seat.setSeatnumber(1);
	     try {
	    	 service.add(seat);
	     }
	     catch(Exception e){
	    	 System.out.println(e);
	     }
	     SeatDetails seat1=service.find(seat.getSeatnumber());
	}

	/**
	 * 
	 */
	@Test
	void testFindAll() {
		SeatDetails seat=new SeatDetails();
		seat.setSeatnumber(1);
		seat.setSeattype("AC");
		seat.setSeatcost(500);
		service.add(seat);
		
		SeatDetails seat1=new SeatDetails();
		seat1.setSeatnumber(2);
		seat1.setSeattype("AC");
		seat1.setSeatcost(500);
		service.add(seat);
		
		List<SeatDetails> seatlist=service.findAll();
		Assert.assertEquals(seatlist.get(0).getSeatnumber(),1);
		Assert.assertEquals(seatlist.get(1).getSeatnumber(),2);
		Assert.assertEquals(seatlist.get(2).getSeatnumber(),3);
		
		
	}
		

	@Test
	void testUpdate() {
		SeatDetails seat=new SeatDetails();
		seat.setSeatnumber(3);
		seat.setSeattype("NORMAL");
		seat.setSeatcost(300);
		service.add(seat);
		seat.setSeatnumber(1);
		service.update(seat);
		Assert.assertEquals(true, service.update(seat));
	}

	@Test
	void testDelete() {
		
		service.delete(2);
		SeatDetails seat=service.find(2);
	    Assert.assertNull(seat);
	}

}

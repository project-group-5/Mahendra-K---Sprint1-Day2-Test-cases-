package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import com.model.SeatDetails;
@Component

public class SeatDAOImpl implements SeatDAO{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addSeat(SeatDetails seat) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(seat);
		session.flush();
		session.getTransaction().commit();
		

	}

	@Override
	public SeatDetails findSeat(int Seatnumber) {
		Session session=sessionFactory.openSession();
		SeatDetails seat=session.find(SeatDetails.class, Seatnumber);
		
		return seat;
	}

	@Override
	public List<SeatDetails> findAllSeat() {
		Session session=sessionFactory.openSession();
		List<SeatDetails> seatlist=session.createQuery("select i from SeatDetails i").list();
		
		return seatlist;
	}

	@Override
	public boolean updateSeat(SeatDetails seat) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(seat);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteSeat(int Seatnumber) {
		Session session=sessionFactory.openSession();
		SeatDetails seat=session.find(SeatDetails.class, Seatnumber);
		session.getTransaction().begin();
		session.delete(seat);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
		return true;
	}


}

package tn.esprit.insurance.service.implementation;

//import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.insurance.entity.Archive;
import tn.esprit.insurance.entity.Feeds;
import tn.esprit.insurance.entity.FeedsState;
import tn.esprit.insurance.service.interfaces.IArchiveService;

@Stateless
public class ArchiveService implements IArchiveService {

	@PersistenceContext(unitName = "insurance-ejb")
	EntityManager em;
	
	@Override
	public void addArchive(Feeds feed) {
		// TODO Auto-generated method stub
		Archive ar = new Archive();
		String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		Date d = null;
		try {
			d = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ar.setTitle(feed.getTitle());
		ar.setFeedback(feed.getFeedback());
		ar.setType(feed.getType());
		ar.setDateSent(feed.getDateSent());
		ar.setDateSolving(d);
		ar.setCustomer_id(feed.getId());
		em.persist(ar);
	}

	@Override
	public void removeArchive(int id) {
		// TODO Auto-generated method stub
		em.remove(em.find(Feeds.class, id));
		
	}

	@Override
	public void updateArchive(Feeds newArch) {
		// TODO Auto-generated method stub
		Feeds emp = em.find(Feeds.class, newArch.getId());
//		FeedsState etat = null;
//		emp.setState(etat.solved);
		
	}

	@Override
	public Feeds findArchiveById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Feeds> findAllArchive() {
		// TODO Auto-generated method stub
		return null;
	}

}

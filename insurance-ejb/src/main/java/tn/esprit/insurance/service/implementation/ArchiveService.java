package tn.esprit.insurance.service.implementation;

import java.util.List;

import javax.ejb.Stateless;

import tn.esprit.insurance.entity.Feeds;
import tn.esprit.insurance.service.interfaces.IArchiveService;

@Stateless
public class ArchiveService implements IArchiveService {

	@Override
	public int addArchive(Feeds arch) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void removeArchive(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateArchive(Feeds newArch) {
		// TODO Auto-generated method stub
		
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

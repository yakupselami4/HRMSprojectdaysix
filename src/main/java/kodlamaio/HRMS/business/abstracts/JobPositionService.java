package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.Entities.concretes.Positions;

public interface JobPositionService {
	
	List<Positions> getAll();

}

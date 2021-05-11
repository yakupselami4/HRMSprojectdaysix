package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.DataAccess.abstracts.JobPositionsDao;
import kodlamaio.HRMS.Entities.concretes.Positions;
import kodlamaio.HRMS.business.abstracts.JobPositionService;

@Service
public class JobPositionsManager implements JobPositionService{
	
	private JobPositionsDao jobpositionsdao;
	
	public JobPositionsManager(JobPositionsDao jobpositionsdao) {
		super();
		this.jobpositionsdao = jobpositionsdao;
		
	}

	@Override
	public List<Positions> getAll() {
		
		return this.jobpositionsdao.findAll();
	}

}

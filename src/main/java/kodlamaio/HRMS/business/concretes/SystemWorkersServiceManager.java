package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.DataAccess.abstracts.SystemWorkersDao;
import kodlamaio.HRMS.Entities.concretes.SystemWorkers;
import kodlamaio.HRMS.business.abstracts.SystemWorkersService;
@Service
public class SystemWorkersServiceManager implements SystemWorkersService{
	
	private SystemWorkersDao systemworkersdao;
	
	@Autowired
	public SystemWorkersServiceManager(SystemWorkersDao systemworkersdao) {
		super();
		this.systemworkersdao=systemworkersdao;
		
	}
	
	

	@Override
	public List<SystemWorkers> getAll() {

		return this.systemworkersdao.findAll();
	}

}

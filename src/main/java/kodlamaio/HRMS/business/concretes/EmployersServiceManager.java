package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.DataAccess.abstracts.EmployersDao;
import kodlamaio.HRMS.Entities.concretes.Employers;
import kodlamaio.HRMS.business.abstracts.EmployersService;

@Service
public class EmployersServiceManager implements EmployersService{
	
	private EmployersDao employersdao;
	
	@Autowired
	public EmployersServiceManager(EmployersDao employersdao) {
		super();
		this.employersdao=employersdao;
	}

	@Override
	public List<Employers> getAll() {
		return this.employersdao.findAll();
	}

}

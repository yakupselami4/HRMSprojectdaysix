package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.Entities.concretes.JobSeekers;

public interface JobSeekersService {
	public boolean RegisterStep1(JobSeekers jobseekers);
	public boolean EmailVerification(JobSeekers jobseekers);
	
	
	List<JobSeekers> getAll();
		
		

}

package kodlamaio.HRMS.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.Entities.concretes.JobSeekers;

public interface JobSeekersDao extends JpaRepository<JobSeekers, Integer>{

}

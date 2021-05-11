package kodlamaio.HRMS.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.Entities.concretes.Employers;


public interface EmployersDao extends JpaRepository<Employers,Integer>{

}

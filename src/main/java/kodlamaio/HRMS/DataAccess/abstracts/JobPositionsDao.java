package kodlamaio.HRMS.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.Entities.concretes.Positions;

public interface JobPositionsDao extends JpaRepository<Positions,Integer>{

}

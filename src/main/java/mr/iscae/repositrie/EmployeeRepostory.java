package mr.iscae.repositrie;

import mr.iscae.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepostory extends JpaRepository<EmployeeEntity, Long> {
}

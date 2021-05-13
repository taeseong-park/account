package cop.planet.account.repository;

import cop.planet.account.model.GroupVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<GroupVo, Long > {

}

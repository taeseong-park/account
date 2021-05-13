package cop.planet.account.repository;

import cop.planet.account.model.UserGroupingVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupingRepository extends JpaRepository<UserGroupingVo, Long > {

}

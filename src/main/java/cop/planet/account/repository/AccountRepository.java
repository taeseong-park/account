package cop.planet.account.repository;

import cop.planet.account.model.UserVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<UserVo, Long > {
}

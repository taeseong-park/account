package cop.planet.account.repository;

import cop.planet.account.model.UserVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<UserVo, Long > {

    @Query(value = "select * from user b where b.id = ?1 and b.pw = ?2", nativeQuery = true)
    UserVo findByIdPw(String id, String pw);
}

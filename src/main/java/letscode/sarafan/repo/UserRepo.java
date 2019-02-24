package letscode.sarafan.repo;


import letscode.sarafan.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    User findByToken(String token);

    User findByUsername(String username);
}

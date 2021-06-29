package restsevice.systemB.repository;

import org.springframework.data.repository.CrudRepository;
import restsevice.systemB.model.PersonEntity;

public interface PersonRepository extends CrudRepository <PersonEntity, Long> {
}

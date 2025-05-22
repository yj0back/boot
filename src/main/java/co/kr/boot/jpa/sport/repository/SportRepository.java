package co.kr.boot.jpa.sport.repository;

import co.kr.boot.jpa.sport.entity.Sport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportRepository extends CrudRepository<Sport, Long> {
}

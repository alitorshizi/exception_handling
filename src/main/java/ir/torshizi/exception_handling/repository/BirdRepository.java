package ir.torshizi.exception_handling.repository;

import ir.torshizi.exception_handling.entity.Bird;
import org.springframework.data.repository.CrudRepository;

public interface BirdRepository extends CrudRepository<Bird, Long> {
}

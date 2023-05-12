package org.moussaud.micropets.pets;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface AIPetsRepository extends CrudRepository<AIPet, Long> {

}

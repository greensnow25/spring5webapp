package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Interface PublisherRepository.
 *
 * @author Alexandr Nezhelskyi
 * @version 1.0.
 * 17.02.19
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

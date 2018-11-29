package reex;

import org.springframework.data.repository.CrudRepository;
import reex.ClientePermuta;

// this will be AUTO IMPLEMENTED by Spring into a Bean called corretorRepository
// CRUD = Create, Read, Update, Delete
public interface CorretorRepository extends CrudRepository<Corretor, Integer> {

}
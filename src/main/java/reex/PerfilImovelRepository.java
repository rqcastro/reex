package reex;

import org.springframework.data.repository.CrudRepository;
import reex.PerfilImovel;

// this will be AUTO IMPLEMENTED by Spring into a Bean called perfilImovelRepository
// CRUD = Create, Read, Update, Delete
public interface PerfilImovelRepository extends CrudRepository<PerfilImovel, Integer> {
}

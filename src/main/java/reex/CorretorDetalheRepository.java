package reex;


import org.springframework.data.repository.CrudRepository;
import reex.CorretorDetalheRepository;


// this will be AUTO IMPLEMENTED by Spring into a Bean called corretordetalheRepository
// CRUD = Create, Read, Update, Delet

public interface CorretorDetalheRepository extends CrudRepository<CorretorDetalhe, Integer>{
}


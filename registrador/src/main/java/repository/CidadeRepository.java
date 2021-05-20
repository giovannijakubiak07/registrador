package repository;

import java.util.List;

import com.registrador.model.Cidade;
import com.registrador.model.Estado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/**
 * CidadeRepository
 */
@Repository
public interface CidadeRepository extends  JpaRepository<Cidade, Long>{

    List<Cidade> findByEstado(Estado estado);
    
}
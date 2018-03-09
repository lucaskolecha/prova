package br.kolecha.jau.repository;

import br.kolecha.jau.Empresa;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends GumgaCrudRepository<Empresa, String> {
}

package br.com.fiap.whycry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.whycry.model.Choro;

public interface ChoroRepository extends JpaRepository<Choro, Long> {
    
}

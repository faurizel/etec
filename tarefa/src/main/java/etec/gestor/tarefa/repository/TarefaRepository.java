package etec.gestor.tarefa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import etec.gestor.tarefa.entity.Tarefa;


public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
	public Optional<Tarefa> findById(Long id);
}

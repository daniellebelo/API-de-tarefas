package com.todolist.tarefas.repository;

import com.todolist.tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository já traz vários métodos prontos: save, findAll, findById, delete...
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}

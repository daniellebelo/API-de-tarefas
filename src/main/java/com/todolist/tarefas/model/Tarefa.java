package com.todolist.tarefas.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private String status;
    private LocalDateTime dataCriacao = LocalDateTime.now();

    public Tarefa() {}

    public Tarefa(String titulo, String descricao, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }

    // Getters e Setters
    public Long getId() { return id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getDataCriacao() { return dataCriacao; }
    public void setDataCriacao(LocalDateTime dataCriacao) { this.dataCriacao = dataCriacao; }
}
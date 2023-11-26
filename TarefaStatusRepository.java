package com.anamarcello.atividade_pratica_14.repository;

import com.anamarcello.atividade_pratica_14.entitiy.TarefaStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaStatusRepository extends JpaRepository<TarefaStatus, Integer> {
}

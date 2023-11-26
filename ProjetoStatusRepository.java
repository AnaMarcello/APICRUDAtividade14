package com.anamarcello.atividade_pratica_14.repository;

import com.anamarcello.atividade_pratica_14.entitiy.ProjetoStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoStatusRepository extends JpaRepository<ProjetoStatus, Integer> {
}

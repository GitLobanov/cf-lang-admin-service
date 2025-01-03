package com.concifora.admin.repository;

import com.concifora.admin.domain.entity.VocabDefinitions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;
import java.util.Set;

public interface VocabDefinitionsRepository extends JpaRepository<VocabDefinitions, Long>, JpaSpecificationExecutor<VocabDefinitions> {
    Set<VocabDefinitions> findSetByVocab_WordIgnoreCase(String word);
    Optional<VocabDefinitions> findByVocab_WordIgnoreCase(String word);
}
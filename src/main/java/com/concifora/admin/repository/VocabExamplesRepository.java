package com.concifora.admin.repository;

import com.concifora.admin.domain.entity.VocabExamples;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Set;

public interface VocabExamplesRepository extends JpaRepository<VocabExamples, Long>, JpaSpecificationExecutor<VocabExamples> {

    Set<VocabExamples> findByVocabs_WordIgnoreCase(String word);
    Set<VocabExamples> findByTextContainsIgnoreCase(String text);

}
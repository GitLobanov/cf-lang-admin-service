package com.concifora.admin.repository;

import com.concifora.admin.domain.entity.Vocab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface VocabRepository extends JpaRepository<Vocab, Long>, JpaSpecificationExecutor<Vocab> {

    Optional<Vocab> findByWord(String word);

}
package com.concifora.admin.repository;

import com.concifora.admin.domain.constant.TranslationType;
import com.concifora.admin.domain.entity.VocabTranslation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;
import java.util.Set;

public interface VocabTranslationRepository extends JpaRepository<VocabTranslation, Long>, JpaSpecificationExecutor<VocabTranslation> {

    Set<VocabTranslation> findByTranslationType(TranslationType translationType);
    Set<VocabTranslation> findByTranslationTypeAndVocabSource_WordIgnoreCase(TranslationType translationType, String word);

    Optional<VocabTranslation> findByVocabSource_WordIgnoreCaseOrVocabTarget_WordIgnoreCase(String source, String target);


}
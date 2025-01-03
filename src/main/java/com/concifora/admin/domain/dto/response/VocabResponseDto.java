package com.concifora.admin.domain.dto.response;

import com.concifora.admin.domain.dto.VocabAntonymDto;
import com.concifora.admin.domain.dto.VocabDefinitionDto;
import com.concifora.admin.domain.dto.VocabExampleDto;
import com.concifora.admin.domain.dto.VocabSlangDto;
import com.concifora.admin.domain.dto.VocabSynonymDto;
import com.concifora.admin.domain.dto.VocabWordDto;
import lombok.Builder;

import java.util.Set;

@Builder
public record VocabResponseDto(
        Set<VocabWordDto> translations,
        Set<VocabDefinitionDto> definitions,
        Set<VocabExampleDto> examples,
        Set<VocabAntonymDto> antonyms,
        Set<VocabSynonymDto> synonyms,
        Set<VocabSlangDto> slangs
) {
}

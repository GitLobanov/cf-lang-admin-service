package com.concifora.admin.domain.dto;

import com.concifora.admin.domain.entity.Vocab;
import com.concifora.admin.domain.constant.LanguageCode;
import lombok.Builder;

/**
 * DTO for {@link Vocab}
 */
@Builder
public record VocabWordDto(
        LanguageCode languageCode,
        String word) {
}
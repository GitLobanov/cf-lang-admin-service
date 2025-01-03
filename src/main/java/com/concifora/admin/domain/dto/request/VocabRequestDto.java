package com.concifora.admin.domain.dto.request;

import com.concifora.admin.domain.constant.LanguageCode;
import com.concifora.admin.domain.constant.TranslationType;
import lombok.Builder;

import java.util.List;

@Builder
public record VocabRequestDto(
        String word,
        TranslationType translationType,
        LanguageCode langSourceCode,
        List<LanguageCode> langTargetCode
) {
}

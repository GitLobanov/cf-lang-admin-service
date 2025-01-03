package com.concifora.admin.domain.dto.request;

public record VocabCreationRequestDto(
//        List<VocabCreation> vocabs
        Integer id,
        String en,
        String ru,
        String tr
) {
    public record VocabCreation (
            Integer id,
            String en,
            String ru,
            String tr
    ) {
    }
}

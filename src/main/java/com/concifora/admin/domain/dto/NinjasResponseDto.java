package com.concifora.admin.domain.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class NinjasResponseDto {

    String word;
    String definition;
    List<String> synonyms;
    List<String> antonyms;

}

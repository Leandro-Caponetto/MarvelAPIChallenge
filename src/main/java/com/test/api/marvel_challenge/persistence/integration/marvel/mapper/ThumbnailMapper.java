package com.test.api.marvel_challenge.persistence.integration.marvel.mapper;

import com.fasterxml.jackson.databind.JsonNode;
import com.test.api.marvel_challenge.persistence.integration.marvel.dto.ThumbnailDto;

public class ThumbnailMapper {
    /**
     * Convierte un objeto JsonNode en un objeto ThumbnailDto.
     *
     * @param thumbnailNode El nodo JsonNode que contiene información sobre la miniatura.
     * @return Un objeto ThumbnailDto que representa la miniatura.
     * @throws IllegalArgumentException Si el nodo JsonNode es nulo.
     */
    public static ThumbnailDto toDto(JsonNode thumbnailNode){
        if(thumbnailNode == null){
            throw new IllegalArgumentException("El nodo json no puede ser null");
        }

        ThumbnailDto dto = new ThumbnailDto(
                thumbnailNode.get("path").asText(),
                thumbnailNode.get("extension").asText()
        );

        return dto;
    }
}

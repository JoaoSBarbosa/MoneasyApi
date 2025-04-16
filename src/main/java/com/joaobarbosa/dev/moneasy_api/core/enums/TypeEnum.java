package com.joaobarbosa.dev.moneasy_api.core.enums;

import lombok.Getter;

@Getter
public enum TypeEnum {

    RECEITA("Receita"),
    DESPESA("Despesa");

    private final String description;

    TypeEnum(String description) {
        this.description = description;
    }

    public static TypeEnum fromDescription(String description) {
        for(TypeEnum type: values()) {
            if(type.description.equals(description)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Descrição inválida: " + description);
    }
}

package com.joaobarbosa.dev.moneasy_api.core.enums;

public enum TransactionType {

    RECEITA("Receita"),
    DESPESA("Despesa");

    private final String description;

    TransactionType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static TransactionType fromDescription(String description) {
        for(TransactionType type: values()) {
            if(type.description.equals(description)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Descrição inválida: " + description);
    }
}

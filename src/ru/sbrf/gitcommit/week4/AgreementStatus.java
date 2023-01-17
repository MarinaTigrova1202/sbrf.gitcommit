package ru.sbrf.gitcommit.week4;

public enum AgreementStatus {
    DRAFT("черновик"), ACTIVE("активен"), CLOSED("закрыт");

    private String description;

    AgreementStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

package ru.sbrf.gitcommit.week4;

public class Agreement {
    private AgreementStatus agreementStatus;

    public Agreement() {

    }

    public Agreement(AgreementStatus agreementStatus) {
        this.agreementStatus = agreementStatus;
    }

    public AgreementStatus getAgreementStatus() {
        return agreementStatus;
    }

    public void setAgreementStatus(AgreementStatus agreementStatus) {
        this.agreementStatus = agreementStatus;
    }
}

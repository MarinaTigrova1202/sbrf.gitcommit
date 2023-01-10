package ru.sbrf.gitcommit.week2;

//расширение класса Agreement
public class RealtyAgreement extends Agreement {
    RealtyObject realtyObject;

    public RealtyObject getRealtyObject() {
        return realtyObject;
    }

    public void setRealtyObject(RealtyObject realtyObject) {
        this.realtyObject = realtyObject;
    }

    @Override
    public String toString() {
        return "RealtyAgreement{" +
                "realtyObject=" + realtyObject +
                ", reference='" + reference + '\'' +
                ", amount=" + amount +
                ", applicant=" + applicant +
                "} " + super.toString();
    }
}

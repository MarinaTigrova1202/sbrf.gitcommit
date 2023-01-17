package ru.sbrf.gitcommit.week4.service;

import ru.sbrf.gitcommit.week4.Agreement;
import ru.sbrf.gitcommit.week4.AgreementStatus;

public class AgreementService {
    public void close(Agreement agreement) {
        switch (agreement.getAgreementStatus()) {
            case CLOSED:
                System.out.println("Аккредитив закрыт");
                break;
            case DRAFT:
                System.out.println("Удаляем черновик");
                break;
            case ACTIVE:
                System.out.println("Закрываем аккредитив");
                break;
        }

        agreement.setAgreementStatus(AgreementStatus.CLOSED);
    }
}

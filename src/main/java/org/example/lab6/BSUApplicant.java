package org.example.lab6;

public class BSUApplicant implements Applicant {
    @Override
    public void getCertificate() {
        System.out.println("Получен аттестат БГУ");
    }

    @Override
    public void fillApplication() {
        System.out.println("Заполнено заявление БГУ");
    }

    @Override
    public void registerForEntranceExam() {
        System.out.println("Зарегистрировано на вступительные испытания БГУ");
    }

    @Override
    public void passEntranceExam() {
        System.out.println("Прошел вступительные испытания БГУ");
    }

    @Override
    public void submitDocuments() {
        System.out.println("Поданы документы в приемную комиссию БГУ");
    }

    public void additionalBSUAbility() {
        System.out.println("Дополнительная возможность для абитуриента БГУ");
    }
}
package org.example.lab6;

public class BSUIRApplicant implements Applicant {
    @Override
    public void getCertificate() {
        System.out.println("Получен аттестат БГУИР");
    }

    @Override
    public void fillApplication() {
        System.out.println("Заполнено заявление БГУИР");
    }

    @Override
    public void registerForEntranceExam() {
        System.out.println("Зарегистрировано на вступительные испытания БГУИР");
    }

    @Override
    public void passEntranceExam() {
        System.out.println("Прошел вступительные испытания БГУИР");
    }

    @Override
    public void submitDocuments() {
        System.out.println("Поданы документы в приемную комиссию БГУИР");
    }

    public void additionalBSUIRAbility() {
        System.out.println("Дополнительная возможность для абитуриента БГУИР");
    }
}
package org.example.lab6;

public class LabRunner6 {
    public static void runLab() {
        Applicant bsuApplicant = new BSUApplicant();
        Applicant bsuirApplicant = new BSUIRApplicant();

        bsuApplicant.getCertificate();
        bsuApplicant.fillApplication();
        bsuApplicant.registerForEntranceExam();
        bsuApplicant.passEntranceExam();
        bsuApplicant.submitDocuments();
        ((BSUApplicant) bsuApplicant).additionalBSUAbility();

        bsuirApplicant.getCertificate();
        bsuirApplicant.fillApplication();
        bsuirApplicant.registerForEntranceExam();
        bsuirApplicant.passEntranceExam();
        bsuirApplicant.submitDocuments();
        ((BSUIRApplicant) bsuirApplicant).additionalBSUIRAbility();
    }
}
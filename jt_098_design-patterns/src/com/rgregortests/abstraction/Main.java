package com.rgregortests.abstraction;

/* ABSTRACTION */
public class Main {
    public static void main(String[] args) {
        var mailService = new MailService();
        mailService.sendEmail();
    }
}
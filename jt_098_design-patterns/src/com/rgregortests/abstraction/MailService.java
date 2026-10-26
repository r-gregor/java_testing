package com.rgregortests.abstraction;

public class MailService {
    public void sendEmail() {
        connect(1);
        authenticate();
        // send email

        disconnect();
    }

    private void connect(int timeout) {
        System.out.println("Connect!" + "\ntimeout is: " + timeout + ".");
    }

    private void disconnect() {
        System.out.println("Disconnect!");
    }

    private void authenticate() {
        System.out.println("Authenticate!");
    }
}


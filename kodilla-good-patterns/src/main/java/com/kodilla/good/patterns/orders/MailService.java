package com.kodilla.good.patterns.orders;

public class MailService implements InformationService {
    @Override
    public void inform(User user, Item item) {
        System.out.println("Mail has sent to " + user.getName() + " " + user.getUserName()
                + " at about purchase completion " + item.getQuantity() + " position of: " + item.getNameOfItem());
    }
}

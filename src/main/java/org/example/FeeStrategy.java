package org.example;

public interface FeeStrategy {
    public final int ADULT_EXCLUSIVE_LIMIT = 14;

    double calculate(TicketType ticketType);
    boolean accept(Visitor visitor);
}

package org.example;

public class ChildFeeStrategy {
    private final double CHILD_PRICE_BASE = 100;

    public double calculateChildFee(TicketType ticketType) {
        if (TicketType.HALF_DAY == ticketType) {
            return CHILD_PRICE_BASE * 0.2;
        } else if (TicketType.FULL_DAY == ticketType) {
            return CHILD_PRICE_BASE * 0.5;
        }
        throw (new IllegalArgumentException("TicketType not supported"));
    }
}
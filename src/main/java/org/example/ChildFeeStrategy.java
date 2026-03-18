package org.example;

public class ChildFeeStrategy implements FeeStrategy {
    private final double CHILD_PRICE_BASE = 100;

    @Override
    public double calculate(TicketType ticketType) {
        if (TicketType.HALF_DAY == ticketType) {
            return CHILD_PRICE_BASE * 0.2;
        } else if (TicketType.FULL_DAY == ticketType) {
            return CHILD_PRICE_BASE * 0.5;
        }
        throw (new IllegalArgumentException("TicketType not supported"));
    }

    @Override
    public boolean accept(Visitor visitor) {
        return visitor.getAge() <= ADULT_EXCLUSIVE_LIMIT;
    }
}
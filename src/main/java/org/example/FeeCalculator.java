package org.example;

import java.util.List;

public class FeeCalculator {
    private static List<FeeStrategy> strategies = List.of(
            new ChildFeeStrategy(),
            new AdultFeeStrategy()
    );

    public static double calculateFee(Visitor visitor, TicketType ticketType) {
        double fee = 0;
        FeeStrategy strategy;

        int i = 0;
        boolean trouve = false;
        int cpteurStrategies = 0;

        while(i < strategies.size()){
            strategy = strategies.get(i);
            if(strategy.accept(visitor)){
                fee = strategy.calculate(ticketType);
                cpteurStrategies++;
            }
            i++;
        }
        if(cpteurStrategies != 1){
            throw new IllegalStateException();
        }

        return fee;
    }

}

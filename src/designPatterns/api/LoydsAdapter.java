package designPatterns.api;

import designPatterns.Context;
import designPatterns.service.FKTCService;

public class LoydsAdapter {



    FKTCService fktcService = Context.fktcService;

    public void chargeDebitCard(){
        System.out.println("Debit car charged - LoydBank");
        fktcService.report();

    }
}

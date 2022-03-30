package designPatterns.api;

import designPatterns.Context;
import designPatterns.service.BankAuthService;
import designPatterns.service.FKTCService;

public class CitatdeleBankAdapter {

    BankAuthService bankAuthService = Context.bankAuthService;
    FKTCService fktcService = Context.fktcService;


    public void chargeCard(){
bankAuthService.connect();
        System.out.println("Charge card! Citadele");
    }
    public void transferMoney(){
        System.out.println("Money transfer - Swedbank");
        fktcService.report();
    }
}

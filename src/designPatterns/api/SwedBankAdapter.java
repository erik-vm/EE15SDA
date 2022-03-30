package designPatterns.api;

import designPatterns.Context;
import designPatterns.service.BankAuthService;
import designPatterns.service.FKTCService;

public class SwedBankAdapter {

    BankAuthService bankAuthService = Context.bankAuthService;
    FKTCService fktcService = Context.fktcService;

    public void chargeCard(){
        bankAuthService.connect();
        System.out.println("Charge card! Swedbank");
    }

    public void transferMoney(){
        System.out.println("Money transfer - Swedbank");
        fktcService.report();
    }
}

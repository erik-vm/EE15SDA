package designPatterns;

import designPatterns.service.BankAuthService;
import designPatterns.service.FKTCService;

public class Context {

    public static BankAuthService bankAuthService = new BankAuthService();

    public static FKTCService fktcService = new FKTCService();


}

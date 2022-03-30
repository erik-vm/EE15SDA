package designPatterns;

import designPatterns.api.CitatdeleBankAdapter;
import designPatterns.api.LoydsAdapter;
import designPatterns.api.NorvikBankAdapter;
import designPatterns.api.SwedBankAdapter;

public class Main {
    public static void main(String[] args) {

        CitatdeleBankAdapter citatdeleBankAdapter = new CitatdeleBankAdapter();
        SwedBankAdapter swedBankAdapter = new SwedBankAdapter();
        NorvikBankAdapter norvikBankAdapter = new NorvikBankAdapter();
        LoydsAdapter loydsAdapter = new LoydsAdapter();
/*

        citatdeleBankAdapter.chargeCard();
        swedBankAdapter.chargeCard();
        norvikBankAdapter.chargeCard();
*/

       /* citatdeleBankAdapter.transferMoney();
        swedBankAdapter.transferMoney();
        norvikBankAdapter.transferMoney();
        loydsAdapter.chargeDebitCard();*/


    }
}

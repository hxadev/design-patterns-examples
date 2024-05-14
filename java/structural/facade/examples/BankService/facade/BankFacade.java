package structural.facade.examples.BankService.facade;

import java.math.BigDecimal;
import java.util.Hashtable;

import structural.facade.examples.BankService.models.Chequing;
import structural.facade.examples.BankService.models.IAccount;
import structural.facade.examples.BankService.models.Invesment;
import structural.facade.examples.BankService.models.Saving;

public class BankFacade {
    private Hashtable<Integer, IAccount> bankAccounts;

    public BankFacade() {
        this.bankAccounts = new Hashtable<>();
    }

    public int createNewAcount(String type, BigDecimal initAmount) {
        IAccount account = null;

        switch (type) {
            case "chequing":
                account = new Chequing();
                break;

            case "invesment":
                account = new Invesment();
                break;

            case "saving":
                account = new Saving();
                break;

            default:
                System.out.println("Invalid account type");
                break;
        }

        if (account != null) {
            this.bankAccounts.put(account.getAccountNumber(), account);
            return account.getAccountNumber();
        }
        return -1;
    }

    public void transferMoney(int to, int from, BigDecimal amount){

        IAccount toAccount = this.bankAccounts.get(to);
        IAccount fromAccount = this.bankAccounts.get(from);

        fromAccount.transfer(amount, toAccount);
    }
}

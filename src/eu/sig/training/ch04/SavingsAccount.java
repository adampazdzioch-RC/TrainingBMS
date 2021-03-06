package eu.sig.training.ch04;

import eu.sig.training.ch04.Money;

// tag::SavingsAccount[]
public class SavingsAccount {
    CheckingAccount registeredCounterAccount;

    public Transfer makeTransfer(String counterAccount, Money amount) 
        throws BusinessException {
        // 1. Assuming result is 9-digit bank account number, validate 11-test:
        AccontNumberValidator.checkControlSum( counterAccount );

        // 2. Look up counter account and make transfer object:
        CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
        Transfer result = new Transfer(this, acct, amount); // <2>
        // 3. Check whether withdrawal is to registered counter account:
        WithdrawalValidator.checkWithdrawal(result, registeredCounterAccount);

        return result;
    }


}
// end::SavingsAccount[]

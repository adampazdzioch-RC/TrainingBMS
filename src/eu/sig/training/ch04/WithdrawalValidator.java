package eu.sig.training.ch04;

/**
 * Created by apazdzioch on 22.11.16.
 */ class WithdrawalValidator {
    static void checkWithdrawal(Transfer result, CheckingAccount registeredCounterAccount) throws BusinessException {
        if (!result.getCounterAccount().equals(registeredCounterAccount)) {
            throw new BusinessException("Counter-account not registered!");
        }
    }
}

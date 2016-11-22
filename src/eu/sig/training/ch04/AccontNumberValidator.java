package eu.sig.training.ch04;

/**
 * Created by apazdzioch on 22.11.16.
 */
public class AccontNumberValidator {
    private static int getSum( String counterAccount ) {
        int sum = 0; // <1>
        for (int i = 0; i < counterAccount.length(); i++) {
            sum = sum + (9 - i) * Character.getNumericValue(
                    counterAccount.charAt(i));
        }

        return sum;
    }

    static void checkControlSum( String counterAccount ) throws BusinessException {
        int sum = getSum( counterAccount );

        if (sum % 11 != 0) {
            throw new BusinessException("Invalid account number!!");
        }
    }
}

package rank;

import java.util.regex.Pattern;

/**
 * created by @author suraj on 05/11/19
 */
public class StrongPassword {

    static int minimumNumber(int n, String password) {

        // Return the minimum number of characters to make the password strong
        int minCharacter = 0;
        //checkCapital
        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            minCharacter++;
        }
        if (!Pattern.compile("[a-z]").matcher(password).find()) {
            minCharacter++;
        }
        if (!Pattern.compile("[!@#$%^&*()\\-+]").matcher(password).find()) {
            minCharacter++;
        }
        if (!Pattern.compile("[0-9]").matcher(password).find()) {
            minCharacter++;
        }

        if (password.length() + minCharacter < 6) {
            minCharacter += 6 - (password.length() + minCharacter);
        }

        return minCharacter;

    }

    public static void main(String[] args) {
        System.out.println(minimumNumber(3,"AUzs-nV"));

    }
}

public class PasswordVerifier {
    public static void main(String[] args) {
        System.out.println(isPasswordValid("aasdasdaA1122@")); // Valid password
        System.out.println(isPasswordValid("aasdasdaA@")); // Invalid password, missing digit
        System.out.println(isPasswordValid("aasdasdaA12")); // Invalid password, missing symbol
        System.out.println(isPasswordValid("aasdasda12#")); // Invalid password, missing uppercase
        System.out.println(isPasswordValid("aasA12#")); // Invalid password, missing length
    }

    public static boolean isPasswordValid(String password) {
        boolean validLength = password.length() >= 8;
        boolean validUppercase = isStringUpperCase(password);
        boolean validNumeric = isNumeric(password);
        boolean validSymbol = password.contains("_") || password.contains("@") || password.contains("#") || password.contains("$") || password.contains("/") || password.contains("&");
        return validLength && validUppercase && validNumeric && validSymbol;
    }

    public static boolean isNumeric(String str) {
        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isStringUpperCase(String str) {
        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}

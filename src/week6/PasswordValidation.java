package week6;
/*
1)  String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false

 */

public class PasswordValidation {
    /*
Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
     */
    public static void main(String[] args) {
        validationOfPassword("Abcd-1");
    }

    public static boolean validationOfPassword(String password) {

        boolean passwordIsValid = false;
        boolean containsUppercase = false;
        boolean containsLowercase = false;
        boolean containsNum = false;
        boolean containsSpecialChar = false;
        boolean containsSpace = false;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                containsUppercase = true;
            }
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                containsLowercase = true;
            }
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                containsNum = true;
            }
            if (!(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') && !(password.charAt(i) >= 'a' && password.charAt(i) <= 'z') && !(password.charAt(i) >= '0' && password.charAt(i) <= '9')) {
                containsSpecialChar = true;
            }
            if (password.contains(" ")) {
                containsSpace = true;
            }
        }


        if (containsLowercase && containsUppercase && containsNum && containsSpecialChar && !containsSpace && password.length() >= 6) {
            passwordIsValid = true;
        }
        System.out.println(passwordIsValid);
        return passwordIsValid;
    }
}

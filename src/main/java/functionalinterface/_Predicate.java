package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
       System.out.println(isPhoneValid("9403043403"));
       System.out.println(isPhoneValid("+91 9007097073"));

       System.out.println(isPhoneNumberValid.test("+91029094"));
       System.out.println(isPhoneNumberValid.test("+919007097073"));
       System.out.println(isPhoneNumberValid.and(containsNumber2).test("+910208998989"));

    }

    static boolean isPhoneValid(String phoneNumber){
        return phoneNumber.startsWith("+91") && phoneNumber.length() > 10;
    }
    static Predicate<String> isPhoneNumberValid = phone -> phone.startsWith("+91") && phone.length() > 10;

    static Predicate<String> containsNumber2 = phone -> phone.contains("2");
}

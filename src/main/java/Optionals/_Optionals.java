package Optionals;

import java.util.Optional;

public class _Optionals {
    public static void main(String[] args) {
       Object value = Optional.ofNullable("input").orElseGet(() -> "default value");
       System.out.println(value);
       Optional.ofNullable("cherry@gmail.com").ifPresentOrElse((email) -> System.out.println(new StringBuilder().append("sending email to ").append(email).toString()),
               () ->{
           System.out.println("cannot send email");
               });
    }

}

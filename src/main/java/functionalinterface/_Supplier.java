package functionalinterface;

import java.util.function.Supplier;

//supplier of values
public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getConnectionSupplier.get());
    }

    static String getDBConnection(){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getConnectionSupplier = () -> "jdbc://localhost:5432/users";
}

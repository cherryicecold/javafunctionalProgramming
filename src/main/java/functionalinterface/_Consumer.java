package functionalinterface;

import java.net.StandardSocketOptions;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

//represents an operation that accepts a single input argument and returns no result.
public class _Consumer {
    public static void main(String[] args) {
    greetCustomer(new Customer("Maria","9999"));
    greetCustomerConsumer.accept(new Customer("Alex","99900"));
    greetCustomerConsumerV2.accept(new Customer("yash","04920"), false);
    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName + ", thanks for registering phone number "
            + customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhone) -> System.out.println("Hello " + customer.customerName + ", thanks for registering phone number "
            + (showPhone ? customer.customerPhoneNumber : "*********"));


    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number "
        + customer.customerPhoneNumber);
    }

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}

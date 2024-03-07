import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> cList = new ArrayList<>();
        Customer customer = new Customer("Lo", "bo", "b1", 1);
       Customer customer1 = new Customer("Lars", "Hansen", "L4RS", 2 );
        cList.add(customer);
        cList.add(customer1);

        printCustomers (cList);

        }

    private static void printCustomers(ArrayList<Customer> cList) {

        for (Customer cList1: cList){
            System.out.println(cList1);

        }


    }
}

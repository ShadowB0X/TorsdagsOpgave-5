public class Customer {


    private String firstName;
   private String lastName;
   private  String username;
    private int id;
    private static int counter;
Customer(String firstName, String lastName, String username, int id){
    counter = counter + 1;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.id = id;


}
@Override
public String toString (){
    String output = "Navn: " + firstName + " Efternavn: " + lastName + " Username: " + username + " ID: " + id;
    return output;
}

    public String getFirstName() {
        return firstName;
    }



    public String getLastName(){
    return  lastName;
    }

    public String getUsername() {
        return username;
    }


    public static int getCounter() {
        return counter;
    }


    public int getId() {
        return id;
    }
}

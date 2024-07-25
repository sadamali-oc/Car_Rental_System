package Model;

public class Client extends  User {

    public Client() {
        super();
    }

    @Override
    public void showList() {
        System.out.println("\n1. View Car");
        System.out.println("\n2. Rent Cars");
        System.out.println("\n3. Return Car");
        System.out.println("\n4. Show My Rents");
        System.out.println("\n5. Edit My Data");
        System.out.println("\n7. Quit\n");


    }
}

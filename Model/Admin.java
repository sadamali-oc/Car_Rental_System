package Model;

public class Admin extends  User {
    public Admin() {
        super();
    }

    @Override
    public void showList() {

        System.out.println("\n1. Add New Car");
        System.out.println("\n2. View Cars");
        System.out.println("\n3. Update Car");
        System.out.println("\n4. Delete Car");
        System.out.println("\n5. Add New Admin");
        System.out.println("\n6. Show Rents");
        System.out.println("\n7. Quit\n");



    }
}

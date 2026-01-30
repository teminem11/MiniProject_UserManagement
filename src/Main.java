import model.User;
import service.UserService;

public class Main {
    public static void main(String[] args){

        UserService service = new UserService();
        User user1 = new User(1, "Tom", 25);
        User user2 = new User(2, "Misha", 69);
        User user3 = new User(3, "Alice", 12);
        User user4 = new User(4, "Nikol", 44);
        User user5 = new User(5, "Max", 29);

        service.addUser(user1);
        service.addUser(user2);
        service.addUser(user3);
        service.addUser(user4);
        service.addUser(user5);

        System.out.println("All users: "+service.getAllUsers().toString());
        System.out.println("Sorted by age asc: "+service.sortByAgeAsc().toString());
        System.out.println("Sorted by age desc: "+service.sortByAgeDesc().toString());
        System.out.println("Sorted by name: "+service.sortByName().toString());
        System.out.println("Find User using ID: "+service.getById(5).toString());

    }
}

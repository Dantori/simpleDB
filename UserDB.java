import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserDB {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("\nAdd a new user? 1 - yes, 0 - no: ");
                int x = scanner.nextInt();
                if (x == 1) {
                    try {
                        System.out.print("Enter id: ");
                        long id = scanner.nextLong();
                        scanner.nextLine();

                        System.out.print("Enter username: ");
                        String username = scanner.nextLine();

                        System.out.print("Enter password: ");
                        String password = scanner.nextLine();

                        users.add(User.addUser(id, username, password));
                    } catch (InputMismatchException e) {
                        System.out.println("You have entered the wrong data!");
                        scanner.nextLine();
                    }
                } else if (x == 0) {
                    System.out.println();
                    break;
                }
            }
        }

        for (User user : users) {
            System.out.println(user.toString());
        }
        System.out.println();
    }
}
import java.util.Scanner;

public class ManagerPhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook myPhoneBook = new PhoneBook();
        String choose = null;
        boolean exit = false;
        showMenu();
        while (true) {
            String name = null;
            String phoneNumber = null;
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Enter Name: ");
                    name = scanner.nextLine();
                    System.out.println("Enter Phone Number: ");
                    phoneNumber = scanner.nextLine();
                    myPhoneBook.insertPhone(name, phoneNumber);
                    break;
                case "2":
                    System.out.println("Enter Name: ");
                    name = scanner.nextLine();
                    System.out.println("Enter Phone Number: ");
                    phoneNumber = scanner.nextLine();
                    myPhoneBook.updatePhone(name, phoneNumber);
                    break;
                case "3":
                    System.out.println("Enter Name: ");
                    name = scanner.nextLine();
                    myPhoneBook.removePhone(name);
                case "4":
                    myPhoneBook.sortPhone();
                    break;
                case "5":
                    myPhoneBook.displayPhoneBook();
                    break;
                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }

    // create menu
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println(" chào mừng tới menu mất toi chủ 7 của chế T_T, lựa lựa mà bấm, tứk lắm á :/ ");
        System.out.println("1. Insert Phone ");
        System.out.println("2. Edit Phone ");
        System.out.println("3. Delete Phone with name");
        System.out.println("4. Sort Phone by name");
        System.out.println("5. Show Phone book");
        System.out.println("0. exit");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}


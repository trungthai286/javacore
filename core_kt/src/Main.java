import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends User{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("trungthai", "123456", "a01", "0900123456", "Ha Noi", 0));
        userList.add(new User("ngocquynh", "654321", "a02", "0800123456", "Ha Noi", 0));
        userList.add(new User("thaonguyen", "012345", "a03", "0700123456", "Ha Noi", 0));
        User.convertUserToJsonFile("Userlist.json", userList);

        String fileUser = "Userlist.json";
        StartMenu();
        int choose;
        do {
            choose = Integer.parseInt(scan.nextLine());

            switch (choose) {
                case 1:Login();

                default:
                    System.out.println("Mời chọn lại : ");
                    break;
            }
        }while(choose != 3);

    }


    static void StartMenu() {
        System.out.println("Mời chọn:");
        System.out.println("1. Đăng nhập");
        System.out.println("2. Quên mật khẩu");
        System.out.println("3. Thoát");
    }



     public static void Login(Scanner scan,String fileUser) {
        System.out.println("===== WELCOME ======");
        System.out.println("User Name: ");
        String username = scan.nextLine();

        System.out.println("Password: ");
        String password = scan.nextLine();
        List<User> userList=ge
        if(username.equalsIgnoreCase() {
            System.out.println("Login Success!!!");
        } else {
            System.err.println("Login Failed!!!");
            //de quy.
            Login();
        }
}

}
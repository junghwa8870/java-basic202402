package etc.exception.custom;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserLogin user = new UserLogin("abc1234", "aaa1111!");

        System.out.println("id: ");
        String id = sc.next();
        System.out.println("pw: ");
        String pw = sc.next();

        try {
            String result = user.logValidate(id, pw);
            System.out.println("result = " + result);
        } catch (LoginValidateException e) {
            e.printStackTrace();
        }

        sc.close();


    }
}

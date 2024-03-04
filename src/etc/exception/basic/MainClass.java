package etc.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        /*
         1. 스캐너를 통해서 정수 2개를 입력받습니다.
         2. 입력받은 값이 정수라면, 단순히 입력받은 정수의 합을 출력하고
          반복문을 종료시키세요.
         3. 입력받은 값이 에러를 발생시키는 값이라면 "정수로만 입력하세요"
          를 출력한 후에 다시 입력받을 수 있도록 작성해 주세요.
         4. 반복문을 탈출하면 프로그램 정상 종료 문장을 띄워 주세요.

         (만약 nextInt()가 정수를 가지고 오지 못하는 경우 (문자열 등등)
         버퍼에 해당 쓰레기 문자가 그대로 남아 있습니다. 그걸 걷어가 주셔야 합니다.
         nextLine()를 통해 쓰레기 문자를 정리해야 합니다.)
        */

        Scanner sc = new Scanner(System.in);

        while (true) {
            try{
                System.out.println("정수 2개를 입력하세요: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                System.out.println("정수의 합: " + (num1 + num2));
                break;
            } catch (InputMismatchException e) {
                System.out.println("정수로만 입력하세요.");
                sc.nextLine();
            }
        }
        System.out.println("프로그램을 정상 종료합니다.");
        sc.close();

    }
/*
nextLine() 메서드는 주로 문자열을 입력 받는 경우나, 특정 입력 이후의 줄바꿈을 처리할 때 사용됩니다.
주로 다음과 같은 상황에서 사용됩니다:

# 문자열 입력: 사용자로부터 한 줄의 문자열을 입력 받아야 할 때 사용됩니다.
예를 들어, 사용자가 이름, 주소, 또는 문장 등을 입력할 때 사용합니다.

# 다음 줄 처리: 다른 입력 메서드(nextInt(), nextDouble() 등)를 사용한 후
입력 버퍼에 개행 문자(\n)가 남아있는 경우, 이를 처리하기 위해 nextLine()을 사용합니다.
특히, nextInt() 등으로 입력 받은 후 바로 이어서 nextLine()을 호출할 때 주의해야 합니다. 왜냐하면 nextInt() 등은 개행 문자를 읽지 않기 때문에, 다음 nextLine()이 개행 문자를 입력으로 받아들이고 즉시 종료될 수 있습니다.

# 입력 버퍼 클리어: 사용자의 입력에 오류가 발생한 경우, 입력 버퍼를 비워줄 때 사용됩니다.
예를 들어, 정수를 입력 받아야 하는데 문자열이 입력된 경우, 오류 메시지를 출력한 후에 nextLine()을 호출하여 입력 버퍼를 비워줍니다.

# 공백을 포함한 입력: nextInt()와 같은 메서드는 공백 문자를 무시하고 읽기 때문에,
공백을 포함하는 입력을 처리해야 할 때 nextLine()을 사용하여 한 줄을 통째로 읽어올 수 있습니다.

이러한 상황에서 nextLine()을 적절히 사용함으로써 입력을 올바르게 처리하고 프로그램의 안정성을 높일 수 있습니다.

 */
}


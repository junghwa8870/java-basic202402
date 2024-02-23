package oop.string;

import java.util.Scanner;

public class StringQuiz {

    public static void main(String[] args) {
/*
         1. 주민등록번호 13자리를 입력받습니다.
         2. 주민등록번호는 -을 포함해서 받을 예정입니다.
         3. 13자리가 아니라면 다시 입력받습니다.
         4. ex)
         921013-1234567 -> 1992년 10월 13일 32세 남자
         960223-2345678 -> 1996년 2월 23일 28세 여자
         031125-3456789 -> 2003년 11월 25일 21세 남자
         031125-4123456 -> 2003년 11월 25일 21세 여자

         제대로 출력이 될 때까지 다시 입력 받으세요
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호13자리를 -포함하여 입력해주세요: ");
/*
        while (true) {

            String input = sc.next();

// 입력의 길이가 14가 아닌지 확인합니다.
            if (input.length() != 14) {
                System.out.println("잘못된 입력입니다. 13자리의 주민번호를 입력하세요.");
                continue; // 반복문의 다음 반복으로 이동합니다.
            }

 // 출생 연도, 월, 일, 성별을 추출합니다.
            String year = input.substring(0, 2); // 년도는 처음 두 자리입니다.
            String month = input.substring(2, 4); // 월은 다음 두 자리입니다.
            String day = input.substring(4, 6); // 일은 그 다음 두 자리입니다.
            String genderCode = input.substring(6, 7); // 성별은 일곱 번째 자리입니다.

 // 출생 연도의 세기를 결정합니다 (00-21은 20세기, 그 외는 19세기로 가정)
            int century = (genderCode.equals(1) || genderCode.equals(2)) ? 19 : 20;
            int fullYear = Integer.parseInt(century + year);

 // 성별을 결정합니다.
            String gender = (genderCode.equals(1) || genderCode.equals(3)) ? "남자" : "여자";
 // 나이를 계산합니다.
            int currentYear = 2024;
            int age = currentYear - fullYear + 1;

 // 결과를 출력합니다.
            System.out.printf("%d년 %d월 %d일 %d세 %s\n", fullYear, Integer.parseInt(month), Integer.parseInt(day), age, gender);
 // 결과를 출력합니다.
            break;

}
//Integer.parseInt(month)는 문자열 형태의 월을 정수로 변환하는 작업입니다. 이 작업을 하는 이유는 printf 메소드에서 포맷 문자열에 %d가 사용되었기 때문입니다. %d는 정수값을 나타내는 포맷 지정자입니다. 따라서 월을 정수로 변환하여 해당 위치에 적합한 값이 출력될 수 있도록 해야 합니다.

//printf 메소드는 포맷 문자열과 매개변수로 전달된 값들을 조합하여 문자열을 형식화하여 출력하는 기능을 제공합니다. 포맷 문자열에서 %d는 정수값을 나타내며, 이에 매칭되는 매개변수는 정수형이어야 합니다. 그렇기 때문에 월을 정수로 변환하여 해당 위치에 적합한 값이 출력되도록 합니다.

//따라서 Integer.parseInt(month)를 통해 문자열 형태의 월을 정수로 변환하여 printf 메소드에 전달함으로써, 올바른 형식의 출력을 보장할 수 있습니다.

*/
        while (true) {
            String ssn = sc.next();

            if (ssn.indexOf("-") == -1) {
                System.out.println("-을 포함해서 입력하세요.");
                continue;
            } else if (ssn.length() != 14) {
                System.out.println("주민등록번호는 13자리 입니다.");
                continue;
            }

            ssn = ssn.replace("-", "");

            char c = ssn.charAt(6);
            String str = ssn.substring(0, 2);
            int year = Integer.parseInt(str); //연도를 정수로 변환
            String month = ssn.substring(2, 4);
            String day = ssn.substring(4, 6);

            if (c == '1' || c == '2') {
                year += 1900;
            } else {
                year += 2000;
            }
            int age = 2024 - year;

            String gender;

            if (c == '1' || c == '3') {
                gender = "남자";
            } else {
                gender = "여자";
            }

            System.out.printf("%d년 %s월 %s일 %d세 %s\n", year, month, day, age, gender);
            break;
        }
        sc.close();
    }
}
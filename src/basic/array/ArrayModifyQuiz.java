package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifyQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
        System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));

        // 1. 수정 타겟의 이름을 입력받는다.
        while (true) {
            System.out.println("수정할 친구 이름을 입력하세요.");
            System.out.println("수정을 종료하려면 '종료'버튼을 눌러주세요.");
            String targetName = sc.next();

            if (targetName.equals("종료")) {
                break;
            }
            // 2. 해당 이름이 있는지 탐색해본다.
            boolean found = false;
            int foundIndex = -1;
            for (int i = 0; i < kakao.length; i++) {
                if (kakao[i].equals(targetName)) {
                    found = true;
                    foundIndex = i;
                    break;
                }
            }

            if (!found) {
                System.out.println("해당하는 이름이 없습니다.");
            } else {
                System.out.println("수정할 이름을 입력하세요: ");
                String newName = sc.next();
                kakao[foundIndex] = newName;
                System.out.println("수정이 완료되었습니다.");
                System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
            }
        }

        // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.
        // 4. 탐색에 실패하면 실패한 증거를 확보한다.
        // 5. 성공했을 시 수정을 원하는 새로운 이름을 입력받는다.
        // 6. 찾은 인덱스를 통해 새로운 이름으로 수정한다.
        // 7. 위 내용을 수정이 정확히 완료될때까지 반복한다.

        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }

}











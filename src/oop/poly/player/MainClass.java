package oop.poly.player;

public class MainClass {

    public static void main(String[] args) {

        Warrior w1 = new Warrior("전사1");
        Warrior w2 = new Warrior("전사2");
        Mage m1 = new Mage("마법사1");
        Mage m2 = new Mage("마법사2");
        Hunter h1 = new Hunter("사냥꾼1");
        Hunter h2 = new Hunter("사냥꾼2");

                /*
        /*
         - 전사의 고유 기능인 rush 메서드를 작성합니다.

         - rush의 대상은 모든 직업들 입니다.

         - 만약 rush의 대상이 전사라면 10의 피해를 받고,
          마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.

         - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.

         - 남은 체력도 출력해 주세요.

         - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
         */

        Player[] targets = {w1, w2, m2, h1, h2};
        m1.blizzard(targets);

        System.out.println("---------------------------");

    }
}

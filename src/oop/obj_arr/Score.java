package oop.obj_arr;

public class Score {

        /*
     - 이름, 국어, 영어, 수학, 총점, 평균(double)을
      담을 수 있는 객체를 디자인하세요.

     - 학생의 모든 정보를 한 눈에 확인할 수 있게
      scoreInfo() 메서드를 선언해 주세요.
      메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.

     - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */

    //필드 선언
    private String name;
    private int koreanScore;
    private int englishScore;
    private int mathScore;
    private int totalScore;
    private double average;

    //생성자
    public Score(String name, int koreanScore, int englishScore, int mathScore) {
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
        this.totalScore = koreanScore + englishScore + mathScore;
        this.average = (double) totalScore / 3;

    }

public void scoreInfo() {
    System.out.println("학생 이름: " + name);
    System.out.println("국어 점수: " + koreanScore);
    System.out.println("영어 점수: " + englishScore);
    System.out.println("수학 점수: " + mathScore);
    System.out.println("총점: " + totalScore);
    System.out.println("평균: " + average);
}

//Getter와 Setter 메서드


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKoreanScore() {
        return koreanScore;
    }

    public void setKoreanScore(int koreanScore) {
        this.koreanScore = koreanScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}

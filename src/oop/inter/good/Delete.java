package oop.inter.good;

public class Delete implements IUserService {

    public Delete() {
        System.out.println("회원 탈퇴 요청이 들어옴");
    }

    @Override
    public void execute() {
        System.out.println("사용자의 아이디를 받아서 데이터베이스에서 찾아서 삭제 조치....");
    }
}
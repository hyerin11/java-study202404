package day06.member;

// 역할: 회원 배열을 관리하는 역할 - 회원 데이터 저장소
public class MemberRepository {

    // 필드
    static Member[] members;

    // 생성자
    MemberRepository() {
        this.members = new Member[3];
        members[0] = new Member("abc@def.com", "1234", "콩순이", "여성", 50);
        members[1] = new Member("ghi@def.com", "5432", "팥돌이", "남성", 40);
        members[2] = new Member("xyz@def.com", "7890", "팥죽이", "여성", 30);
    }

    // 메서드


    /**
     * 생성된 회원정보를 회원 배열에 끝에 추가하는 기능
     * @param newMember - 사용자의 입력으로 전달된 회원 정보 객체
     */
    void addNewMember(Member newMember) {

        // 배열에 데이터를 추가하는 로직
        Member[] temp = new Member[members.length + 1];
        for (int i = 0; i < members.length; i++) {
            temp[i] = members[i];
        }
        temp[temp.length - 1] = newMember;
        members = temp;
    }

    /**
     * 이메일 중복을 확인하는 기능
     * @param targetEmail - 검사할 사용자의 입력 이메일 값
     * @return - 이메일이 이미 존재한다면 true,
     *           존재하지 않는 사용가능한 이메일이면 false
     * @author - 코딩킹
     * @since 2024.04.16
     */
    boolean isDuplicateEmail(String targetEmail) {
        for (Member m : members) {
            if (targetEmail.equals(m.email)) {
                return true;
            }
        }
        return false;
    }

}
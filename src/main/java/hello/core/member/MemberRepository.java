package hello.core.member;

//회원 저장소
public interface MemberRepository {

    // 저장하는 기능
    void save(Member member);

    // 찾는 기능
    Member findById(Long memberId);
}

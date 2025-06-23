package hello.core.member;

//구현체가 하나만 있을 경우에는 그냥 인플이라고 많이 사용한다
public class MemberServiceImpl implements MemberService {

    //구현체 설정
    private  final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}

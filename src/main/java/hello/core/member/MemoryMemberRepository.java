package hello.core.member;

import java.util.HashMap;
import java.util.Map;

//구현체 -> 보통은 인터페이스랑 같은 파일 위치에 두지는 않는다 왱?????
public class MemoryMemberRepository implements MemberRepository {

    // ConcurrentHashMap을 이용해야 한다 그래야 동시성 이슈를 막아 준다!!
    private  static Map<Long, Member> store = new HashMap<>();
    // option + enter
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}

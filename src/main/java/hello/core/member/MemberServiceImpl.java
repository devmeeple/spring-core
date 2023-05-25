package hello.core.member;

public class MemberServiceImpl implements MemberService{

    private MemberRepository memberRepository = new MemoryMemberRepository();
    @Override
    public void join(Member member) {

    }

    @Override
    public Member findeMember(Long memberId) {
        return memberRepository.findById(memberId );
    }
}

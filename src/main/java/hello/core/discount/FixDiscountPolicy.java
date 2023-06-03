package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy{

    private int disCountAmount = 1000; // 1000원 할인

    // command + shift + t 테스트 케이스 만들기
    @Override
    public int discount(Member member, int price) {

        if(member.getGrade() == Grade.VIP) {
            return disCountAmount;
        } else {
            return 0;
        }

    }
}

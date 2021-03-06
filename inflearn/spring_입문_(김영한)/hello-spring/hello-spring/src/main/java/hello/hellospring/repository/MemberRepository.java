package hello.hellospring.repository;

import java.util.List;
import java.util.Optional;

import hello.hellospring.domain.Member;

public interface MemberRepository {
	Member save(Member member);
	
	Optional<Member> findById(Long id); //java8에 추가된 기능, null을 처리하는 방식 중 하나
	Optional<Member> findByName(String name);
	List<Member> findAll();
}

package com.minyul.testman.member.unit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Member Service Unit Test")
public class MemberServiceTest {

	private MemberService memberService;

	@BeforeEach
	void init() {
		memberService = new MemberService();
	}

	@DisplayName("say yo ~")
	@Test
	void sayYo() {

		// when
		String result = memberService.sayYo();

		// then
		assertThat(result).isEqualTo("yo");
	}
}

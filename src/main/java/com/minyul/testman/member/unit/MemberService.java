package com.minyul.testman.member.unit;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

	public String sayYo() {
		return "yo";
	}
}

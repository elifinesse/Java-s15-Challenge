package com.workintech.library.literature;

import com.workintech.library.people.Member;

public interface MembershipAvailable {
    String generatePassword(Member member);
    String findPhysicalCopy();
    
}

package com.stickershop.stickershop.security;

import com.stickershop.stickershop.domain.Role;
import com.stickershop.stickershop.domain.Member;
import com.stickershop.stickershop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class StickerShopUserDetailsService implements UserDetailsService {

    @Autowired
    private MemberService memberService;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        Member member = memberService.getMember(id);
        if (member == null) {
            throw new UsernameNotFoundException(id + "is not found");
        }

        Collection<GrantedAuthority> authorities = new ArrayList<>();
        for (Role role : member.getRoles()) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
        }

        StickerShopUserDetails userDetails = new StickerShopUserDetails(id, member.getPassword(), authorities);
        userDetails.setUserName(member.getMemberName());
        userDetails.setEmail(member.getEmail());
        return userDetails;
    }
}

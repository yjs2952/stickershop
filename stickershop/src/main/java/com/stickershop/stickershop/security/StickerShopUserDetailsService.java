package com.stickershop.stickershop.security;

import com.stickershop.stickershop.domain.Role;
import com.stickershop.stickershop.domain.User;
import com.stickershop.stickershop.service.UserService;
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
    private UserService userService;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        User user = userService.getUser(id);
        if (user == null) {
            throw new UsernameNotFoundException(id + "is not found");
        }

        Collection<GrantedAuthority> authorities = new ArrayList<>();
        for (Role role : user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
        }

        UserDetails userDetails = new org.springframework.security.core.userdetails.User(id, user.getPassword(), authorities);
        return userDetails;
    }
}

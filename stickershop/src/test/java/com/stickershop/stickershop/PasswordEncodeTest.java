package com.stickershop.stickershop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncodeTest {
    private PasswordEncoder passwordEncoder;

    @Before
    public void setup(){
        passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Test
    public void setPasswordEncod() throws Exception{
        String encode1 = passwordEncoder.encode("1234");
        String encode2 = passwordEncoder.encode("1234");
        String encode3 = passwordEncoder.encode("1234");
        String encode4 = passwordEncoder.encode("1234");
        String encode5 = passwordEncoder.encode("1111");

        System.out.println(encode1);
        System.out.println(encode2);
        System.out.println(encode3);
        System.out.println(encode4);
        System.out.println(encode5);
        boolean matches = passwordEncoder.matches("1111", "{bcrypt}$2a$10$iOnrbWp1ppyymX5OulbkL.kVkHDeuNmKr1So/TKcXmMLPQK1AzMTa");
        Assert.assertTrue(matches);
    }
}

package com.stickershop.stickershop.controller;

import com.stickershop.stickershop.security.StickerShopUserDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/members")
public class MemberController {

    @GetMapping("/login")
    public String loginForm(){
        return "member/loginForm";
    }

    @GetMapping("/info")
    public String info(Principal principal){
        System.out.println(principal.getName());

        StickerShopUserDetails loginUser =
                (StickerShopUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println("아이디 : "+loginUser.getUserId());
        System.out.println("이름 : "+loginUser.getUserName());
        System.out.println("이메일 : "+loginUser.getEmail());
        return "member/info";
    }
}

package com.stickershop.stickershop.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    private SecurityProperties securityProperties;

    WebSecurityConfig(SecurityProperties securityProperties) {
        this.securityProperties = securityProperties;
    }

    /*
        인증에 대한 처리를 아예 무시할 경로를 설정.
        ex> http://localhost:8080/logo.gif
        AntPathRequestMatcher : ant 문법으로 path를 지정. ant :빌드도구
        /css/** , /js/**, /images/**, /webjars/**, ** /favicon.ico
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .requestMatchers(PathRequest.toStaticResources().atCommonLocations())
                .requestMatchers(new AntPathRequestMatcher("/**.html"))
                .requestMatchers(new AntPathRequestMatcher("/static/**"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/")
                .permitAll().and()
            .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/members/login").permitAll()
                .antMatchers("/members/**").hasRole("USER")
                .anyRequest().fullyAuthenticated().and()
            .formLogin()
                .loginPage("/members/login")
                    .usernameParameter("id").passwordParameter("password")
                .loginProcessingUrl("/members/login");
    }
}

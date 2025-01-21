package com.example.ApiRest;

public class SecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/topicos").authenticated()
                .anyRequest().permitAll()
                .and()
                .httpBasic();
}

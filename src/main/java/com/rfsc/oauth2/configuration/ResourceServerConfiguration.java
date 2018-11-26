package com.rfsc.oauth2.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

@EnableResourceServer
@Configuration
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

  @Override
  public void configure(ResourceServerSecurityConfigurer resources)throws Exception{
    resources.resourceId("oauth_api");
  }

  @Override
  public void configure(HttpSecurity http) throws Exception{
    http
      .requestMatchers()
        .antMatchers("/api/**")
      .and()
        .authorizeRequests()
          .antMatchers(HttpMethod.GET, "/**").access("#oauth2.hasScope('api') and hasRole('ROLE_ADMIN')")
          .anyRequest().authenticated()
      .and()
        .exceptionHandling()
          .accessDeniedHandler(new OAuth2AccessDeniedHandler());
  }

}

package com.main.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebSecurityConfig implements WebMvcConfigurer {

	@Configuration
	protected static class ApplicationSecurity extends WebSecurityConfigurerAdapter {
		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {

			/*
			 * auth.inMemoryAuthentication().withUser("user1").password("{noop}user1").
			 * authorities("user_roles").and()
			 * .withUser("user2").password("{noop}user2").authorities("user_roles").and().
			 * withUser("user3") .password("{noop}user3").authorities("user_roles");
			 */

			auth.inMemoryAuthentication().withUser("admin").password("admin1").roles("admin").and().withUser("sales")
					.password("saleman").roles("sales_department").and().withUser("hr").password("hr@123").roles("hr");
		}

		@Bean
		public PasswordEncoder getPasswordEncoder() {
			return NoOpPasswordEncoder.getInstance();
		}

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.authorizeHttpRequests().antMatchers("/**").hasAnyRole("admin").and().formLogin();
		}

	}

}

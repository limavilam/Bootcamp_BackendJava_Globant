package com.egg.biblioteca;

import com.egg.biblioteca.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SeguridadWeb {

    //Para que la contraseña no sea simple, sino se encripte se usan esos dos métodos:
    @Autowired
    public UsuarioServicio usuarioServicio;

    //Este objeto lo recibimos por parámetro

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        //Apoyados de Spring Security revisamos el método que nos permite autenticar el usuario
        auth.userDetailsService(usuarioServicio) //Este método de userDetailsService está en UsuarioServicio, por eso pasamos el usuarioServicio
                .passwordEncoder(new BCryptPasswordEncoder());
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
       //Se permite cualquier tipo de archivo a las personas o sea ver.
        //No hizo faltar user ni password
        http
                .authorizeHttpRequests((authz) -> authz.anyRequest().permitAll())
                .formLogin(formLogin -> formLogin
                                .loginPage("/login")
                                .loginProcessingUrl("/logincheck") //No hace falta un controlador para eso, spring security se encarga
                                .usernameParameter("email")
                                .passwordParameter("password")
                                .defaultSuccessUrl("/inicio")
                                .permitAll()
                )
                .logout(logout ->  logout
                                .logoutUrl("/logout") //No hace falta un controlador para eso, spring security se encarga
                                .logoutSuccessUrl("/login")
                                .permitAll()
                )
                .csrf(csrf -> csrf.disable());

        return http.build();
    }
}

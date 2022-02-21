package org.iesalixar.servidor;

import org.iesalixar.servidor.services.JPAUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/*
 * CLASE DONDE ESTABLECEREMOS LA CONFIGURACION DE
 * AUTENTIFICACION - CÓMO ACCEDO
 * AUTORIZACION - A QUÉ PUEDO ACCEDER
 * MÉTODO DE ENCRIPTACIÓN DE LAS CONTRASEÑAS
 */

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	
	/* Obtengo una refencia al SINGLENTON del userDetailsService	 * 
	 */
	@Autowired
	JPAUserDetailsService userDetailsService;
	
	/* MÉTODO PARA AUTENTIFICAR LOS USUARIOS */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		//La autentificación JPA no está incluido tenemos que configurarla nosotros
		//Creando nuestro propio servicio que nos permita obtener la información del usuario
		auth.userDetailsService(userDetailsService);
	}

	/*
	 * MÉTODO PARA ESTABLECER AUTORIZACION - A QUÉ PUEDO ACCEDER
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		/* URL con información sobre ANT MATCHERS
		 * https://www.baeldung.com/spring-security-expressions */
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/departments","/asignaturas/*","/departments/*").hasRole("ADMIN")
		.antMatchers("/about","/services","/alumnos/*").hasRole("USER")
		.antMatchers("/register").not().authenticated()
		.and()
		.formLogin();		
	}
	
	/*
	 * ESTABLECEMOS EL PASSWORD ENCODER. FUERZA 15 (de 4 a 31)
	 */
	@Bean
    public PasswordEncoder getPasswordEncoder() {         
		return new BCryptPasswordEncoder(15);
    }
	
}

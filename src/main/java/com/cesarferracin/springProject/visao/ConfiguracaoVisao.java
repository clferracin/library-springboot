package com.cesarferracin.springProject.visao;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//Component = quando a aplicação  executar, o spring já deixa um objeto desta classe disponível para uso
//(uso = injetar esta classe em algum ponto da aplicação)
@Component
public class ConfiguracaoVisao implements WebMvcConfigurer {
	
	//Registrar no controlador as páginas de login
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/auth/auth-acesso-negado").setViewName("/auth/auth-acesso-negado");
	}

}

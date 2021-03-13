package org.generation.pessoalBlog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
@ComponentScan(basePackages = "org.generation.pessoalBlog.controller")
public class SwaggerConfig implements WebMvcConfigurer  {
	
	@Bean
	public Docket docket(){
	return new Docket(DocumentationType.SWAGGER_2)
	.select()
	.apis( RequestHandlerSelectors.basePackage("org.generation.pessoalBlog.controller") )
	.paths(PathSelectors.any())
	.build()
	.apiInfo(apiInfo());
	}
	
	
	private ApiInfo apiInfo(){
		return new ApiInfoBuilder()
		.title("Pessoal Blog")
		.description("API do Projeto de pessoal blog")
		.version("1.0")
		.contact(contact())
		.build();
		}
	
	private Contact contact(){
		return new Contact("Beatriz Oliveira",
		"https://github.com/Beatriz-Oliveira-Dev",
		"Desenvolvedora FullStack Java");
		}
//	TESTANDO CONFIGURAÇÃO DO STACKOVERFLOW
	
	@Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("swagger-ui.html")
	    .addResourceLocations("classpath:/META-INF/resources/");

	    registry.addResourceHandler("/webjars/**")
	    .addResourceLocations("classpath:/META-INF/resources/webjars/");
	  }

	
}

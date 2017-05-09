package it.martin.binder.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author Martin
 *
 * @date 04 mag 2017
 */
@Configuration
@EnableWebMvc
@ComponentScan( { "it.martin" } )
public class ApplicationConfig extends WebMvcConfigurerAdapter
{
	// Adding static resources to ResourceHandlers
	// @Override
	// public void addResourceHandlers ( ResourceHandlerRegistry registry )
	// {
	// }

	// Configuring the default servlet
	@Override
	public void configureDefaultServletHandling ( DefaultServletHandlerConfigurer configurer )
	{

		configurer.enable();
	}

	@Bean
	public InternalResourceViewResolver getViewResolver ( )
	{

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix( "/WEB-INF/pages/" );
		viewResolver.setSuffix( ".html" );
		return viewResolver;
	}

}

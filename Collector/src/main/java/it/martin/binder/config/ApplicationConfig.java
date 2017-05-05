package it.martin.binder.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

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

	// No resources right now!
	// }

	// Configuring the default servlet
	@Override
	public void configureDefaultServletHandling ( DefaultServletHandlerConfigurer configurer )
	{

		configurer.enable();
	}

	public InternalResourceViewResolver getViewResolver ( )
	{

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass( JstlView.class );
		viewResolver.setPrefix( "/WEB-INF/pages/" );
		viewResolver.setSuffix( ".html" );
		return viewResolver;
	}

}

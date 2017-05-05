package it.martin.binder.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.martin.binder.controller.HomeController;

/**
 * @author Martin
 *
 * @date 04 mag 2017
 */
@Configuration
public class DispatcherConfig
{
	@Bean
	public HomeController homeController ( )
	{

		return new HomeController();
	}
}

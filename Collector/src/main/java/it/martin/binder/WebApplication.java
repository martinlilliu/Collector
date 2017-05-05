package it.martin.binder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import it.martin.binder.config.ApplicationConfig;
import it.martin.binder.config.DispatcherConfig;

/**
 * @author Martin
 *
 * @date 04 mag 2017
 */
public class WebApplication implements WebApplicationInitializer
{
	@Override
	public void onStartup ( ServletContext container ) throws ServletException
	{

		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register( ApplicationConfig.class );
		container.addListener( new ContextLoaderListener( rootContext ) );

		AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
		dispatcherContext.register( DispatcherConfig.class );
		// container.addListener( new ContextLoaderListener( dispatcherContext )
		// );

		ServletRegistration.Dynamic dispatcher = container.addServlet( "dispatcher", new DispatcherServlet( dispatcherContext ) );
		dispatcher.setLoadOnStartup( 1 );
		dispatcher.setAsyncSupported( true );
		dispatcher.addMapping( "/" );

	}
}

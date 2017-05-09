package it.martin.binder.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Martin
 *
 * @date 04 mag 2017
 */
@Controller
@RequestMapping( "/" )
public class HomeController extends SuperController
{

	@RequestMapping( method = RequestMethod.GET )
	public ModelAndView home ( HttpServletRequest request )
	{

		return new ModelAndView( "home" );
	}
}

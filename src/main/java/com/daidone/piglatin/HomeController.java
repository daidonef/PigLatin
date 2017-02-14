package com.daidone.piglatin;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	//Need to add way so that pig latin will start at vowel.
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, HttpServletRequest request) {
		
		if (request.getParameter("english") != null) {
			model.addAttribute("translate", "In Pig Latin '" +  request.getParameter("english") + 
				"' translates to:");
			model.addAttribute("pigLatin", PigLatin.translate(request.getParameter("english")));
		}
			
		return "home";
	}
	
}

package com.mohammadsleiman.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
	
	@RequestMapping(value="/")
	public String hello() {
		//return "Hello World! :)";
		String myHTMLWebsite = " <html>\n" + 
				"<h1> Mohammad Sleiman's Website\n" + 
				"</h1>\n" + 
				"<h2> studying software engineering at SJSU\n" + 
				"</h2>\n" + 
				"<p>about me. I enjoy making websites and drinking coffee. In my free time I like to bike with friends</p>\n" + 
				"</html>";
		return myHTMLWebsite;
	}
}

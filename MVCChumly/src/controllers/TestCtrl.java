package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestCtrl {
	@RequestMapping(path = "test.do", method = RequestMethod.GET)
	public String test(Model model) {
		model.addAttribute("test", "SUCCESS");
		return "../../index";
	}
}

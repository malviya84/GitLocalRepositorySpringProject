package springmvc_xmls;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class EmployeeController extends MultiActionController{
	
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", "Employee add invoked");
		modelAndView.setViewName("employee");
		return modelAndView;
	}

	public ModelAndView list(HttpServletRequest request, HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", "Employee list invoked");
		modelAndView.setViewName("employee");
		return modelAndView;
	}
	
	public ModelAndView update(HttpServletRequest request, HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", "Employee update invoked");
		modelAndView.setViewName("employee");
		return modelAndView;
	}
	
	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", "Employee delete invoked");
		modelAndView.setViewName("employee");
		return modelAndView;
	}
	
}

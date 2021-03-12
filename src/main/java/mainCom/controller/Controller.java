package mainCom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mainCom.model.NameVo;
import mainCom.service.Service;

@org.springframework.stereotype.Controller
public class Controller {

//	public static final String ACCOUNT_SID = System.getenv("AC98be97b427f58be0e4adc3c713832c17");
//    public static final String AUTH_TOKEN = System.getenv("c7939d809d5bc05f897f5acc91d91614");

	
	@Autowired
	Service service;

//	@GetMapping(value = "/otpVerify")
//	public ModelAndView otpVerify(Model model) {
//		
////		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
////        Message message = Message.creator(
////                new com.twilio.type.PhoneNumber("+17032154187"),
////                new com.twilio.type.PhoneNumber("+14372432937"),
////                "Hi there!")
////            .create();
////        
////      System.out.println(message.getSid());
//		
//		return new ModelAndView("verify");
//	}	
	
	
	@GetMapping(value = "/")
	public ModelAndView loadView(Model model) {
		fetchAllData(model);
		return new ModelAndView("view");
	}

	@GetMapping(value = "/loadAdd")
	public ModelAndView loadAdd(Model model) {
		return new ModelAndView("add", "NameVo", new NameVo());
	}

	@PostMapping(value = "/insertData")
	public ModelAndView insertData(@ModelAttribute NameVo nameVo, Model model) {
		service.insert(nameVo);
		fetchAllData(model);
		return new ModelAndView("/view");
	}
	
	
	@GetMapping(value = "/editDataById")
	public ModelAndView editDataById(@RequestParam String id, Model model) {
		List<Object> DataById = service.search("from NameVo where id="+Integer.parseInt(id));
		NameVo nameVo = (NameVo) DataById.get(0);
		return new ModelAndView("/add", "NameVo", nameVo);
	}
	
	@GetMapping(value = "/deleteDataById")
	public ModelAndView deleteDataById(@RequestParam String id, Model model) {
		List<Object> DataById = service.search("from NameVo where id="+Integer.parseInt(id));
		NameVo deleteNameVoById = (NameVo) DataById.get(0);
		service.delete(deleteNameVoById);
		fetchAllData(model);
		return new ModelAndView("/view");
	}
	
	
	public void fetchAllData(Model model) {
		List<Object> allData = service.search("from NameVo");
		model.addAttribute("allData", allData);
	}
	
}

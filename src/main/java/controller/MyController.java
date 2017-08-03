package controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.lilystudio.smarty4j.Context;
import org.lilystudio.smarty4j.Engine;
import org.lilystudio.smarty4j.Template;
import org.lilystudio.smarty4j.TemplateException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
//    private Engine smartyEngine;
	@RequestMapping("/list")
	public String list(ModelMap model) throws Exception{
		List<User> userList = new ArrayList<User>();
		userList.add(new User(1,"陶飞"));
		userList.add(new User(1,"陶飞"));
		userList.add(new User(1,"陶飞"));
		userList.add(new User(1,"陶飞"));
		userList.add(new User(1,"陶飞"));
		userList.add(new User(1,"陶飞"));
		userList.add(new User(1,"陶飞"));
		userList.add(new User(1,"陶飞"));
		
		/* Map<String, String> config = new HashMap<String, String>();
	        config.put("template.path", "E:/spring-tools-suiteWorkspace/smarty-demo-01/src/main/webapp/WEB-INF/views/");
	        config.put("encoding", "GBK");
	        smartyEngine = new Engine(config);
	        Template template = smartyEngine.getTemplate("index.html");
	        Context context = new Context();
	       
	        context.set("userList", userList);
	        ByteArrayOutputStream out = new ByteArrayOutputStream();
	        template.merge(context, out);
	        System.out.println(out.toString("GBK"));*/
		model.put("userList", userList);
		return "index";
	}
	
}

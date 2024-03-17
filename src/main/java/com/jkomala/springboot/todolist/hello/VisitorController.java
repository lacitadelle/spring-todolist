package com.jkomala.springboot.todolist.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VisitorController {

    //'say-hello' => "Hello, what are you learning today?
    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you doing?";
    }

    @RequestMapping("/say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>");
        sb.append("My firs Spring HTML page");
        sb.append("</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("This is my first page!, it's painful");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    // the return string matches the name of the JSP file...
    // @ResponseBody must be excluded
    // spring.mvc.view.prefix=/WEB-INF/jsp/ (it's very exact, don't forget the slash)
    // don't forget to add 'tomcat-embed-jasper' to the dependency.
    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }

}

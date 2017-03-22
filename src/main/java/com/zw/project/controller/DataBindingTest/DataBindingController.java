package com.zw.project.controller.DataBindingTest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;



/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */

// Controller注解用于指示该类是一个控制器，可以同时处理多个请求动作
@Controller
public class DataBindingController{

	// 静态的日志类LogFactory
	private static final Log logger = LogFactory
            .getLog(DataBindingController.class);

	// 测试@PathVariable注解
	// 该方法映射的请求为http://localhost:8080/DataBindingTest/pathVariableTest/{userId}
	@RequestMapping(value="DataBindingTest/pathVariableTest/{userId}")
	 public String pathVariableTest(
			 @PathVariable Integer userId,
			 Model model) {
		 logger.info("通过@PathVariable获得数据： " + userId);
		 model.addAttribute("message", "通过@PathVariable获得数据： " + userId);
		 return "DataBindingTest/DataBinding";
	 }
	
	// 测试@RequestHeader注解
	// 该方法映射的请求为http://localhost:8080/DataBindingTest/requestHeaderTest
	@RequestMapping(value="DataBindingTest/requestHeaderTest")
	 public String requestHeaderTest(
			 @RequestHeader("User-Agent") String userAgent,  
		     @RequestHeader(value="Accept") String[] accepts,
		     Model model) {
		 logger.info("通过@requestHeaderTest获得数据： " + userAgent);
		 for(String accept : accepts){
			 logger.info(accept);
		 }
		 model.addAttribute("message", "通过@requestHeaderTest获得数据： " + userAgent);
		 return "DataBindingTest/DataBinding";
	 }
	
	// 测试@CookieValue注解
	@RequestMapping(value="DataBindingTest/cookieValueTest")
	 public String cookieValueTest(
			 @CookieValue(value="JSESSIONID", defaultValue="") String sessionId,
			 Model model) {
		 logger.info("通过@requestHeaderTest获得数据： " + sessionId);
		 model.addAttribute("message", "通过@requestHeaderTestsessionId： " + sessionId);
		 return "DataBindingTest/DataBinding";
	 }


}


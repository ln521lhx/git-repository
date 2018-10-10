/**
 * 
 */
package com.lining.study.springboot_demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lining
 *
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

	@RequestMapping("index")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("springboot 运行成功！");
		return "index";
	}
}

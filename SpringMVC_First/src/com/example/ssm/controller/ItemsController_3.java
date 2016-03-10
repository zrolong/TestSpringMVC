package com.example.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.ssm.po.Items;

/**
 * 表示控制器
 * @author 北飞的候鸟
 *
 */
@Controller
public class ItemsController_3  {

	@RequestMapping("/queryItems")
	public ModelAndView queryItems() throws Exception {
		
		List<Items> itemsList = new ArrayList<>();

		Items items_1 = new Items();
		items_1.setId(1);
		items_1.setName("渣想电脑");
		items_1.setPic("渣想电脑");
		items_1.setCreatetime(new Date());
		items_1.setDetail("渣想电脑");
		items_1.setPrice(1);
		itemsList.add(items_1);
		
		Items items_2 = new Items();
		items_2.setId(2);
		items_2.setName("渣想电脑");
		items_2.setPic("渣想电脑");
		items_2.setCreatetime(new Date());
		items_2.setDetail("渣想电脑");
		items_2.setPrice(2);
		itemsList.add(items_2);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");

		return modelAndView;
	}
}

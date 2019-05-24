package com.oracle.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oracle.web.bean.Book;
import com.oracle.web.service.BookService;

@Controller
@Scope(value = "prototype")
public class BookHandler {
	
	@Autowired
    private BookService bookService;	

	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public String Books(HttpServletRequest request) {

		List<Book> bList = bookService.list();

		request.setAttribute("bList", bList);

		return "showBook";
	}

//	@RequestMapping(value = "/addUI", method = RequestMethod.GET)
//	public String addUI(HttpServletRequest request) {
//
//		List<Fenlei> fList = fenleiService.list();
//
//		request.setAttribute("fList", fList);
//
//		return "addBook";
//	}


}

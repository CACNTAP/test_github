package controller;

import service.CartService;

import com.jfinal.core.Controller;

public class IndexController extends Controller {
	
	public void index(){
		renderText("hello world!");
	}
	public void card_json(){
		renderText(CartService.impl.getCardJSON());
	}

}

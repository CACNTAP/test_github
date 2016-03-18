package service;

import java.util.LinkedList;
import java.util.List;

import com.alibaba.fastjson.JSON;

import model.Goods;


/**
 * 购物车服务
 * @author BingChuan
 *
 */
public class CartService {
	
	public static final CartService impl = new CartService();
	
	public String getCardJSON(){
		List<Goods> list=new LinkedList<Goods>();
		Goods g1=new Goods();
		g1.setId("1");
		g1.setName("iphone 4s");
		g1.setPrice(1988.00);
		g1.setQty(200);
		list.add(g1);
		Goods g2=new Goods();
		g2.setId("2");
		g2.setName("iphone 5s");
		g2.setPrice(3988.00);
		g2.setQty(100);
		list.add(g2);
		Goods g3=new Goods();
		g3.setId("3");
		g3.setName("iphone 6");
		g3.setPrice(4988.00);
		g3.setQty(100);
		list.add(g3);
		
		return JSON.toJSONString(list);
	}
}

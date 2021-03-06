package com.jph.java.advanced.dynamicproxy;

import com.jph.java.advanced.staticproxy.Owner;
import com.jph.java.advanced.staticproxy.Sales;

/**
* 客户端，使用代理类和主题接口完成一些工作。<br>
* 在这里表示买房子的客户
* @author Penn
*/
public class Customer {
	public static void main(String[]args) {
		Sales delegate=new Owner();
		Sales proxy=(Sales) new SalesInvocationHandler().bind(delegate);
		proxy.sell();
	}
} 

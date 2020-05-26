package com.atguigu.test;

import com.atguigu.ext.MyApplicationEvent;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.aop.MathCalculator;
import com.atguigu.bean.Boss;
import com.atguigu.bean.Car;
import com.atguigu.bean.Color;
import com.atguigu.bean.Red;
import com.atguigu.config.MainConfigOfAOP;
import com.atguigu.config.MainConifgOfAutowired;
import com.atguigu.dao.BookDao;
import com.atguigu.ext.ExtConfig;
import com.atguigu.service.BookService;

import java.util.Date;

public class IOCTest_Ext {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext  = new AnnotationConfigApplicationContext(ExtConfig.class);
		
		
		//发布事件；
//		applicationContext.publishEvent(new ApplicationEvent(new String("我发布的时间")) {
//		});
		applicationContext.publishEvent(new MyApplicationEvent(applicationContext,new Date()) {
		});
		applicationContext.close();
	}

}

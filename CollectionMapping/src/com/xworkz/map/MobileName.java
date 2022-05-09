package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MobileName {
public static void main(String[] args)
	{
		Map<String,String> MobileNameMap=new HashMap<>();
		MobileNameMap.put("Samsang","yashoda");
		MobileNameMap.put("one plus","ravi");
		MobileNameMap.put("apple","thriveni");
		MobileNameMap.put("google","gnana");
		MobileNameMap.put("oppo","ram");
		MobileNameMap.put("nokia","raj");
		MobileNameMap.put("motorola","swamy");
		MobileNameMap.put("sony","sneha");
		MobileNameMap.put("vivo","tukaram");
		MobileNameMap.put("asus","neelesh");
		MobileNameMap.put("blackberry","nirmala");
		MobileNameMap.put("techno","manju");
		MobileNameMap.put("realme","manasa");
		MobileNameMap.put("intex","manya");
		MobileNameMap.put("panasonic","brunda");
		MobileNameMap.put("gionee","nammu");
		System.out.println("mobile name map"+MobileNameMap.size());
		
		Set<String> keys=MobileNameMap.keySet();
		keys.forEach(r->System.out.println(r));
		
		Collection<String> values=MobileNameMap.values();
	    values.forEach(e->System.out.println(e));

		Set<Entry<String,String>> entryset1=MobileNameMap.entrySet();
		entryset1.forEach(mobile->System.out.println(mobile));
		
		System.out.println("");
		MobileNameMap.forEach((key,value)->System.out.println(key+""+value));
		
		for (Entry<String, String> entry : entryset1) {
			
			String key=entry.getKey();
		    String value=entry.getValue();
			System.out.println("key:"+key+" "+"value:"+value);
		}
	}
	}




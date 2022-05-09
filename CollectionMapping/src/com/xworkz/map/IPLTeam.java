package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IPLTeam {
public static void main(String[] args)
		{
			Map<String,String> IPLTeam=new HashMap<>();
			IPLTeam.put("Rohith sharma","MI");
			IPLTeam.put("Virat Kohli","RCB");
			IPLTeam.put("Gutham gambir","DC");
			IPLTeam.put("David Warner","SHR");
			IPLTeam.put("Dinesh Karthik","KKR");
			IPLTeam.put("AShwin","KXB");
			IPLTeam.put("Rathan tata","TCS");
			IPLTeam.put("Dhoni","CSK");
			IPLTeam.put("Sanju Samson","DD");
			IPLTeam.put("Mitchell","RPS");
			IPLTeam.put("Abhishek","RR");
			IPLTeam.put("Shreyas","HYD");
			IPLTeam.put("Donald","Bob mcDonald");
			IPLTeam.put("Hardik Pandya","GT");
			IPLTeam.put("Rahul","KL");
			IPLTeam.put("Jadeja","CSK");
			System.out.println("total companies"+IPLTeam.size());
			
			System.out.println("IPL teams");
			Set<String> keys=IPLTeam.keySet();
			keys.forEach(r->System.out.println(r));
			
			System.out.println("IPLTeam captain names");
			Collection<String> values=IPLTeam.values();
		    values.forEach(e->System.out.println(e));

			Set<Entry<String,String>> entryset1=IPLTeam.entrySet();
			entryset1.forEach(captain->System.out.println(captain));
			
			System.out.println("");
			IPLTeam.forEach((key,value)->System.out.println(key+""+value));
			
			for (Entry<String, String> entry : entryset1) {
				
				String key=entry.getKey();
				String value=entry.getValue();
				System.out.println("key:"+key+" "+"value:"+value);
			}
		}
		}







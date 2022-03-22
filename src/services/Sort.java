package services;
import org.json.JSONObject;

import java.util.Iterator;

import org.json.JSONArray;  

public class Sort {
	public Sort() {
		
	}
	public void SortJson(String json) {
		JSONObject jsonObj = new JSONObject(json);
		System.out.println("TEEEEEST");
		for (Iterator iterator = jsonObj.keys(); iterator.hasNext();) {
			  Object o = iterator.next();
			  //System.out.println(o+"///////////////////////////////////////////////////////////////");
			}
		System.out.println("TEEEEEST FIIIIN");
	}
}
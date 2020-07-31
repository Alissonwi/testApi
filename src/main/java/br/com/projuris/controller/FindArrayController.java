package br.com.projuris.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.projuris.MyFindArray;

@Controller
public class FindArrayController {

    MyFindArray myFindArray = new MyFindArray();

	@RequestMapping(value = "/FindArray", method =  RequestMethod.POST)
	@ResponseBody
    public int Post(@RequestBody Map<String,String> allParams) throws Exception
    {
		String array = allParams.get("array");
		String subArray = allParams.get("subArray");
		
		int[] intArray = TransformArrayinIntArray(array);
		int[] intSubArray = TransformArrayinIntArray(subArray);
		return myFindArray.findArray(intArray, intSubArray);
    }

	private int[] TransformArrayinIntArray(String array) {
		String[] integerStrings = array.split(",");  
		
		int[] integers = new int[integerStrings.length];  
		
		for (int i = 0; i < integers.length; i++){ 
		    integers[i] = Integer.parseInt(integerStrings[i]);  
		}
		
		return integers;
	}

}

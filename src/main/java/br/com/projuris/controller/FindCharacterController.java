package br.com.projuris.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.projuris.MyFindCharacter;

@Controller
public class FindCharacterController {
	
    MyFindCharacter myFindCharacter = new MyFindCharacter();

	@RequestMapping(value = "/FindChar", method = RequestMethod.POST)
	@ResponseBody
    public char Post(@RequestParam String word) throws Exception
    {
		return myFindCharacter.findChar(word);
    }

}

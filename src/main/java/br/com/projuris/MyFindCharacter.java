package br.com.projuris;

import java.util.HashMap;
import java.util.Map;

import br.com.projuris.repository.FindCharacterRepository;

public class MyFindCharacter implements FindCharacterRepository {

	@Override
	public char findChar(String word) throws Exception {
		char firstChar = firstNonRepeating(word);
		
		return firstChar;
	}
	
	static char firstNonRepeating(String str) throws Exception 
	{ 
		char y[] = str.toCharArray();
		int size = y.length;
		
		Map<Character, Integer> map = new HashMap<>();
		int i = 0;
		
		while(i != size) {
			if(map.containsKey(y[i]) == false) {
				map.put(y[i],1);
			} else {
				int oldVal = map.get(y[i]);
				int newVal = oldVal + 1;
				map.put(y[i], newVal);
			}
			i++;
		}
		
		for (int j = 0; j < size; j++) {
            char c = str.charAt(j);
            if (map.get(c) == 1) {
                return c;
            }
        }
		throw new Exception("Ocorreu um erro tentando achar o primeiro caracter não repetido.");
	 }
}

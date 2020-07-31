package br.com.projuris.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface FindCharacterRepository {
	
	 char findChar(String word) throws Exception;
	
}

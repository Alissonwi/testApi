package br.com.projuris.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface FindArrayRepository {
	
	int findArray(int[] array, int[] subArray) throws Exception;
}

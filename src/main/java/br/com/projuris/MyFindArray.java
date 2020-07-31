package br.com.projuris;

import br.com.projuris.repository.FindArrayRepository;

public class MyFindArray implements FindArrayRepository {

	@Override
	public int findArray(int[] array, int[] subArray) throws Exception {
		if (hasOccurrence(array, subArray)){
			boolean isDuplicated = checkForDuplicates(array);
			for(int i = 0 ; i < array.length; i++){
				for (int j = 0; j < subArray.length; j++){
					if (isDuplicated){
						if (array[i] == subArray[j]){
							return checkIfHasAnotherValueAndGetPosition(array ,array[i]);
						}
					} else {
						if (array[i] == subArray[j]){
							return i;
						}
					}
				}
			}
		} else {
			return -1;
		}
		throw new Exception("Ocorreu um erro no findArray");
	}
	
	private static boolean checkForDuplicates(int[] array)
	{
		for (int i = 0; i < array.length; i++) { 
			for (int j = i + 1 ; j < array.length; j++) { 
				if (array[i] == (array[j])) {
					return true;
				}
			}
		}
		return false;
	}
	
	private static boolean hasOccurrence(int[] firstArr, int[] secondArr) {
        boolean find = false;
        for(int i : firstArr) {
            for (int j : secondArr) {
                if(i == j) {
                    find = true;
                    break;
                }
            }if (find) {
            	break;
            }
        }
        return find;
	}
	
	private int checkIfHasAnotherValueAndGetPosition(int[] array,int numero) throws Exception
	{
		for (int i=array.length-1; i >= 0; i--){
			if(array[i] == numero){
				return i;
			}
		}
		throw new Exception("Ocorreu um erro na hora de procurar o ultimo valor duplicado.");
	}
}


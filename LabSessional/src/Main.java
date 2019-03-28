
public class Main {

	public static void main(String[] args) {
		

	}

	/**
     * Get the index of specific Char in the String.
     * 
     * @param s : String
     *            		text of any length, not modified by this method.
     *	@param ch : char
     *            		char that we want to look String.
     * @return int
     * 				index of first ch in s to be found. OR -1 if not found.
     * 	          
     */
	
	public static int getIndex(String s, char ch){
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)==ch){
				return i;
		}
		
	}
		return -1;
	}
	}

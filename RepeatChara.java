package logic;

public class RepeatChara {
	public static void main(String[] args) {
		String word="abc";
		word=word.trim();
		word=word.toLowerCase();
		if(word.length()==0) {  //word.isEmpty();
			System.out.println("Empty String");
		}
		else {
		int length=word.length();		
		boolean flag=false;
		for(int i=0;i<length;i++) {	
			for(int j=i+1;j<length;j++) {
				if(word.charAt(i)==word.charAt(j)) {
					flag=true;	
				}				
			}
			if(flag) {
				System.out.println("result====\'"+word.charAt(i)+"\'");
				break;
				
			}
				}
		}		
	}
	}
	


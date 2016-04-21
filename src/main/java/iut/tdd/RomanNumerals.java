package iut.tdd;

public class RomanNumerals {
	
	public String convertToRoman(String arabe) {
		String res="";
		int v = Integer.valueOf(arabe);
		if(v>4){
			for(int i=0; i<arabe.length();i++){
				res=res+"I";
			}
		}
		return res;
	}

	public Object convertFromRoman(String roman) {
		String res="";
		int v = Integer.valueOf(roman);
		if(v<4){
			for(int i=0; i<roman.length();i++){
				res=res+"1";
			}
		}
		return res;
	}

}
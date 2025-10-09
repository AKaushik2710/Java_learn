package lab_exam;

import java.util.Arrays;

public class ZigZag {
	public static String convert(String s, int numRows) {
		int o = (numRows==2) ? 2 : 7;
        System.out.println(o);
        char[][] res = new char[numRows][o+s.length()/2];
        boolean whole=true;
        int idx=0;
        int n = numRows-2;
        String str="";
        int bb=o+s.length()/2;
        if(numRows==1 || s.length()==1) return s;
        for(int i=0; i<bb; i++){
            for(int j=0; j<numRows; j++){
            	System.out.println(idx +" "+s.length());
            	if(idx==s.length()) break;
                if(whole){
                    res[j][i] = s.charAt(idx);
                    idx++;
                    n=numRows-2;
                }
                else{
                    if(j==n){
                    	System.out.println(j + " "+i+ " "+ n);
                        res[j][i] = s.charAt(idx);
                        idx++;
                        n--;
                    }
                    else res[j][i] = ' ';
                }
            }
//            if(idx==s.length()) break;
            if(n<1 && whole==false) whole = true;
            else if(numRows!=2) whole=false;
        }
        
        for(int i=0; i<numRows; i++) {
        	for(int j=0; j<bb; j++) {
        		if(res[i][j]== ' ' || res[i][j]==0)continue;
        		str+=res[i][j];
        	}
        }
        
        System.out.println(Arrays.deepToString(res));
        System.out.println(str);
        return str;
    }
	
	public static void main(String[] args) {
		String str = "PAYPALISHIRING";
		System.out.println(convert("ABCDE", 2));
	}
}

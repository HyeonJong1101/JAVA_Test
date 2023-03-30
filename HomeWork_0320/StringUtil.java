package HomeWork_0320;

public class StringUtil {
    
	boolean isUpperChar(char c){
		 /* if(c<=90){
	            return true;
	        }else{
	            return false;
	        }
	     */
	        
        return c <= 'Z' && c>='A' ? true:false;
        
    }

    boolean isLowerChar(char c){
        if(c>90){
            return true;
        }else{
            return false;
        }
    }

    int max(int i, int j){
        if(i>j){
            return i;
        }else{
            return j;
        }
    }

    int min(int i, int j){
        if(i>j){
            return j;
        }else{
            return i;
        }
    }

    char[] reverseString(String str){
        char[] strArr = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            strArr[i] = str.charAt(str.length()-1-i);
        }
        return strArr;
    }

    char[] toUpperString(String str){
        char[] strArr = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>90){
                int num = str.charAt(i)-32;
                strArr[i] = (char)num;
            }else{
                int num = str.charAt(i);
                strArr[i] = (char)num;
            }
        }
        return strArr;
    }

    char[] toLowerString(String str){
        char[] strArr = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)<91){
                int num = str.charAt(i)+32;
                strArr[i] = (char)num;
            }else{
                int num = str.charAt(i);
                strArr[i] = (char)num;
            }
        }
        return strArr;
    }

    int compareTo(String str, String str2){
        int size01=0;
        int size02=0;

        for(int i=0; i<str.length(); i++){
            size01 += str.charAt(i);
        }

        for(int i=0; i<str2.length(); i++){
            size02 += str2.charAt(i);
        }

        if(size01>size02){
            return 1;
        }else if(size01 == size02){
            return 0;
        }else{
            return  -1;
        }
    }

    boolean endsWith(String str, String sub){
        int cnt=0, len=0;
        for(int i=str.length()-sub.length(); i<str.length(); i++){
            if(str.charAt(i) == sub.charAt(cnt++)){
                len++;
            }
        }
        if(len == sub.length()){
            return true;
        }else{
            return false;
        }
    }

    int indexOf(String str, String sub){

        for(int i=0; i<str.length(); i++){
            int cnt = 0;
            for(int j=0; j<sub.length(); j++){
                if(str.charAt(i+cnt) == sub.charAt(j)){
                    cnt++;
                }else{

                }
                if(cnt == sub.length()){
                    return i;
                }
            }
        }
        return 0;
    }
}

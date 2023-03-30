package HomeWork_0320;

public class Calculator {
   int num01, num02;

    Calculator(){
    }
    Calculator(int num01, int num02){
        this.num01 = num01;
        this.num02 = num02;
    }
    void add(){
        System.out.println(num01+"+"+num02+"="+(num01+num02));
    }

    void sub(){
        System.out.println(num01+"-"+num02+"="+(num01-num02));
    }

    void mul(){
        System.out.println(num01+"*"+num02+"="+(num01*num02));
    }

    void div(){
        System.out.println(num01+"/"+num02+"="+(double)num01/num02);
    }

    boolean check(int num){
        int cnt = 0;
        for(int i=1; i<=num; i++){
            if(num%i == 0)
                cnt++;
        }

        if(cnt ==2) return true;
        else return false;
    }
}

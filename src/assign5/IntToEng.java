package assign5;
import java.util.Scanner;

public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	
    	if(n<0) return "正の整数で。";
    	String[] num = {"zero", "one", "two", "three", "four",
    			"five", "six", "seven", "eight", "nine",
    			"ten", "eleven", "twelve", "thirteen", "fourteen",
    			"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    	String[] num2 = {"","","twenty", "thirty", "forty", "fifty", "sixty","seventy", "eighty", "ninety","hundred"};
    	
    	String ichi = num[n % 10];
    	String ju = num2[n / 10];
    	
    	if(n<100){	
    		if(n<20) return num[n];
    		else if(n %10 ==0) return num2[n/10];
        	else return ju+" "+ichi;
    		 		
    	}else{
    		if(n%100==0) return num[n/100]+" "+ num2[10];
    		
    		int m = n-(n/100)*100;
    		return num[n/100]+" "+ num2[10] + " "+num2[m/10]+" "+num[m % 10];
    	}

    }
}

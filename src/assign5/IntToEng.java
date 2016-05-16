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
    	String digit = "";
    	
    	if(n>999)return "0〜999までしかできません。";
    	else if(n>99) return ret0(num, num2, n, digit);
    	return ret(num, num2, n, digit);
    }
  
    public static String ret0(String[] num, String[] num2, int n,String digit) {
    	if(n%100==0) return num[n/100]+" "+ num2[10];
    	digit += num[n/100] + " " + num2[10] + " ";
    	int m = n-(n/100)*100;
    	return ret(num,num2,m,digit);   	
    }
    
    public static String ret(String[] num, String[] num2, int n,String digit) {   	
    	String ichi = num[n % 10];
    	String ju = num2[n / 10];
    	
    	if(n<20) return digit + num[n];
    	else if(n %10 ==0) return digit + num2[n/10];	
    	return digit+ju+" "+ichi;
    }
}

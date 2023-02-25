

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal:");
        double p = scanner.nextDouble();
        System.out.print("Annual Interest rate:");
        double rate  = scanner.nextDouble();
        double r  = rate /(12*100);
        System.out.print("Periods (years):");
        double  periods = scanner.nextInt();
        double  n = periods*12;
        double M = p * ((r * Math.pow((1+r),n)) / (Math.pow((1+r),n)-1));
        NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("en","lk"));
        String result= currency.format(M);
        System.out.print("Monthly payment:"+result);


    }
}
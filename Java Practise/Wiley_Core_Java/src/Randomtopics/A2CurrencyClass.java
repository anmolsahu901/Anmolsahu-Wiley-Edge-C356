package Randomtopics;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
// this add currency symbol on the value 
public class A2CurrencyClass {

	public static void main(String[] args) {
		Currency usd = Currency.getInstance("USD");
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		String formattedVal = format.format(108.5);
		
		System.out.println(formattedVal);
//		
		//formatting currency with Locale along with NumberFormatter Class
		double price = 2000.25;
		Locale local = new Locale("en","US");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(local);
		String finalPrice = currencyFormatter.format(price);
		System.out.println(finalPrice);
		
		//Custom Format
		DecimalFormat df = new DecimalFormat("#,##0.00");
		df.setPositivePrefix("$");
		String resVal = df.format(price);
		
		System.out.println("Custom Format : "+resVal);
		
		
		Currency cur = Currency.getInstance("USD");
		String symbol = cur.getSymbol();
		String code = cur.getCurrencyCode();
		
		System.out.println(symbol);
		System.out.println(code);
		
		//Exchange Rate provider
		double p = 100;
		
		
		
	}

}















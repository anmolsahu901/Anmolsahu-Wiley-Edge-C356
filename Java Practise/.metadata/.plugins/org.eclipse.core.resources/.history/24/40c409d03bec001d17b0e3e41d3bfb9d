package Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ProductCsvReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String csvFile = "C:\\Users\\Acer\\Documents\\Wiley Edge\\wiley_git_project\\Java_Core\\wiley_core_java\\data\\products.csv";
        String line = "";
        String csvSplitBy = ",";
        ArrayList<Product> products = new ArrayList<Product>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(csvSplitBy);
                String name = tokens[0];
                int price = Integer.parseInt(tokens[1]);
                String description = tokens[2];
                
                Product p = new Product(name,price,description);
                
                products.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        for (Product product : products) {
            System.out.println("Product Name : "+product.getName()+"\tPrice = "+product.getPrice()+"\tDescription :"+product.getDescription());
        }
	}

}

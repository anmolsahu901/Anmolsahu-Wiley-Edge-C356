package Week1to3Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

 class Products {
	private String name;
	private int price;
	private String description;
	
	public Products(String name, int price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}

public class ProductCsvReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String csvFile = "D:\\WileyEdgeTraining\\Wiley Edge Training\\Java Practise\\Wiley_Core_Java\\src\\Week3Assignment\\Week2Assignment.csv";
        String line = "";
        String csvSplitBy = ",";
        ArrayList<Products> productsList = new ArrayList<Products>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(csvSplitBy);
                String name = tokens[0];
                int price = Integer.parseInt(tokens[1]);
                String description = tokens[2];
                
                Products p = new Products(name,price,description);
                
                productsList.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        for (Products product : productsList) {
            System.out.println("Product Name : "+product.getName()+"\tPrice = "+product.getPrice()+"\tDescription :"+product.getDescription());
        }
	}

}

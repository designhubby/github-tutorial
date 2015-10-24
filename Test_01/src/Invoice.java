import java.util.Scanner;

public class Invoice {

	String partnumber;
	String partdescription;
	int quantity;
	double priceperitem;
	double invamt = priceperitem*quantity;
	
	public Invoice(){
		
	}
	
	public void setPartNumber(String partnum){
		partnumber= partnum;
		
	}
	
	public String getPartNumber(){
		return partnumber;
	}
	
	public void setPartDescription(String desc){
		partdescription = desc;
	}
	
	public String getPartDescription(){
		return partdescription;
	}
	
	public void setQuantity(int amt){
		if(amt != 0){
			quantity = amt;
		}
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setPrice(double price){
		if(price != 0){
			priceperitem = price;
		}
	}
	
	public double getPrice(){
		return priceperitem;
	}
	
	public double getInvoiceAmount(){
		
		invamt = getPrice()* getQuantity();
		return invamt;
	}
	
	public void inputInvoice(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please input partnumber: ");
		setPartNumber(input.nextLine());
		System.out.println("Please input partdescription");
		setPartDescription(input.nextLine());
		System.out.println("Please input quantity");
		setQuantity(input.nextInt());
		System.out.println("Please input price of item");
		setPrice(input.nextDouble());
		input.close();
		
		
		
	}
	
	public void outputInvoice(){
		
		System.out.print("Part Description: " + getPartDescription() + "Part Number: " + getPartNumber() + "\nPrice: " + getPrice() +"\nInvoice Amount: " + getInvoiceAmount());
	}
	
	
	public void generateInvoice(){
		inputInvoice();
		outputInvoice();
		
	}
	
	
	
}

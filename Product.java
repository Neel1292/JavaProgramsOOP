
// import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;


public class Product  implements Comparable<Product>  {

  private int pid;
  private String pname;
  private double price;

    public  Product(int pid, String pname, double price )
    {
      this.pid = pid;
      this.pname = pname;
      this.price = price;
    }

    public int getPid() {
      return pid;
    }

    public int setPid(int pid) {
        return this.pid = pid;
    }

    public String getPname() {
      return pname;
    }

    public String setPname(String pname) {
      return this.pname = pname;
    }

    public double getPrice() {
      return price;
    }

    public void setPrice(double price) {
      this.price = price;
    }
    
    @Override
    public String toString() {
    	
    	return "Student { " +
    			"Product Id = "+ pid + 
    			", Product Name ='"+ pname + '\'' +
    			", Price = '" + price + '\'' +
    			'}';
    	}
    
    @Override
    public boolean equals(Object o) {
    	if(this == o) 
    		return true;
    	if(o != null || getClass() != o.getClass())
    		return false;
    	Product poj = (Product) o;
    	return pid == poj.pid;
    }

    @Override
    public int hashCode() {
    	return Objects.hash(pid,pname,price); 
    }
    
    @Override
    public int compareTo(Product pobj) {
    	return this.pid-pobj.pid;
    }


    public static void main(String[] args) {
          
          List<Product> products = new ArrayList<>();
          products.add(new Product(103,"Washing Powder",150.0));
          products.add(new Product(104,"Red Chilli Powder",20.0));
          products.add(new Product(101,"Maggie",24.0));
          products.add(new Product(105,"Cheese",115.0));
          products.add(new Product(102,"Rice",50.0));

          System.out.println("Products Before Sorting : "+ products);

          Collections.sort(products);

          System.out.println("After Sorting : "+ products);
  }
}
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsv {
	
	public static void main(String[] args){
		
		//Path to .csv file
		String path = "src/resources/products.csv";
		//Every single line
		String line = "";
		
		try {	
			
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			while((line = br.readLine()) != null) {
				String[] values = line.split(",");
				System.out.println(
				"Catregory: " + values[1] + " | " + 
				"Department: " + values [2] + " | " + 
				"Manufacturer: " +values[3] + " | " + 
				"Regular price: " + values[7] + " | " +
				"Sale price: " + values[7] + " | " + 
				"Description: " + values[8]);
			}
	    } catch (FileNotFoundException e) {
	    	e.printStackTrace();
	    } catch (IOException e){
	    	e.printStackTrace();
	    } finally {
	    
    }
		
	}

}

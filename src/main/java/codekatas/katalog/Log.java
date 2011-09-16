package codekatas.katalog;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class Log {

	public void persist(List<String> errores) {
		 try{
			  // Create file 
			  FileWriter fstream = new FileWriter("out.txt");
			  BufferedWriter out = new BufferedWriter(fstream);
			  
			  for (String error : errores){
				  out.write(error);
			  }
			  //Close the output stream
			  out.close();
			  }catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
			  }
		
	}

}

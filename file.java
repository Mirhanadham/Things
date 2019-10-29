package sw;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class file {
	

	
		 public static void WriteObjectToFile(String path,PersonalInfo serObj) {
			 
		        try {
		       // PersonalInfo obj=new PersonalInfo(obj.getName(),obj.getPassword(),obj.getEmail(),obj.getGender(),obj.getAge());
		        		
		            FileOutputStream fileOut = new FileOutputStream(path);

		            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
		       
		            objectOut.writeObject(serObj);
		            objectOut.close();
		            fileOut.close();
		            System.out.println("The Object  was succesfully written to a file");
		 
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		    }
			
		public static void create(String text) throws IOException
	{ 	
		File file = new File(text);
		if (file.createNewFile())
		{
			System.out.println("File is created!");
		} else {
			System.out.println("File already exists.");
		}
	}

		public static boolean find(String file,String input) throws IOException 
	   {
	      File f1=new File(file); 
 
	      FileReader fr = new FileReader(f1);  
	      BufferedReader br = new BufferedReader(fr); 
	      String s;     
	 
	      while((s=br.readLine())!=null)  
	      {		     
	                 if (s.equals(input))   
	                 {
	                   return true;   
	                 }
	          
	      }
	     
	     return false; 
	         
	   }


	}



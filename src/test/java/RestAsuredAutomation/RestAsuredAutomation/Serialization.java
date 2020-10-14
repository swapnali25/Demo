package RestAsuredAutomation.RestAsuredAutomation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.testng.annotations.Test;

public class Serialization {

	
	
	public static void SerializationtoFile(Object classobject,String filename) throws IOException
	{
		try {
			FileOutputStream outputstream=new FileOutputStream(filename);
			
			ObjectOutputStream objectOutputstraem=new ObjectOutputStream(outputstream);
			
			objectOutputstraem.writeObject(objectOutputstraem);
			objectOutputstraem.close();
			outputstream.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException
	{
	 Rectangle rect = new Rectangle(18, 78);
	 SerializationtoFile(rect, "rectSerialized");
	 
	}
}

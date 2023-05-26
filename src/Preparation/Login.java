package Preparation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Login implements Serializable{
	String name="Viki";
	transient String pass="1234";
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		
		Login l=new Login();
		FileOutputStream fos= new FileOutputStream("C:\\Users\\Balaviki\\OneDrive\\Desktop\\test.txt");
		ObjectOutputStream out= new ObjectOutputStream(fos);
		out.writeObject(l);
		out.close();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Balaviki\\OneDrive\\Desktop\\test.txt");
		ObjectInputStream inp=new ObjectInputStream(fis);
		Object read=inp.readObject();
		Login rea=(Login)read;
		System.out.println(rea.name+" "+rea.pass);
				
	}
	

}

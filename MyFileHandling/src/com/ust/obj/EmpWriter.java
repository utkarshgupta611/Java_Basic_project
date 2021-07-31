// byte stream ---> onbectInputStream
// serialization --> Serialization in Java is a mechanism of writing 
//the state of an object into a byte-stream. 
//It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.

package com.ust.obj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpWriter {

	public static void main(String[] args) {
		Emp e = new Emp(123, "Utkarsh", 9041120661l);

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("emp.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
			System.out.println("Emp Object Written to file");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (oos != null)
				try {
					oos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		}

	}

}

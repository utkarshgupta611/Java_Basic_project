// deserialization - Deserialization is the reverse process where the byte 
//stream is used to recreate the actual Java object in memory. 
//This mechanism is used to persist the object. The byte stream created is platform independent

package com.ust.obj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmpReader {
	public static void main(String[] args) {
		Emp e = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("emp.ser");
			ois = new ObjectInputStream(fis);
			e = (Emp) ois.readObject();
			System.out.println(e);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} finally {
			if (ois != null)
				try {
					ois.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		}

	}

}

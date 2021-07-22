package com.ust.obj;

// create object by reflection
public class CreateFromName {

	public static Movable getInstance(String className) {
		Movable m1 = null;
		try {
			Class vehClass = Class.forName(className);
			m1 = (Movable) vehClass.newInstance();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return m1;
	}

}

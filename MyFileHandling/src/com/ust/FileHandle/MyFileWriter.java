package com.ust.FileHandle;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFileWriter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Line To Add in DB");
		String line = sc.nextLine();
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter("Output.txt");
			bw = new BufferedWriter(fw);
			bw.write(line);
			System.out.println("Line Has been added...........");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

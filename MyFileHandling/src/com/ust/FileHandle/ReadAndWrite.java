package com.ust.FileHandle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;

		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fr = new FileReader("Output.txt");
			br = new BufferedReader(fr);

			fw = new FileWriter("Output2.txt");
			bw = new BufferedWriter(fw);

			String line = "";
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				bw.write(line);
				bw.newLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}


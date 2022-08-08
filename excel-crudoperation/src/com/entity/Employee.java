package com.entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class Employee {
	public static void main(String[] args) throws Exception {

		Integer id = 109;
		String name = "sanjay";
		String address = "kerale";
		Double salary = 15000.0;
		String dept = "dev";
		String rses = "" + id + "," + name + "," + address + "," + salary + "," + dept;

		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("/home/tector/get.csv"), true));
		writer.newLine();
		writer.append(rses);
		
		/*
		 * BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		 * String line = bufferedReader.readLine(); while ((line =
		 * bufferedReader.readLine()) != null) { // System.out.println(line); String[]
		 * str = line.split(","); System.out.println(); System.out.println(str[0] + " "
		 * + str[1] + " " + str[2] + " " + str[3] + " " + str[4]); }
		 */writer.close();

	}

}

package in.nit.csvfilewriter;

import java.io.File;
import java.io.FileWriter;

import com.opencsv.CSVWriter;

public class CsvFileWriterText {

	public static void main(String[] args) throws Exception {
		FileWriter writer = new FileWriter(new File("/home/tector/data.csv"));
		CSVWriter csvWriter = new CSVWriter(writer);
		String[] data = { "102", "saurabh", "hyd" };
		csvWriter.writeNext(data);
		

		csvWriter.close();

	}

}

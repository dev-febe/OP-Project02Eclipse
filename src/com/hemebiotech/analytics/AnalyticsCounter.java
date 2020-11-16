package com.hemebiotech.analytics;

import java.util.List;

public class AnalyticsCounter {
	public static void main(String[] args) throws Exception {
		// Get symptoms
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
		List<Symptom> symptoms = reader.getSymptoms();

		// Write symptoms and occurrences inside of a file
		WriteSymptomDataFile writer = new WriteSymptomDataFile();
		writer.writeSymptomData("result.out", symptoms);
	}
}

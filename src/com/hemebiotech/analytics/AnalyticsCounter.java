package com.hemebiotech.analytics;

import java.util.List;

public class AnalyticsCounter {
	public static void main(String[] args) throws Exception {
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
		List<Symptom> symptoms = reader.getSymptoms();

		WriteSymptomDataFile writer = new WriteSymptomDataFile();
		writer.writeSymptomData(symptoms);
	}
}

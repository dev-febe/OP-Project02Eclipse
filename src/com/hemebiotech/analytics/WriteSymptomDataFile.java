package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteSymptomDataFile implements ISymptomWriter {
    @Override
    public void writeSymptomData(String filename, List<Symptom> symptoms) throws IOException {
        FileWriter writer = new FileWriter(filename);
        for(Symptom symptom: symptoms) {
            writer.write(symptom.getName() + " : " + symptom.getCount() + "\n");
        }
        writer.close();
    }
}

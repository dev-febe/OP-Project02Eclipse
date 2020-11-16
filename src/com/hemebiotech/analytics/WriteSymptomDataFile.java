package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteSymptomDataFile {

    public void writeSymptomData(List<Symptom> symptoms) throws IOException {
        // next generate output
        FileWriter writer = new FileWriter("result.out");
        for(Symptom symptom: symptoms) {
            writer.write(symptom.getName() + " : " + symptom.getCount() + "\n");
        }
        writer.close();
    }
}

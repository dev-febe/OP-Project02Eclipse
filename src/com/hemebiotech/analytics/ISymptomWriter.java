package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

public interface ISymptomWriter {
    /**
     * Write symptom data inside a file
     */
    public void writeSymptomData (String filename, List<Symptom> symptoms) throws IOException;
}

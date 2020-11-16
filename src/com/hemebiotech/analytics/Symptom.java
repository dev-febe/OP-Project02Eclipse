package com.hemebiotech.analytics;

import java.util.TreeMap;

public class Symptom implements ISymptom {
    private String name;
    private int count;
    private static final TreeMap<String, Integer> symptomsOccurrence = new TreeMap<>();

    Symptom(String name, int count) {
        this.name = name;
        this.count = count;
        this.addSymptomOccurrence(name, count);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    public void addSymptomOccurrence(String name, int previousCount) {
        symptomsOccurrence.put(name, previousCount + 1);
    }

    public TreeMap<String, Integer> getSymptomsOccurrence() {
       return symptomsOccurrence;
    }
}

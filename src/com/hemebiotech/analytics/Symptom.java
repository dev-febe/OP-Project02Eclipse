package com.hemebiotech.analytics;

import java.util.TreeMap;

public class Symptom implements ISymptom {
    private String name;
    private int count = 0;
    private static final TreeMap<String, Integer> symptomsOccurrence = new TreeMap<>();

    Symptom(String name) {
        this.name = name;
        this.addSymptomOccurrence(name);
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

    public void addSymptomOccurrence(String name) {
        int previous = symptomsOccurrence.get(name) != null
                ? symptomsOccurrence.get(name) : 0;

        setCount(previous + 1);

        symptomsOccurrence.put(name, getCount());
    }
}

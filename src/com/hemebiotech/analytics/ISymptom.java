package com.hemebiotech.analytics;

public interface ISymptom {
    /**
     * @return the name of a symptom
     */
    public String getName();

    /**
     * @return the count of a symptom
     */
    public int getCount();

    /**
     * @param name, the symptom name
     */
    public void setName(String name);

    /**
     * @param count, the symptom count
     */
    public void setCount(int count);
}

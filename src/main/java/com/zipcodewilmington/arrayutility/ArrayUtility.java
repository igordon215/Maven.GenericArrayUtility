package com.zipcodewilmington.arrayutility;

import java.util.*;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {

    public T[] inputArray;

    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
    }


    public T[] removeValue(T valueToRemove) {
        if (valueToRemove == null) {
            return Arrays.copyOf(inputArray, inputArray.length);
        }

        List<T> resultList = new ArrayList<>();
        for (T x : inputArray) {
            if (!valueToRemove.equals(x)) {
                resultList.add(x);
            }
        }

        return resultList.toArray(Arrays.copyOf(inputArray, 0));
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        int count = 0;
        for (T element : inputArray) {
            if (element != null && element.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        Map<T, Integer> frequencyMap = new HashMap<>();

        for (T element : inputArray) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        for (T element : arrayToMerge) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        T mostCommon = null;
        int maxFrequency = 0;

        for (Map.Entry<T, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostCommon = entry.getKey();
            }
        }

        return mostCommon;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        return null;
    }
}

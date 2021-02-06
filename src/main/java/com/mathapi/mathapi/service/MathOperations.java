package com.mathapi.mathapi.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MathOperations {

    public List<Integer> calculateMinium(List<Integer> numberList, Integer limit ){
    
        List<Integer> list = new ArrayList<>();
        Collections.sort(numberList);
        
        for(int i = 0 ; i < limit ; i++){
            list.add(numberList.get(i));
        }

        return list;
    }

	public List<Integer> calculateMax(List<Integer> numberList, Integer limit) {
        List<Integer> list = new ArrayList<>();
        Collections.sort(numberList);
        Collections.reverse(numberList);
        for(int i = 0 ; i < limit ; i++){
            list.add(numberList.get(i));
        }

        return list;
	}

	public double calculateAverage(List<Integer> numberList) {
        Integer sum = 0;
        for(int i = 0 ; i < numberList.size() ; i++){
            sum += numberList.get(i);
        }
        
        return ( (double) sum / (double) numberList.size());
	}
    
}

package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

   public List<Integer> exterminate(List<Integer> numbers)
    {
        List<Integer> newNumbers = new ArrayList<>();
        for (Integer number: numbers)
        {
            if( number % 2==0)
            {
                newNumbers.add(number);
            }
        }
        return  newNumbers ;
    }
}



//        List newNumbersList = Arrays.asList(newNumbers);
//         System.out.println("123");   return (ArrayList<Integer>) newNumbersList;
//    public void exterminate(ArrayList<Integer> numbers)
//    public Arrays<Integer> exterminate(ArrayList<Integer> numbers) // Arrays.asList(newNumbers)
//    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers)
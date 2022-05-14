package com.kodilla.stream.array;


import java.util.stream.IntStream;

public interface ArrayOperations {

   static double getAverage(int[] numbers) {

      IntStream.range(0, numbers.length).map(a -> numbers[a]).forEach(System.out::println);
      double averageNumbers =  IntStream.range(0, numbers.length).map(a ->numbers[a])
              .average().getAsDouble();

      return averageNumbers;

   }
}

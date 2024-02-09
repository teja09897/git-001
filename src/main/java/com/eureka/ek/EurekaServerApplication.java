package com.eureka.ek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
	
	
	
	import java.util.HashMap;
	import java.util.Map;

	public class DigitFrequency {
	    public static void main(String[] args) {
	        int[] arr = {1, 4, 3, 2, 7, 3, 4, 1};

	        Map<Integer, Integer> digitFrequencyMap = new HashMap<>();
	        for (int num : arr) {
	            digitFrequencyMap.put(num, digitFrequencyMap.getOrDefault(num, 0) + 1);
	        }
	        System.out.println("Digit Frequencies:");
	        for (Map.Entry<Integer, Integer> entry : digitFrequencyMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
	        }
	    }
	}


}

package io.yadnyesh.javatechie;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class NthHighestSalaryDemo {
    public static void main(String[] args) {
        Map<String, Integer> salary = new HashMap<>();
        salary.put("one", 1000);
        salary.put("two",2000);
        salary.put("three",3000);
        salary.put("four",4000);
        salary.put("five",5000);
        salary.put("six",6000);
        salary.put("seven",7000);

        Map.Entry<String, Integer> result = salary.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList())
                .get(1);

        log.info(result.toString());

    }
}

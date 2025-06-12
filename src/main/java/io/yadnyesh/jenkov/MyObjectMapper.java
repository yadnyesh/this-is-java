package io.yadnyesh.jenkov;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MyObjectMapper {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        String carJson = "{ \"brand\" : \"Mercedes\",\"doors\" : 5}";

        try {
            Car car = objectMapper.readValue(carJson, Car.class);
            System.out.println("car brand = " + car.getBrand());
            System.out.println("car doors = " + car.getDoors());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

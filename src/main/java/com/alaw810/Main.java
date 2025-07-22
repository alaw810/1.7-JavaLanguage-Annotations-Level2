package com.alaw810;

import com.alaw810.model.Person;
import com.alaw810.utils.JsonSerializer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Adrià", 32, "adria@example.com");

        try {
            JsonSerializer.serialize(person);
            System.out.println("Serialization completed successfully!");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: class is not annotated with @JsonSerializable");
        } catch (IOException e) {
            System.err.println("I/O error while writing JSON file: " + e.getMessage());
        }
    }
}

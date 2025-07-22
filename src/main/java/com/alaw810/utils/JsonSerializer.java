package com.alaw810.utils;

import com.alaw810.annotations.JsonSerializable;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.*;

public class JsonSerializer {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static void serialize(Object obj) throws IOException {
        Class<?> clazz = obj.getClass();

        if (!clazz.isAnnotationPresent(JsonSerializable.class)) {
            throw new IllegalArgumentException(
                    "Class " + clazz.getSimpleName() + " is not annotated with @JsonSerializable"
            );
        }

        JsonSerializable annotation = clazz.getAnnotation(JsonSerializable.class);
        String directory = annotation.directory();

        Path outputDir = Paths.get(directory);
        if (!Files.exists(outputDir)) {
            Files.createDirectories(outputDir);
        }

        Path outputFile = outputDir.resolve(clazz.getSimpleName() + ".json");

        MAPPER.writerWithDefaultPrettyPrinter()
                .writeValue(outputFile.toFile(), obj);

        System.out.println("JSON written to: " + outputFile.toAbsolutePath());
    }
}

package org.itstep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws IOException, URISyntaxException {
        System.out.println("ok");
        print();

        SpringApplication.run(Application.class, args);
    }

    public static void print() throws URISyntaxException, IOException {
        URL url = Application.class.getResource("/");
        Path path = Paths.get(url.toURI());
        Files.walk(path, 5).forEach(p -> System.out.printf("- %s%n", p.toString()));
    }

}

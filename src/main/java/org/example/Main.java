package org.example;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        port(8080); // Встановлюємо порт 8080

        get("/", (req, res) -> "Hello from Dockerized Java App!");

        System.out.println("Server is running on port 8080...");
    }
}

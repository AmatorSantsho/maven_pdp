package com.epam.automation.api;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        RestApiObject restApiObject = new RestApiObject();
        System.out.println(restApiObject.post("google"));
        System.out.println(restApiObject.get("google"));
    }
}

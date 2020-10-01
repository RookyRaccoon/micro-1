package com.example.webservice1;

public class Greeting {

    private final long id;
    private final String message;

    public Greeting(long id, String message) {
        this.message = message;
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}

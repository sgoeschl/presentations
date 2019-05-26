package com.github.sgoeschl.freemarker.sample.model;

public class User {

    private final String id;
    private final String name;
    private final String group;

    public User(String id, String name, String group) {
        this.id = requireNotEmpty(id);
        this.name = requireNotEmpty(name);
        this.group = requireNotEmpty(group);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public static String requireNotEmpty(String obj) {
        if (obj == null) {
            throw new NullPointerException();
        }

        if (obj.trim().isEmpty()) {
            throw new IllegalArgumentException("Non-empty string expected");
        }

        return obj;
    }

}

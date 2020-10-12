package com.github.sgoeschl.freemarker.demo.app.form;

import javax.validation.constraints.NotBlank;

public class UserForm {

    @NotBlank(message = "User id is mandatory")
    private String id;

    @NotBlank(message = "User name is mandatory")
    private String name;

    @NotBlank(message = "User group is mandatory")
    private String group;

    public UserForm() {
    }

    public UserForm(String id, String name, String group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}

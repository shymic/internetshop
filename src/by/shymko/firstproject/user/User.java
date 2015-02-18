package by.shymko.firstproject.user;

import by.shymko.firstproject.JSONRecord;

/**
 * Created by Andrey on 17.02.2015.
 */
public abstract class User extends JSONRecord {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

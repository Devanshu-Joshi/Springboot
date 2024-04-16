package com.example.test;

public class User {
    
    User(int id, String name, int sem)
    {
        this.id = id;
        this.name = name;
        this.sem = sem;
    }
    
    int id;
    String name;
    int sem;

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getSem()
    {
        return sem;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSem(int sem)
    {
        this.sem = sem;
    }
}

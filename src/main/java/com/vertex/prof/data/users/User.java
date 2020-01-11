package com.vertex.prof.data.users;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private String name;
    private User boss;
    private List<User> friends;
}

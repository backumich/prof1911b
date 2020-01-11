package com.vertex.prof.streams;

import com.vertex.prof.data.users.User;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        User user = getUser();
        Set<User> users = user.getFriends().stream()
                .flatMap(u -> u.getFriends().stream())
                .flatMap(u -> u.getFriends().stream())
                .peek(System.out::println)
                .collect(Collectors.toSet());

        Optional<User> optionalUser = Optional.ofNullable(user);

        if (optionalUser.isPresent()) {
            System.out.println("we have a user");
        }

        String bossName = optionalUser
                .map(User::getBoss)
                .map(User::getName)
                .orElseThrow(() -> new RuntimeException("No name!"));


    }

    private static User getUser() {
        return new User();
    }
}

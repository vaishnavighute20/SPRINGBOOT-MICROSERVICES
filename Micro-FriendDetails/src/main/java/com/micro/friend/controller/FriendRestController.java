package com.micro.friend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.micro.friend.entity.Friend;
import com.micro.friend.service.IFriendService;

@RestController
public class FriendRestController {

    @Autowired
    IFriendService service;

    @PostMapping("/addFriend")
    public String addFriend(@RequestBody Friend friend) {
        return service.addFriendService(friend);
    }

    @GetMapping("/{phoneNumber}")
    public List<Long> getFriendsContacts(@PathVariable Long phoneNumber) {
        List<Long> contacts = service.readFriendsContact(phoneNumber);
        System.out.println("Returning contacts: " + contacts);  // Debugging log
        return contacts;
    }

    @DeleteMapping("/removeFriend/{phoneNumber}/{friendNumber}")
    public Integer removeFriend(@PathVariable Long phoneNumber, @PathVariable Long friendNumber) {
        System.out.println("Removing friend: phoneNumber = " + phoneNumber + ", friendNumber = " + friendNumber);
        return service.removeFriend(phoneNumber, friendNumber);
    }
}

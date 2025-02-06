package com.micro.friend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.friend.entity.Friend;
import com.micro.friend.repository.FriendRepository;
import com.micro.friend.service.IFriendService;

@Service
public class FriendServiceImpl implements IFriendService {

    @Autowired
    FriendRepository repository;

    @Override
    public String addFriendService(Friend friend) {
        
        Integer count = repository.checkFriendContact(friend.getPhoneNumber(), friend.getFriendNumber());

        if (count == 0) {
            repository.saveAndFlush(friend);
            return "Friend Contact is added";
        } else {
            return "Friend Contact already exists";
        }
    }

    @Override
    public List<Long> readFriendsContact(Long phoneNumber) {
        List<Long> contacts = repository.findFriendsContactNumbers(phoneNumber);
        System.out.println("Friends found: " + contacts);  
        return contacts;
    }

    @Override
    public Integer removeFriend(Long phoneNumber, Long friendNumber) {
        return repository.deleteFriend(phoneNumber, friendNumber);
    }
}

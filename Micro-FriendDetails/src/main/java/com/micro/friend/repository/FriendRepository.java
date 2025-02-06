package com.micro.friend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.micro.friend.entity.Friend;

import jakarta.transaction.Transactional;

public interface FriendRepository extends JpaRepository<Friend, Integer> {

    @Query(value = "SELECT COUNT(*) FROM friend WHERE phone_no = ? AND friend_no = ?", nativeQuery = true)
    Integer checkFriendContact(Long phoneNumber, Long friendNumber);

    @Query(value = "SELECT friend_no FROM friend WHERE phone_no = ?", nativeQuery = true)
    List<Long> findFriendsContactNumbers(Long phoneNumber);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM friend WHERE phone_no = ? AND friend_no = ?", nativeQuery = true)
    Integer deleteFriend(Long phoneNumber, Long friendNumber);
}

package com.Instagram.repository;

import com.Instagram.model.Like;
import com.Instagram.model.Post;
import com.Instagram.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILikeRepo extends JpaRepository<Like,Integer> {

    List<Like> findByInstaPostAndLiker(Post instaPost, User liker);

    List<Like> findByInstaPost(Post validPost);

}

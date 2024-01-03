package com.celestin.restfulwebservices.database;

import com.celestin.restfulwebservices.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostJpaController extends JpaRepository<Post,Integer> {
}

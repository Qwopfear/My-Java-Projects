package com.example.ZooShare.repsositories;


import com.example.ZooShare.entity.Post;
import com.example.ZooShare.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

        //Find ALL user posts and sorted by date Decs(From newest to oldest)
    List<Post> findAllByUserOrderByCreatedDateDesc(User user);
        //Find ALL userS posts and sorted by date Decs(From newest to oldest)
//     List<Post> findAllBy(User user);

    Optional<Post> findPostByIdAndUser(Long id,User user);

    Optional<Post> findPostByTitle(String title);

}

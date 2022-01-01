package com.example.ZooShare.repsositories;

import com.example.ZooShare.entity.Comment;
import com.example.ZooShare.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment,Long> {

//    List<Comment> findAllByPost(Post post);


    Optional<Comment> findByIdAndUserId(Long commentId,Long userId);
}

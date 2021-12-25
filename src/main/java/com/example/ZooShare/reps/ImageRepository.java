package com.example.ZooShare.reps;

import com.example.ZooShare.entity.ImageModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageRepository extends JpaRepository<ImageModel, Long> {

    Optional<ImageModel> findByUserId(Long userId);

    Optional<ImageModel> findByPostId(Long postId);
}

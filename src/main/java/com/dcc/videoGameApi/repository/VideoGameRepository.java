package com.dcc.videoGameApi.repository;

import com.dcc.videoGameApi.models.VideoGame;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VideoGameRepository extends JpaRepository<VideoGame, Integer> {
    Optional<Object> findById();
}

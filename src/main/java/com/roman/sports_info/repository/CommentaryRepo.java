package com.roman.sports_info.repository;

import com.roman.sports_info.domain.Commentary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentaryRepo extends JpaRepository<Commentary, Integer> {
    Optional findById(int id);
}

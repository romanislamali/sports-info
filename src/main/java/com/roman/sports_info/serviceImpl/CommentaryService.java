package com.roman.sports_info.serviceImpl;

import com.roman.sports_info.repository.CommentaryRepo;

import java.util.Optional;

public interface CommentaryService {
    Optional findById(int id);
}

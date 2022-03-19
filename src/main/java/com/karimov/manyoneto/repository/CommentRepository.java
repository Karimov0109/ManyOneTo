package com.karimov.manyoneto.repository;

import com.karimov.manyoneto.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}

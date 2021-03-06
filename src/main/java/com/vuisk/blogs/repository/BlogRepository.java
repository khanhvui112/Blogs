package com.vuisk.blogs.repository;

import com.vuisk.blogs.model.entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}

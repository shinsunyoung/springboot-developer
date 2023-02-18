package me.shinsunyoung.musthavespringboot.repository;

import me.shinsunyoung.musthavespringboot.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}


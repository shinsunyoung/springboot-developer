package me.shinsunyoung.musthavespringboot.service;

import lombok.RequiredArgsConstructor;
import me.shinsunyoung.musthavespringboot.domain.Article;
import me.shinsunyoung.musthavespringboot.dto.AddArticleRequest;
import me.shinsunyoung.musthavespringboot.dto.ArticleResponse;
import me.shinsunyoung.musthavespringboot.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }
}

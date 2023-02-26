package me.shinsunyoung.musthavespringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.shinsunyoung.musthavespringboot.domain.Article;

@AllArgsConstructor
@Getter
public class AddArticleRequest {

    private String title;
    private String content;

    public Article toEntity(String author) {
        return Article.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}


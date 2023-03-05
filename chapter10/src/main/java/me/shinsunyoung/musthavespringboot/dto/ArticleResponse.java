package me.shinsunyoung.musthavespringboot.dto;

import lombok.Getter;
import me.shinsunyoung.musthavespringboot.domain.Article;

@Getter
public class ArticleResponse {

    private final String title;
    private final String content;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}

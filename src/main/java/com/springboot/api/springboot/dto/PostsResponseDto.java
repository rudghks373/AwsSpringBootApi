package com.springboot.api.springboot.dto;

import com.springboot.api.springboot.domain.posts.Posts;

public class PostsResponseDto {

    private Long id;
    private  String title;
    private  String  content;
    private  String author;

    public PostsSaveRequestDto(Posts entity){
        this.id =entity.getId();
        this.title =entity.getTitle();
        this.content =entity.getContent();
        this.author = entity.getAuthor();
    }
}

package com.springboot.api.springboot.service.posts;

import com.springboot.api.springboot.domain.posts.Posts;
import com.springboot.api.springboot.domain.posts.PostsRepository;
import com.springboot.api.springboot.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public  Long update(Long id, PostsSaveRequestDto requestDto){
        Posts posts = postsRepository.findById(id).orElseThrow(() ->new IllegalArgumentException("해당 사용자가 없습니다. id=" +id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public PostsSaveRequestDto findById(Long id) {
        Posts entity = postsRepository.findById(id).orElseThrow(()->new IllegalArgumentException("해당 사용자가 없습니다 id="+id));

        return  new PostsSaveRequestDto(entity);
    }
}

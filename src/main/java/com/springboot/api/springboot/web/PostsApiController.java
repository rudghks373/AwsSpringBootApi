package com.springboot.api.springboot.web;

import com.springboot.api.springboot.dto.PostsSaveRequestDto;
import com.springboot.api.springboot.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;


    @PostMapping
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PostMapping("/api/vi/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsSaveRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }
     @GetMapping("/api/vi/posts/{id}")
     public PostsSaveRequestDto findById(@PathVariable Long id){
            return postsService.findById(id);
        }
}


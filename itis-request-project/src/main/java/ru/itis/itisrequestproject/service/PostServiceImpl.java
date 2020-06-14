package ru.itis.itisrequestproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itis.itisrequestproject.dto.PostDto;
import ru.itis.itisrequestproject.models.Post;
import ru.itis.itisrequestproject.models.PostTemplate;
import ru.itis.itisrequestproject.repositories.PostRepository;

@Component
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Autowired
    PostTemplate postTemplate;

    @Override
    public Post createPost(PostDto form) {
        Post post = Post.builder()
                .id(form.getId())
                .what(form.getWhat())
                .place(form.getPlace())
                .eventTime(form.getEventTime())
                .actions(form.getActions())
                .people(form.getPeople())
                .profit(form.getProfit())
                .control(form.getControl())
                .build();

        postRepository.save(post);
        return post;
    }
}

package ru.itis.itisrequestproject.service;

import ru.itis.itisrequestproject.dto.PostDto;
import ru.itis.itisrequestproject.models.Post;

public interface PostService {
    Post createPost(PostDto form);
}

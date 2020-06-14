package ru.itis.itisrequestproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.itisrequestproject.models.Post;

public interface PostRepository  extends JpaRepository<Post, Long> {
}

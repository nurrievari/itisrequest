package ru.itis.itisrequestproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.itisrequestproject.models.Post;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PostDto {
    private Long id;
    private String what;
    private String place;
    private String eventTime;
    private String actions;
    private String people;
    private String profit;
    private String control;

    public static PostDto from(Post post) {
        return PostDto.builder()
                .id(post.getId())
                .what(post.getWhat())
                .place(post.getPlace())
                .eventTime(post.getEventTime())
                .actions(post.getActions())
                .people(post.getPeople())
                .profit(post.getProfit())
                .control(post.getControl())
                .build();
    }
}

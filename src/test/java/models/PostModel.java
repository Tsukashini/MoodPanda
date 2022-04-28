package models;

import lombok.*;

@Data
@Builder
@EqualsAndHashCode
@ToString
public class PostModel {
    private String rate;
    private String about;
}

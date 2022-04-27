package models;

import lombok.*;

@Data
@Builder
@EqualsAndHashCode
@ToString
public class ProfileModel {
    private String name;
    private String initial;
    private String biography;
}

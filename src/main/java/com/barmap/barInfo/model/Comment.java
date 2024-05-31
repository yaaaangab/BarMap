package com.barmap.barInfo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private Integer commentId;
    private Integer barId;
    private Integer userId;
    private String userName;
    private String imgSrc;
    private String message;

}











package com.zjx.zblog.vo;

import com.zjx.zblog.entity.Comment;
import lombok.Data;

@Data
public class CommentVo extends Comment {
    private Long authorId;
    private String authorName;
    private String authorAvatar;
}

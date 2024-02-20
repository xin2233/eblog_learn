package com.zjx.zblog.vo;

import com.zjx.zblog.entity.Post;
import lombok.Data;

@Data
public class PostVo extends Post {
    private Long authorId;
    private String authorName;
    private String authorAvatar;

//    private Long categoryId;
    private String categoryName;

}

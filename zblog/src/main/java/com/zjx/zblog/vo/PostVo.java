package com.zjx.zblog.vo;

import com.zjx.zblog.entity.Post;
import lombok.Data;

@Data
public class PostVo extends Post {
    private Long authorId;
    private String authorName;
    private String authorAvatar;

//    已经有了
//    private Long categoryId;
    private String categoryName;

}

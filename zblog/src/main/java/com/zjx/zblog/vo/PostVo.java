package com.zjx.zblog.vo;

import com.zjx.zblog.entity.Post;
import lombok.Data;

/**
 * "PostVo"通常是指一个用于表示帖子（Post）的值对象（Value Object）。
 * 在软件开发中，值对象（Value Object）是一种用于传输和封装数据的对象，通常用于将相关的数据聚合在一起以便于传输或处理。
 *
 * 在这种情况下，"PostVo"可能是一个用于表示帖子信息的类或对象，通常包含了帖子的各种属性和相关信息。
 * 这样的值对象通常用于在不同的层之间传递数据，比如在业务逻辑层和表示层之间传递帖子信息。
 *
 * 通常，一个"PostVo"对象可能包含帖子的标题、内容、作者、发布时间等属性。
 * 这样的值对象可以帮助在不同的模块或组件中传递和使用帖子信息，同时也有助于降低耦合度和提高代码的可维护性。
 */
@Data
public class PostVo extends Post {
    private Long authorId;
    private String authorName;
    private String authorAvatar;

//    已经有了
//    private Long categoryId;
    private String categoryName;

}

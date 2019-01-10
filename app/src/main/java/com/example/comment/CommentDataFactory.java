package com.example.comment;

import java.util.List;
import java.util.Map;

public interface CommentDataFactory<T extends Map> {

    T createCommentStructure(List<Comment> comments);
}

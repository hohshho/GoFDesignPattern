package com.example.patterns.behavioralPatterns._09_decorator._02_after.decorator;

import com.example.patterns.behavioralPatterns._09_decorator._02_after.CommentService;

public class CommentDecorator implements CommentService {

    private CommentService commentService;

    CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }
}

package com.example.patterns.behavioralPatterns._09_decorator._01_before;

// 상속으로 문제를 푸니, 모든 경우의 수에 맞는 하위 클래스를 만들어야 하는 문제점 존재
public class TrimmingCommentService extends CommentService{

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment){
        return comment.replace("!", "~");
    }
}

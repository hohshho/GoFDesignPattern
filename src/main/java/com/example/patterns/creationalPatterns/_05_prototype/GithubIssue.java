package com.example.patterns.creationalPatterns._05_prototype;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class GithubIssue implements Cloneable{
    private int id;
    private String title;

    // 공변 -> Object.class는 명시적으로 상속받고 있지 않아도 객체 생성 시 상속을 받음
    @Override
    public GithubIssue clone() {
        try {
            return (GithubIssue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

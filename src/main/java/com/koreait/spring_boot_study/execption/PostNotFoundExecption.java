package com.koreait.spring_boot_study.execption;

// 커스텀 예외 - RuntimeException을 상속받으면 커그텀 예외를 만들 수 있다
// 게시글을 찾을 수 없을 때
public class PostNotFoundExecption extends RuntimeException {
    public PostNotFoundExecption(String message) {
        super(message);
    }
}

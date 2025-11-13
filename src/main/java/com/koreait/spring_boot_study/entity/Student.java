package com.koreait.spring_boot_study.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor // 모든 필드를 초기화하는 생성자 코드 작성
@Getter // 모든 필드의 getter 코드가 작성됨
public class Student {
    private int id;
    private String name;
}

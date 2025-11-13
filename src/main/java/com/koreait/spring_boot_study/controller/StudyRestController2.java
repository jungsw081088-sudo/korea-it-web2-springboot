package com.koreait.spring_boot_study.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/practice")
// 스프링부트는 톰켓(자바언어로 만든 서버)를 내장
// 로컬에서 8080포트로 실행된다.
// localhost:8080 -> 스프링부트주소
// localhost:8080/practice/add -> add 메서드 실행
public class StudyRestController2 {

    // 실습) 컨트롤러 2개를 만들기
    // 1. 쿼리스트링으로 숫자 2개를 받아서 더한 결과를 응답하는 컨트롤러

    @GetMapping("/add")
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // 2. 쿼리스트링으로 숫자 4개를 받아서 평균을 응답하는 컨트롤러
    // localhost:8080/practice/vnum?num1=1&num2=2&num3=3&num4=40
    @GetMapping("/vnum")
    public double vnum(int num1, int num2, int num3, int num4) {
        // 자바복습) double 크기가 int보다 크니까
        // 서로 연산하면 자동으로 double로 변환
    return (num1 + num2 + num3 + num4) / 4.0;
    }

    /*
    포스트맨 응답으로
    [
        {
            "name": "홍길동",
            "address": "부산시 연제구"
        },
        {
            "name": "고길동",
            "address": "부산시 부산진구"
        }
    ]
    */

    @GetMapping("/profiles")
    public List<Map<String, Object>> profiles(String name1, String add1, String name2, String add2) {
        List<Map<String, Object>> files = new ArrayList<>();
        Map<String, Object> data1 = Map.of(
                "name", name1,
                "address", add1
        );

        Map<String, Object> data2 = Map.of(
                "name", name2,
                "address", add2
        );
        files.add(data1);
        files.add(data2);
        return files;
    }

    @GetMapping("/profiles2")
    public List<Map<String, Object>> profiles2() {
        return List.of(
                Map.of( "name", "홍길동",
                "address", "부산시 연제구"
                ),
                Map.of(
                        "name", "고길동",
                    "address", "부산시 부산진구"
                )
        );
    }


}

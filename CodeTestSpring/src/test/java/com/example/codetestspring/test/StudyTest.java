package com.example.codetestspring.test;

import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("display Name11")
    void create() {

        Study study = new Study();
        assertNotNull(study);
        System.out.println("crete");
        assertEquals(StudyStatus.DRAFT, study.getStatus(), "스터디를 처음 만들면 상태값은 드래프트");
        assertTrue(1 <2);
        assertTimeoutPreemptively(Duration.ofMillis(1000), () -> new Study());

    }

    @Test
//    @Disabled //테스트를 중지시킴
    void create1(){
        System.out.println("create1");
    }



    @BeforeAll
    static void beforeAll(){
        System.out.println("beforAll");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("afterAll");
    }

    @BeforeEach
    void BeforeEach(){
        System.out.println("BeforeEach");
    }

    @AfterEach
    void afterEach(){
        System.out.println("AfterEach");
    }
}

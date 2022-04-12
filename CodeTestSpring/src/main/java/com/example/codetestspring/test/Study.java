package com.example.codetestspring.test;

public class Study {

    private StudyStatus status = StudyStatus.DRAFT;
    private int limit;
    public StudyStatus getStatus(){
        return this.status;
    }

    public int getLimit(){
        return this.limit;
    }

    public void test(){
       String builder = URLBuilder.builder()
                .schema("ss")
                .preUrl("pre")
                .path("path")
                .buil();
       System.out.println(builder);
    }


}

package com.example.pattern.biz.component;

 public class URLBuilder {

   private String schema;
   private String preURL;
   private String path;

   public static URLBuilder builder(){
    return new URLBuilder();
   }

   public URLBuilder schema(String schema){
   this.schema = schema;
   return this;
   }
   public URLBuilder preUrl(String preURL){
    this.preURL = preURL;
    return this;
   }
   public URLBuilder path(String path){
    this.path = path;
    return this;
   }

   public String buil(){
    return this.schema+this.preURL+this.path;
   }

 }

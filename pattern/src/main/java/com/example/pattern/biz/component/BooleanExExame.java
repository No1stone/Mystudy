package com.example.pattern.biz.component;

public class BooleanExExame {

    private String a;
    private String b;
    private String c;
    private String d;

    public BooleanExExame() {
    }

    public BooleanExExame(String a, String b, String c, String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getD() {
        return d;
    }

    public static BooleanExExame builder() {
        return new BooleanExExame();
    }

    public BooleanExExame a() {
        return this;
    }

    public BooleanExExame a(String a) {
            this.a = a;
        return this;
    }

    public void b() {
    }

    public BooleanExExame b(String b) {
//        if(b.isBlank()) this.b = b;
//        if(b.isEmpty()) this.b = b;
        if(b instanceof String) this.b = b;

        return this;
    }

    public BooleanExExame c() {
        return this;
    }

    public BooleanExExame c(String c) {
        this.c = c;
        return this;
    }

    public BooleanExExame d() {
        return this;
    }

    public BooleanExExame d(String d) {
        this.d = d;
        return this;
    }

    public String build() {
        String re = "";
        if (a != null) {
            re += a;
        }
        if (b != null) {
            re += b;
        }
        if (c != null) {
            re += c;
        }
        if (d != null) {
            re += d;
        }

        return re;
    }

}

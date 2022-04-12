package com.example.codetestspring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CodeTestSpringApplicationTests {

    @Test
    void contextLoads() {
        CodeTestSpringApplication app = new CodeTestSpringApplication();
        assertNotNull(app);

    }

}

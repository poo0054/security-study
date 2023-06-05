package io.github.poo0054.security;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.Assert;

/**
 * @author zhangzhi
 */
public class PasswordEncoderTest {
    @Test
    public void test() {
        //创建解析器
        PasswordEncoder encoder = new BCryptPasswordEncoder();

        //对密码进行加密
        String password = encoder.encode("123");
        System.out.println(password);
        //判断原字符加密后和内容是否匹配
        Assert.isTrue(encoder.matches("123", password), "密码不正确");
    }
}

package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
// 롬복으로 Getter, setter 생성 한 것이랑 똑같음
public class HelloData {

    private String username;
    private int age;


}

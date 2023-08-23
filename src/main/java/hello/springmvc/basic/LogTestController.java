package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    //@Slf4j 넣어주면 아래꺼 안해도 됨. Lombok이 알아서 해줌.
    //private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        System.out.println("name = " + name);

        //아래와 같이 쓰면 안됨
        //debug레벨 일 땐 trace는 로그에 보여지지 않아야 되는 상황.
        // 보여지지 않긴 하는데 그런데 저렇게 쓰면 자바 언어의 특성상 string 연산이 먼저 일어남.
        // 즉, 불필요한 리소스를 사용하게 된다.
        log.trace("trace log ={}" +  name);

        log.trace("trace log ={}", name);
        log.debug("trace debug ={}", name);
        log.info("trace info ={}", name);
        log.warn("trace warn ={}", name);
        log.error("error warn ={}", name);
        log.info(" info log={}", name);

        return "ok";
    }
}

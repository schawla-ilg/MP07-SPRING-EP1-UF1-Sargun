package ilg.daw.nivell2.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
public class helloWorldController {

    @RequestMapping("/")
    String helloWorld() {return "HELLO WORLD"; }

    @RequestMapping("/{userName}")
    String helloWorld(
            @PathVariable(name="userName") String userName) throws Exception {
        return "Hello " + userName;

    }

}


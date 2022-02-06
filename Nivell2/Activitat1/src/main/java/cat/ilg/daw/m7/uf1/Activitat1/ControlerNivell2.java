package cat.ilg.daw.m7.uf1.Activitat1;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;



@RestController
@EnableAutoConfiguration
public class ControlerNivell2 {

    @RequestMapping("/{userName}")
    String helloWorld(
            @PathVariable(name="userName") String userName) throws Exception {
        return "Hello, " + userName;

    }

}

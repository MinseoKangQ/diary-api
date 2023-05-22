package diary.project.diaryapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/connection")
public class HomeController {

    @PostMapping("/android")
    @ResponseBody
    public String androidResponse(@RequestBody User user) {
        System.out.println("Connection request from Android");
        System.out.println("id : " + user.getId());
        return "OK";
    }
}
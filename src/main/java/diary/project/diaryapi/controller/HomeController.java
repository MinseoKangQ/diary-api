package diary.project.diaryapi.controller;

import diary.project.diaryapi.domain.User;
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
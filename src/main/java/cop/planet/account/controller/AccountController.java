package cop.planet.account.controller;

import cop.planet.account.model.UserVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@EnableAutoConfiguration
@Log
@RestController
public class AccountController {

    @GetMapping("/login")
    public String login(UserVo userVo){
        String result = "null";

        log.info("테스트");
        return result;
    }


    public static void main(String[] args) {
        SpringApplication.run(AccountController.class, args);
    }
}

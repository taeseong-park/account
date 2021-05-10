package cop.planet.account.controller;

import cop.planet.account.dto.AccountDto;
import cop.planet.account.model.UserVo;
import cop.planet.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@EnableAutoConfiguration
@Log
@Controller
public class AccountController {

    @Autowired
    AccountService accountRestService;

    @GetMapping("/")
    public String index(UserVo userVo){
        String result = "null";

        log.info("테스트");
        return result;
    }

    @GetMapping("/insert/{id}")
    public String login(@PathVariable String id) throws Exception{

        AccountDto accountDto = new AccountDto();
        accountDto.setId(id);
        accountDto.setPw("abcdef");
        accountDto.setName("테스트");
        accountDto.setPhoneNumber("0263606630");

        log.info(accountDto.toString());

        String result = accountRestService.saveid(accountDto);

        log.info(result);
        return result;
    }

    @GetMapping("/loginCheck")
    public String loginCheck(AccountDto input) throws Exception{

        input.setId("123456");
        input.setPw("abcdef");
        log.info(input.toString());

        UserVo result = accountRestService.checkLogin(input);

        log.info(result.toString());
        return result.toString();
    }

}

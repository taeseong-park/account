package cop.planet.account.controller;

import cop.planet.account.dto.AccountDto;
import cop.planet.account.model.UserVo;
import cop.planet.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


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

    @PostMapping("/signIn")
    public String signIn(@RequestBody AccountDto accountDto) throws Exception{
        String result = null;
        try {
            log.info(accountDto.toString());
        }catch(Exception e){
            log.info("어디지111111111111111111111111");
        }
        try {
            result = accountRestService.signIn(accountDto);
        }catch(Exception e){
            log.info("어디지111111111111111111111112");
        }

        log.info(result);
        if(accountDto.getId().equals(result)) {
            log.info("Success");
            return "Success";
        } else{
            log.info("Fail");
            return "Fail";
        }
    }


    @PostMapping("/changePw")
    public String changePw(@RequestBody AccountDto accountDto) throws Exception{
        String result = null;
        try {
            log.info(accountDto.toString());
        }catch(Exception e){
            log.info("어디지111111111111111111111111");
        }
        try {
            result = accountRestService.signIn(accountDto);
        }catch(Exception e){
            log.info("어디지111111111111111111111112");
        }

        log.info(result);
        if(accountDto.getId().equals(result)) {
            log.info("Success");
            return "Success";
        } else{
            log.info("Fail");
            return "Fail";
        }
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

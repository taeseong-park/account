package cop.planet.account.service.impl;

import cop.planet.account.dto.AccountDto;
import cop.planet.account.model.UserVo;
import cop.planet.account.repository.AccountRepository;
import cop.planet.account.service.AccountService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Log
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    @Transactional
    public String saveid(AccountDto accountDto) throws Exception{
        log.info("들어오긴 들어왔어");
        log.info(accountDto.toString());

        return accountRepository.save(accountDto.toUserVo()).getId();
    }

    @Override
    public UserVo checkLogin(AccountDto input) throws Exception {
        UserVo userVo = new UserVo();

        userVo = accountRepository.findByIdPw(input.getId(), input.getPw());
        return userVo;
    }
}

package cop.planet.account.service.impl;

import cop.planet.account.dto.AccountDto;
import cop.planet.account.repository.AccountRepository;
import cop.planet.account.service.AccountRestService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Log
@Service
public class AccountRestServiceImpl implements AccountRestService {

    //@Autowired
    //private AccountRepository accountRepository;

    @Override
    public int checkLogin(String id, String pw) throws Exception {
        return 0;
    }

    @Override
    @Transactional
    public String save(AccountDto accountDto) throws Exception{
        log.info("들어오긴 들어왔어");
        log.info(accountDto.toString());
        return null;
        //return accountRepository.save(accountDto.toUserVo()).getId();
    }
}

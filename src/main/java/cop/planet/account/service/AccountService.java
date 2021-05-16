package cop.planet.account.service;

import cop.planet.account.dto.AccountDto;
import cop.planet.account.model.UserVo;

public interface AccountService {

    public UserVo checkLogin(AccountDto accountDto) throws Exception;
    public String signIn(AccountDto accountDto) throws Exception;
}

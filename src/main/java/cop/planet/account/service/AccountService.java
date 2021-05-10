package cop.planet.account.service;

import cop.planet.account.dto.AccountDto;

public interface AccountService {

    public int checkLogin(String id, String pw) throws Exception;

    public String saveid(AccountDto accountDto) throws Exception;
}

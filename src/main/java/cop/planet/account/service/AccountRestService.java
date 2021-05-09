package cop.planet.account.service;

import cop.planet.account.dto.AccountDto;

public interface AccountRestService {

    public int checkLogin(String id, String pw) throws Exception;

    public String save(AccountDto accountDto) throws Exception;
}

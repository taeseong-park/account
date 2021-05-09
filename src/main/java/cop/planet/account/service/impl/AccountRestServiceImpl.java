package cop.planet.account.service.impl;

import cop.planet.account.service.AccountRestService;
import org.springframework.stereotype.Service;

@Service
public class AccountRestServiceImpl implements AccountRestService {

    @Override
    public int checkLogin(String id, String pw) throws Exception {
        return 0;
    }
}

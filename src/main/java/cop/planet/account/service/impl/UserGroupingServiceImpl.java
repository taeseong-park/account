package cop.planet.account.service.impl;

import cop.planet.account.repository.UserGroupingRepository;
import cop.planet.account.service.UserGroupingService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Log
@Service
public class UserGroupingServiceImpl implements UserGroupingService {

    @Autowired
    private UserGroupingRepository userGroupingRepository;
}

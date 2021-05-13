package cop.planet.account.service.impl;

import cop.planet.account.repository.GroupRepository;
import cop.planet.account.service.GroupService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Log
@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;
}

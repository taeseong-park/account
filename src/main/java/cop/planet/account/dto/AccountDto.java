package cop.planet.account.dto;

import cop.planet.account.model.UserVo;
import lombok.Data;

@Data
public class AccountDto {

    private String id;
    private String pw;
    private String name;
    private String phoneNumber;
    private String updateDate;

    public UserVo checkLogin(){
        return UserVo.builder()
                .id(id)
                .pw(pw)
                .name(name)
                .phoneNumber(phoneNumber)
                .updateDate(updateDate)
                .build();
    }
}

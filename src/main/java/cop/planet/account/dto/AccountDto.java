package cop.planet.account.dto;

import cop.planet.account.model.UserVo;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
public class AccountDto {

    private String id;
    private String pw;
    private String name;
    private String phoneNumber;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

    public UserVo toUserVo(){
        return UserVo.builder()
                .id(id)
                .pw(pw)
                .name(name)
                .phoneNumber(phoneNumber)
                .createDate(createDate)
                .updateDate(updateDate)
                .build();
    }

}

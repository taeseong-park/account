package cop.planet.account.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Entity
@Table(name = "user")
public class UserVo {

    @Id
    @Column(nullable = false, length = 20)
    private String id;

    @Column(nullable = false, length = 50)
    private String pw;

    @Column(length = 45)
    private String name;

    @Column(length = 16)
    private String phoneNumber;

    @CreationTimestamp
    private LocalDateTime createDate;

    @UpdateTimestamp
    private LocalDateTime updateDate;

}

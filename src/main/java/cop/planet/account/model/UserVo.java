package cop.planet.account.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class UserVo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, length = 20, unique = true)
    private String id;

    @Column(nullable = false, length = 50)
    private String pw;

    @Column(length = 45)
    private String name;

    @Column(length = 16)
    private String phoneNumber;

    @CreationTimestamp
    private String createDate;

    @CreationTimestamp
    private String updateDate;

}

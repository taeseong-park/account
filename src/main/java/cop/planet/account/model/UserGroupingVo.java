package cop.planet.account.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Entity
@Table(name = "user_grouping")
public class UserGroupingVo {

    @Id
    @Column(nullable = false, length = 10)
    private String groupCode;

    @Column(nullable = false, length = 20)
    private String id;

    @Column(nullable = false)
    private Integer number;

    @CreationTimestamp
    private LocalDateTime createDate;

    @UpdateTimestamp
    private LocalDateTime updateDate;

}

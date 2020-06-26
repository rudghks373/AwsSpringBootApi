package domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.MappedSuperclass;

@Getter
@MappedSuperclass
public class BaseTimeEntity {

    @CreatedDate
    private localDateTime createdDate;

    @LastModifiedDate
    private localDateTime modifiedDate;
}

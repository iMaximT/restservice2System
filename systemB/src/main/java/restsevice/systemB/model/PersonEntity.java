package restsevice.systemB.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class PersonEntity {
    @Id
    private String id;
    private String fullName;
    private String birthday;
    private String document;
    private byte[] image;
}

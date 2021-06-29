package restsevice.systemB.model;

import lombok.Data;

@Data
public class PersonDTO {
    private String id;
    private String fullName;
    private String birthday;
    private String document;
    private byte[] image;

}

package restsevice.systemB.dto;

import lombok.Data;

@Data
public class PersonDTO {
    private String id;
    private String fullName;
    private String Birthday;
    private String document;
    private byte[] image;
}

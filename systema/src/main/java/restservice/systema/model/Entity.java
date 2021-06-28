package restsevice.systemB.model;

import lombok.Data;

import java.awt.*;

@Data
public class Entity {
    private String id;
    private String fullName;
    private String birthday;
    private String document;
    private byte[] image;

}

package restsevice.systemB.service;

import org.springframework.stereotype.Service;
import restsevice.systemB.dto.PersonDTO;
import restsevice.systemB.model.PersonEntity;
//import

@Service
public class PersonSevice {
    public PersonEntity mapToProductEntity(PersonDTO dto){
        PersonEntity entity = new PersonEntity();
        entity.setId(dto.getId());
        entity.setFullName(dto.getFullName());
        entity.setBirthday(dto.getBirthday());
        entity.setDocument(dto.getDocument());
        entity.setImage(dto.getImage());
        return entity;
    }
}

package restsevice.systemB.service;

import org.springframework.stereotype.Service;
import restsevice.systemB.dto.PersonDTO;

@Service
public class ValidationService {

    private static final String CORRECT_ID_PATTERN = "^[0-9a-zA-Z]{16,19}$";

    public boolean validateEntity(PersonDTO entity) {
        return validateId(entity.getId());
    }


    boolean validateId(String id) {
        if (!id.matches(CORRECT_ID_PATTERN)) {
            return false;
        }
        return true;
    }

}

package restsevice.systemB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import restsevice.systemB.dto.PersonDTO;
import restsevice.systemB.repository.PersonRepository;
import restsevice.systemB.service.PersonSevice;
import restsevice.systemB.service.ValidationService;

@RestController
public class SystemBController  {
    @Autowired
    private PersonSevice personSevice;
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private ValidationService validationService;

    @PostMapping
    public String create(@RequestBody PersonDTO inputData) {

        if (!validationService.validateEntity(inputData)) {
            return "отказ";
        }

        personRepository.save(personSevice.mapToProductEntity(inputData));
        return "успех";
    }
}



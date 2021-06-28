package restsevice.systemB.controller;

import org.springframework.web.bind.annotation.*;
import restsevice.systemB.model.Entity;
import restsevice.systemB.service.ValidationService;

@RestController
public class SystemBController  {

    private final ValidationService validationService = new ValidationService();
/*    private Entity data = new Entity();

    @GetMapping
    public String get() {
        data.setId("11");
        data.setBirthday("2");
        data.setDocument("3");
        data.setFullName("4");
        data.setImage("Any String you want".getBytes());

        return data.toString();
    }
*/

    @PostMapping
    public String create(@RequestBody Entity inputData) {

        if (!validationService.validateEntity(inputData)) {
            return "отказ";
        }
        return "успех";
    }
}



package ma.ensias.employe2.controller;

import ma.ensias.employe2.response.EmployeResponse;
import ma.ensias.employe2.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeController {

    @Autowired
    private EmployeService employeService;
    @GetMapping("/employes/{id}")
    private ResponseEntity<EmployeResponse> getEmployeDetails(@PathVariable("id") int id)
    {         EmployeResponse employe = employeService.getEmployeById(id);
        return ResponseEntity.status(HttpStatus.OK).body(employe);
    }

}

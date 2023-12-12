package mr.iscae.Controller;

import mr.iscae.entity.Company;
import mr.iscae.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    @PostMapping ("/create")
    public ResponseEntity<Company> create(@RequestBody Company company){
        return ResponseEntity.status(HttpStatus.CREATED).body(companyService.create(company));

    }
    @GetMapping("/all")
    public ResponseEntity<List<Company>> getAllCompany(){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Company> getCompanyById(@PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.findById(id));
    }
    @PutMapping
    public ResponseEntity<String> updateCompany(@PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.findById(id));
    }


}

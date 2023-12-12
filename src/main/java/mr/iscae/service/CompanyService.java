package mr.iscae.service;

import mr.iscae.entity.Company;
import mr.iscae.repositrie.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;
    public List<Company> findAll(){

        return companyRepository.findAll();
    }
    public Company create(Company company){

        return companyRepository.save(company);
    }
    public Boolean delete(Long id){
        Optional<Company> companyOptional=companyRepository.findById(id);
        if(companyOptional.isPresent()){
            companyRepository.deleteById(id);
            return true;
        }
        else {
            return false;
        }
    }
    public Company findById(Long id){
        Optional<Company> companyOptional=companyRepository.findById(id);
        if(companyOptional.isPresent()) {
            return companyOptional.get();
        }
        else
        return null;
    }
    public String update(Company company,Long id){
        Optional<Company> companyOptional=companyRepository.findById(id);
        if(companyOptional.isPresent()){
            Company updateCompany=companyOptional.get();
            updateCompany.setName(company.getName());
            companyRepository.save(updateCompany);
            return " company update";
        }
        else
            return "old company not found  !";
    }
}

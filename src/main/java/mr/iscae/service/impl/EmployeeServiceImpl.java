package mr.iscae.service.impl;

import mr.iscae.entity.EmployeeEntity;
import mr.iscae.repositrie.EmployeeRepostory;
import mr.iscae.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepostory employeeRepostory;

    public EmployeeServiceImpl(EmployeeRepostory employeeRepostory) {
        this.employeeRepostory = employeeRepostory;
    }

    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return employeeRepostory.findAll();
    }

    @Override
    public Optional<EmployeeEntity> findbyId(Long id) {
        return employeeRepostory.findById(id);
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return employeeRepostory.save(employeeEntity);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
        return employeeRepostory.save(employeeEntity);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepostory.deleteById(id);

    }
}

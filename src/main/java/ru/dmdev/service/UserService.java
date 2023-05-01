package ru.dmdev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dmdev.database.pool.Company;
import ru.dmdev.repository.CompanyRepository;
import ru.dmdev.repository.CrudRepository;
import ru.dmdev.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

    //@Autowired
    //private CompanyService companyService;

    public UserService(UserRepository userRepository, CrudRepository<Integer, Company> companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }


//
//    @Autowired
//    public void setCompanyService(CompanyService companyService) {
//        this.companyService = companyService;
//    }
}

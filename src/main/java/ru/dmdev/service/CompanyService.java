package ru.dmdev.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import ru.dmdev.database.pool.Company;
import ru.dmdev.dto.CompanyReadDto;
import ru.dmdev.listener.entity.AccessType;
import ru.dmdev.listener.entity.EntityEvent;
import ru.dmdev.repository.CrudRepository;

import java.util.Optional;

@Service
public class CompanyService {

    private final UserService userService;
    private final CrudRepository<Integer, Company> companyRepository;
    private final ApplicationEventPublisher eventPublisher;

    public CompanyService(UserService userService, CrudRepository<Integer, Company> companyRepository, ApplicationEventPublisher applicationEvent) {
        this.userService = userService;
        this.companyRepository = companyRepository;
        this.eventPublisher = applicationEvent;
    }

    public Optional<CompanyReadDto> findById(Integer id) {
        return companyRepository.findById(id)
                .map(entity -> {
                    eventPublisher.publishEvent(new EntityEvent(entity, AccessType.READ));
                    return new CompanyReadDto(entity.getId());
                });
    }


}

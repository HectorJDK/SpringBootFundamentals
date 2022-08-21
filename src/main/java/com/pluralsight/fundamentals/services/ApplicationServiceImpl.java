package com.pluralsight.fundamentals.services;

import com.pluralsight.fundamentals.exceptions.ApplicationNotFoundException;
import com.pluralsight.fundamentals.models.Application;
import com.pluralsight.fundamentals.repositories.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    ApplicationRepository applicationRepository;

    @Override
    public List<Application> listApplications() {
        return applicationRepository.findAll();
    }

    @Override
    public Application findApplication(long id) throws ApplicationNotFoundException{
        Optional<Application> application = applicationRepository.findById(id);

        if (application.isPresent()) {
            return application.get();
        }
        throw new ApplicationNotFoundException("The application was not found");
    }
}

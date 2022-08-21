package com.pluralsight.fundamentals.services;

import com.pluralsight.fundamentals.exceptions.ApplicationNotFoundException;
import com.pluralsight.fundamentals.models.Application;

import java.util.List;

public interface ApplicationService {
    List<Application> listApplications();

    Application findApplication(long id);
}



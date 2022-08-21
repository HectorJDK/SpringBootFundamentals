package com.pluralsight.fundamentals.services;

import com.pluralsight.fundamentals.models.Release;
import com.pluralsight.fundamentals.repositories.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReleaseServiceImpl implements ReleaseService {

    @Autowired
    private ReleaseRepository releaseRepository;

    @Override
    public List<Release> listReleases() {
        return releaseRepository.findAll();
    }
}

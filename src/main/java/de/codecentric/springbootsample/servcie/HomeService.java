package de.codecentric.springbootsample.servcie;

import org.springframework.stereotype.Service;

@Service
public class HomeService implements IHomeService{
    @Override
    public boolean homerun() {
        return false;
    }
}

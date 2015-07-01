package be.vdab;

/**
 * Created by Erik Hendrickx on 30/06/15.
 */

import be.vdab.domain.User;
import be.vdab.repository.UserRepository;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
@RequestScoped
public class UserBean {
    private User user = new User();

    @Inject
    private UserRepository userRepository;

    public User getUser() {
        return user;
    }



//    @PostConstruct
//    public void init() {
//    user= userRepository.findbyId();

//    }
}



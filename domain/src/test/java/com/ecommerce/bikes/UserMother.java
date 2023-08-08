package com.ecommerce.bikes;

import com.ecommerce.bikes.domain.Like;
import com.ecommerce.bikes.domain.User;
import com.ecommerce.bikes.entity.LikeEntity;
import com.ecommerce.bikes.entity.UserEntity;

import java.util.Collections;
import java.util.List;

import static com.ecommerce.bikes.TestDataHelpers.*;

public class UserMother {

    public static User userToSave = new User("name@example.com", "pass");
    public static User userToSaveWithEncodedPassword = new User(null, "name@example.com", 'U', "$2a$12$tQQVAKT8ELlfD7hKYa8zIOfa7CVvxkFwJT27/cpumVjRFAnHGiRy6", Collections.emptyList(), Collections.emptyList());
    public static UserEntity savedUserEntity = new UserEntity(1L, "name@example.com", 'U', "$2a$12$tQQVAKT8ELlfD7hKYa8zIOfa7CVvxkFwJT27/cpumVjRFAnHGiRy6", Collections.emptyList(), Collections.emptyList());

    public static UserEntity savedUserEntityWithLikes = new UserEntity(1L, "name@example.com", 'U', "$2a$12$tQQVAKT8ELlfD7hKYa8zIOfa7CVvxkFwJT27/cpumVjRFAnHGiRy6", Collections.emptyList(), List.of( new LikeEntity(1L, createUserDAO(), createProductDAO())));
    public static User savedUser = new User(1L, "name@example.com", 'U', "$2a$12$tQQVAKT8ELlfD7hKYa8zIOfa7CVvxkFwJT27/cpumVjRFAnHGiRy6", Collections.emptyList(), Collections.emptyList());
    public static User savedUserWithLikes = new User(1L, "name@example.com", 'U', "$2a$12$tQQVAKT8ELlfD7hKYa8zIOfa7CVvxkFwJT27/cpumVjRFAnHGiRy6", Collections.emptyList(),  List.of( new Like(1L, createUser(), createProduct())));

    public static String encodedPassword = "$2a$12$tQQVAKT8ELlfD7hKYa8zIOfa7CVvxkFwJT27/cpumVjRFAnHGiRy6";

}
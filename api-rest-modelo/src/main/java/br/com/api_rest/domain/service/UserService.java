package br.com.api_rest.domain.service;

import br.com.api_rest.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}

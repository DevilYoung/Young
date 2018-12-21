package com.xiaola.demo.webservice;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaola on 18/12/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> GetUsers() {
        return Storage.users;
    }

    @Override
    public Response delete(int id) {
        Storage.users.remove(id);
        Response response = new Response();
        response.setCode("00");
        response.setMsg("success");
        return response;
    }

    @Override
    public Response insert(User user) {
        return null;
    }

    @Override
    public Response update(User user) {
        return null;
    }

    @Override
    public User getUser(int id) {
        return Storage.users.get(id);
    }
}

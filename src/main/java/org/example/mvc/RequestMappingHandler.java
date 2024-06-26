package org.example.mvc;

import org.example.mvc.controller.*;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandler implements HandlerMapping{
    private Map<HandlerKey, Controller> mappings = new HashMap<>();

    void init() {
//        mappings.put(new HandlerKey(RequestMethod.GET, "/"), new HomeController());
        mappings.put(new HandlerKey(RequestMethod.GET, "/users"), new UserListController());
        mappings.put(new HandlerKey(RequestMethod.POST, "/users"), new UserCreateController());
        mappings.put(new HandlerKey(RequestMethod.GET, "/users/form"), new ForwardController("/user/form"));
    }

    public Controller findHandler(HandlerKey key) {
        return mappings.get(key);
    }
}

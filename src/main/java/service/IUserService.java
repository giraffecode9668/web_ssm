package service;


import model.User;

public interface IUserService {

    User selectUser(Integer userId);
}
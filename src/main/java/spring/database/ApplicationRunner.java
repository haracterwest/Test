package spring.database;

import spring.database.pool.ConnectioPool;
import spring.database.repository.CompanyRepository;
import spring.database.repository.UserRepository;
import spring.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {
        var connectioPool = new ConnectioPool();
        var userRepository = new UserRepository(connectioPool);
        var companyRepository = new CompanyRepository(connectioPool);
        var userService = new UserService(userRepository, companyRepository);
    }
}

package spring.database.repository;

import spring.database.pool.ConnectioPool;

public class UserRepository {

    private final ConnectioPool connectioPool;

    public UserRepository(ConnectioPool connectioPool) {
        this.connectioPool = connectioPool;
    }
}

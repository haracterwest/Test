package spring.database.repository;

import spring.database.pool.ConnectioPool;

public class CompanyRepository {
    private final ConnectioPool connectioPool;

    public CompanyRepository(ConnectioPool connectioPool) {
        this.connectioPool = connectioPool;
    }
}

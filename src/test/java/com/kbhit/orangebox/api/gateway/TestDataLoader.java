package com.kbhit.orangebox.api.gateway;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.destination.DataSourceDestination;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

public class TestDataLoader {

    @Autowired
    private DataSource dataSource;

    public void loadTestData() {
        DataSourceDestination dataSourceDestination = new DataSourceDestination(dataSource);
        DbSetup dbSetup = new DbSetup(dataSourceDestination, TestDataSet.DUMMY_API_RESOURCES);
        dbSetup.launch();
    }

}

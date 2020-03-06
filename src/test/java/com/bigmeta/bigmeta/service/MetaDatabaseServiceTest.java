package com.bigmeta.bigmeta.service;

import com.bigmeta.bigmeta.domain.MetaDatabase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MetaDatabaseServiceTest {

    @Autowired
    private MetaDatabaseService metaDatabaseService;

	@Test
	public void testSave() {
		MetaDatabase metaDatabase = new MetaDatabase();
		metaDatabase.setName("AAAA");
		metaDatabase.setLocation("hdfs://hadoop000:8020/user/hive/warehouse");

		metaDatabaseService.save(metaDatabase);
	}

}


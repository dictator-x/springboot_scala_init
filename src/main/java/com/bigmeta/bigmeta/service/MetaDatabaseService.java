package com.bigmeta.bigmeta.service;

import com.bigmeta.bigmeta.repository.MetaDatabaseRepository;
import com.bigmeta.bigmeta.domain.MetaDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MetaDatabaseService {

	@Autowired
	private MetaDatabaseRepository metaDatabaseRepository;

	@Transactional
	public void save(MetaDatabase metaDatabase) {
		metaDatabaseRepository.save(metaDatabase);
	}

	public Iterable<MetaDatabase> query() {
		return metaDatabaseRepository.findAll();
	}
}

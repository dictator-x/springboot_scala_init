package com.bigmeta.bigmeta.service

import com.bigmeta.bigmeta.domain.MetaTable
import com.bigmeta.bigmeta.repository.MetaTableRepository

import org.springframework.transaction.annotation.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MetaTableService @Autowired()(metaTableRepository: MetaTableRepository) {

    @Transactional
    def save(metaTable: MetaTable) = {
        metaTableRepository.save(metaTable)
    }

    def query() = {
        metaTableRepository.findAll()
    }

}

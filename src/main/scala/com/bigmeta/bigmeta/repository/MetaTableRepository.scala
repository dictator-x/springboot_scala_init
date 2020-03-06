package com.bigmeta.bigmeta.repository

import com.bigmeta.bigmeta.domain.MetaTable

import org.springframework.data.repository.CrudRepository

trait MetaTableRepository extends CrudRepository[MetaTable, Integer] {

}

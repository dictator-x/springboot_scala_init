package com.bigmeta.bigmeta.domain

import javax.persistence.{Entity, Id, GeneratedValue, Table}
import scala.beans.BeanProperty

@Entity
@Table
class MetaTable {

    @Id
    @GeneratedValue
    @BeanProperty
    var id: Integer = _
    @BeanProperty
    var name: String = _
    @BeanProperty
    var tableType: String = _
    @BeanProperty
    var dbId:Integer = _

}

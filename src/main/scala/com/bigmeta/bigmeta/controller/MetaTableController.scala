package com.bigmeta.bigmeta.controller

import com.bigmeta.bigmeta.domain.MetaTable
import com.bigmeta.bigmeta.service.MetaTableService
import com.bigmeta.bigmeta.utils.ResultVOUtil

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{ResponseBody, RequestMapping, RequestMethod, RestController, ModelAttribute}

@RestController
@RequestMapping(Array("/meta/table"))
class MetaTableController @Autowired()
(
    metaTableService: MetaTableService
) {

    @RequestMapping(value = Array("/"), method = Array(RequestMethod.POST))
    @ResponseBody
    def save(@ModelAttribute metaTable: MetaTable) = {
        metaTableService.save(metaTable)
        ResultVOUtil.success
    }

    @RequestMapping(value = Array("/"), method = Array(RequestMethod.GET))
    @ResponseBody
    def query() = {
        ResultVOUtil.success(metaTableService.query())
    }
}

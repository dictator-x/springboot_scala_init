package com.bigmeta.bigmeta.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.beans.factory.annotation.Autowired;

import com.bigmeta.bigmeta.service.MetaDatabaseService;
import com.bigmeta.bigmeta.domain.MetaDatabase;
import com.bigmeta.bigmeta.utils.ResultVO;
import com.bigmeta.bigmeta.utils.ResultVOUtil;

@RestController
@RequestMapping("/meta/database")
public class MetaDatabaseController {

	@Autowired
	private MetaDatabaseService metaDatabaseService;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResultVO save(@ModelAttribute MetaDatabase metaDatabase) {
		metaDatabaseService.save(metaDatabase);
		return ResultVOUtil.success();
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResultVO query() {
		return ResultVOUtil.success(metaDatabaseService.query());
	}
}

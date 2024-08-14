package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.BitLyRequest;
import com.demo.service.BitlyService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class BitLyRestController {
	
	@Autowired
	BitlyService bitlyService;
	
	@PostMapping("/processBitly")
	public String processBitLy(@RequestBody BitLyRequest bitlyRequest) {
		String shortURL=bitlyService.getShortURL(bitlyRequest.getLongURL());
		return shortURL;
	}
}

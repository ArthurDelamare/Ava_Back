package com.ibm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SummaryController {

	@GetMapping("api/summary")
	public String getSummary() {
		return "Ava is greeting you!";
	}
}

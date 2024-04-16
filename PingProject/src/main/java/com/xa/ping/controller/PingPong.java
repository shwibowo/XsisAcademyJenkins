package com.xa.ping.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class PingPong {

	@GetMapping("ping")
	@ResponseBody
	public Map<String, String> pong() {
		Map<String, String> map = new HashMap<>();
		map.put("status", "200");
		map.put("message", "Pong!");
		return map;
	}
	
	@GetMapping("hello/{name}")
	@ResponseBody
	public Map<String, String> hello(@PathVariable("name") String name) {
		Map<String, String> map = new HashMap<>();
		map.put("status", "200");
		String message = "Hello " + name;
		map.put("message", message);
		return map;
	}

	@GetMapping("calc/{A}/{B}")
	@ResponseBody
	public Map<String, String> calc(@PathVariable("A") float A, @PathVariable("B") float B) {
		Map<String, String> map = new HashMap<>();
		map.put("status", "200");
		String str = "A + B = " + (A+B) + "\n";
		str += "A - B = " + (A-B) + "\n";
		String message = str;
		map.put("message", message);
		return map;
	}
}

package me.axl.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import me.axl.monitor.FileInfo;
import me.axl.monitor.MemInfo;

@RestController
public class HelloController {

	@GetMapping("/say/{firstName}/{lastName}")
	@ResponseBody
	public String handler(@PathVariable String firstName, @PathVariable String lastName) {
		return "Hello " + firstName + " " + lastName + "!\n";
	}

	@GetMapping("/getmem")
	@ResponseBody
	public MemInfo getMem() {
		return new MemInfo();
	}

	@GetMapping("/getfile")
	@ResponseBody
	public FileInfo getFile() {
		return new FileInfo();
	}

	@RequestMapping("/")
	public String index() {
		return "Wow man! You got it working!";
	}

}

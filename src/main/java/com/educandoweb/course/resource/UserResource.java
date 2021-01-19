package com.educandoweb.course.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		List<User> list = new ArrayList<>();
		User lanna = new User("1", "Lanna Beatriz", "lanna@gmail.com");
		User laura = new User("2", "Laura Pontes", "laura@gmail.com");
		list.addAll(Arrays.asList(lanna, laura));
		return ResponseEntity.ok().body(list);
	}
}

package com.blogapp.blogapp.service;

import com.blogapp.blogapp.dto.LoginDto;
import com.blogapp.blogapp.dto.PersonDto;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface PersonService {
    ResponseEntity<PersonDto> creatPerson(PersonDto personDto);
    ResponseEntity<PersonDto> editPerson(Long personId,PersonDto personDto);
    ResponseEntity<List<PersonDto>> getAllPerson(HttpSession session);
    ResponseEntity<PersonDto> getPersonById(Long personId, HttpSession session);
    ResponseEntity<String> loginPerson(LoginDto loginDto, HttpSession session);
    ResponseEntity<String>logOut(HttpSession session);
}

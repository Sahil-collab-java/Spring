package com.ContactAppRestApiProducer.Controller;

import com.ContactAppRestApiProducer.Model.Contact;
import com.ContactAppRestApiProducer.Service.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactServiceImpl contactService;

    @PostMapping("/saveContact")
    public ResponseEntity<String> createContact(@RequestBody Contact contact){
        String status =  contactService.upsert(contact);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }

    @GetMapping("/getAllContact")
    public ResponseEntity<List<Contact>> getAllContact(){
       List<Contact> contacts = contactService.getAllCourses();
       return new ResponseEntity<>(contacts,HttpStatus.OK);
    }


    @GetMapping("/getById/{cid}")
    public ResponseEntity<Contact> getById(@PathVariable("cid") Integer cid){
       Contact contact =  contactService.getById(cid);
       return new ResponseEntity<>(contact,HttpStatus.OK);
    }

    @DeleteMapping("/deleteById/{cid}")
    public ResponseEntity<String> deleteById(@PathVariable("cid") Integer cid){
        String contact =  contactService.deleteById(cid);
        return new ResponseEntity<>(contact,HttpStatus.OK   );
    }


    @PutMapping("/updateContact")
    public ResponseEntity<String> update(@RequestBody Contact contact){
        String upsert =  contactService.upsert(contact);
        return new ResponseEntity<>(upsert,HttpStatus.OK);
    }







}

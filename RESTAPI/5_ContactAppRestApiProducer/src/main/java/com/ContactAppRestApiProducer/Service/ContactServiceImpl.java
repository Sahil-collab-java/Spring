package com.ContactAppRestApiProducer.Service;

import com.ContactAppRestApiProducer.Model.Contact;
import com.ContactAppRestApiProducer.Repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactRepo contactRepo;


    @Override
    public String upsert(Contact contact) {

        contactRepo.save(contact);
        return "success";
    }

    @Override
    public Contact getById(Integer cid) {
        Optional<Contact> contact = contactRepo.findById(cid);
        if (contact.isPresent()){
            return contact.get();
        }
        return null;
    }

    @Override
    public List<Contact> getAllCourses() {
        return contactRepo.findAll();
    }

    @Override
    public String deleteById(Integer cid) {
        if (contactRepo.existsById(cid)) {
            contactRepo.deleteById(cid);
            return "Record Deleted Successfully";
        } else {
            return "No Record Found";
        }
    }

}

package com.ContactAppRestApiProducer.Service;

import com.ContactAppRestApiProducer.Model.Contact;

import java.util.List;

public interface ContactService {

    public  String upsert(Contact contact);

    public Contact getById(Integer cid);

    public List<Contact> getAllCourses();

    public String deleteById(Integer cid);
}

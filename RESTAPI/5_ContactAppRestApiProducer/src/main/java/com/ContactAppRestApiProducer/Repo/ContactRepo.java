package com.ContactAppRestApiProducer.Repo;

import com.ContactAppRestApiProducer.Model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact,Integer> {
}

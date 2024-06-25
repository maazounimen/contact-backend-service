package org.m2i.contatct_backend_app.service;

import java.util.List;

import org.m2i.contatct_backend_app.entities.Contact;

public interface ContactService {

	public String saveContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getContactById(Integer contactId);

	public String updateContact(Contact contact);

	public String deleteContactById(Integer contactId);

}

package org.example;

import org.example.annonymous.Contact;
import org.example.annonymous.ContactService;
import org.example.annonymous.FilterCriteria;
import org.example.annonymous.FilterableImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        FilterableImpl filterable = new FilterableImpl();
        List<Integer> integerList = filterable.loadInteger();

        System.out.println(integerList);

        List<Contact> contactList =
                List.of(new Contact("W", "w@gmail.com", 50, Contact.Gender.MALE),
                        new Contact("E", "e@gmail.com", 60, Contact.Gender.FEMALE),
                        new Contact("S", "s@gmail.com", 10, Contact.Gender.MALE),
                        new Contact("N", "n@gmail.com", 23, Contact.Gender.MALE));

        ContactService contactService = new ContactService();

        List<Contact> contactAged18To25
                = contactService.findContacts(contactList,
                new FilterCriteria() {
                    @Override
                    public boolean match(Contact contact) {
                        return 18 <= contact.getAge()
                                && contact.getAge() <= 25
                                && contact.getGender() == Contact.Gender.MALE;
                    }
                });

        System.out.println(contactAged18To25);
    }
}
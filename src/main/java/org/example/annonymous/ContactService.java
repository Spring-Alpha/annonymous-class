package org.example.annonymous;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

    public List<Contact> findContactAgedBetween18And25(List<Contact> contacts) {

        List<Contact> contactAgedBetween18And25 = new ArrayList<>();

        for (Contact contact : contacts) {
            if (18 <= contact.getAge() && contact.getAge() <= 25) {
                contactAgedBetween18And25.add(contact);
            }
        }

        return contactAgedBetween18And25;
    }

    public List<Contact> findMaleContactAgedBetween18And25(List<Contact> contacts) {

        List<Contact> maleAgedBetween18And25 = new ArrayList<>();

        for (Contact contact : contacts) {
            if (18 <= contact.getAge() && contact.getAge() <= 25
                    && contact.getGender() == Contact.Gender.MALE) {

                maleAgedBetween18And25.add(contact);
            }
        }

        return maleAgedBetween18And25;
    }

    public List<Contact> findFemaleContactAgedBetween18And25(List<Contact> contacts) {

        List<Contact> femaleAgedBetween18And25 = new ArrayList<>();

        for (Contact contact : contacts) {
            if (18 <= contact.getAge() && contact.getAge() <= 25
                    && contact.getGender() == Contact.Gender.FEMALE) {

                femaleAgedBetween18And25.add(contact);
            }
        }

        return femaleAgedBetween18And25;
    }

    public List<Contact> findContacts(List<Contact> contacts,
                                      FilterCriteria criteria) {

        List<Contact> matchedContacts = new ArrayList<>();

        for (Contact contact : contacts) {
            if (criteria.match(contact)) {
                matchedContacts.add(contact);
            }
        }

        return matchedContacts;
    }
}

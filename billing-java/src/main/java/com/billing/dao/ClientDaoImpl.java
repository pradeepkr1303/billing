package com.billing.dao;

import java.util.Date;

import org.hibernate.Session;

import com.billing.entity.Client;
import com.billing.util.HibernateUtil;

public class ClientDaoImpl {
	
	public int saveClient(String name, String address, String gstin, String phoneNumber) {
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        session.beginTransaction();
        
        Client client = new Client();
        
        client.setClientName(name);
        client.setClientAddress(address);
        client.setClientGstin(gstin);
        client.setClientPhoneNumber(phoneNumber);
        client.setClientCreatedDate(new Date());
 
        int status = (Integer) session.save(client);
        session.getTransaction().commit();
        
        session.close();
        
        return status;
    }
}

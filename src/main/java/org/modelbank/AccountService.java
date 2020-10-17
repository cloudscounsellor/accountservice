package org.modelbank;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

@Component
public class AccountService {

	   @Autowired
	    MongoClient mongoClient;

	    public List<Account> list() {
	        List<Account> list = new ArrayList<>();
	        MongoCursor<Document> cursor = getCollection().find().iterator();

	        try {
	            while (cursor.hasNext()) {
	                Document document = cursor.next();
	                Account account = new Account();
	                account.setCustomerID(document.getString("customerID"));
	                account.setAccountType(document.getString("accountType"));
	                list.add(account);
	            }
	        } finally {
	            cursor.close();
	        }
	        return list;
	    }

	    public void add(Account account) {
	        Document document = new Document()
	                .append("customerID", account.getCustomerID())
	                .append("accountType", account.getAccountType());
	        getCollection().insertOne(document);
	    }

	    private MongoCollection getCollection() {
	        return mongoClient.getDatabase("AccountsDB").getCollection("tblAccounts");
	    }
	    
	    
	    

	    public List<Account> findBycustomerID(String customerID) {
	        List<Account> list = new ArrayList<>();
	        MongoCursor<Document> cursor = getCollection().find().iterator();

	        try {
	            while (cursor.hasNext()) {
	                Document document = cursor.next();
	                Account account = new Account();
	                if(document.getString("customerID").equals(customerID))
	                {
	                	account.setCustomerID(document.getString("customerID"));
	                	account.setAccountType(document.getString("accountType"));
	                	list.add(account);
	                }
	            }
	        } finally {
	            cursor.close();
	        }
	        return list;
	    }
}

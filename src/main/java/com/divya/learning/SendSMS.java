package com.divya.learning;
import com.twilio.*;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SendSMS {
    public static final String ACCOUNT_SID = System.getenv("AC6e4e45b91d23f171d2dad839675303af");
    public static final String AUTH_TOKEN = System.getenv("0c78ba409918da25cd3da3bee57a88a5");

    public static void main(String[] args){
        Twilio.init("AC6e4e45b91d23f171d2dad839675303af", "0c78ba409918da25cd3da3bee57a88a5");
        Message msg = Message.creator(
                new PhoneNumber("+919900172839"),
                new PhoneNumber("+917204030438"),
                "All the best for you new try"
        ).create();
        System.out.println("did it work?");
    }
}

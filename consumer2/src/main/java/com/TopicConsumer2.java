package com;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.IOException;

public class TopicConsumer2 {

    public static void main(String[] args) throws JMSException, IOException {

        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://192.168.25.142:61616");

        Connection connection = connectionFactory.createConnection();

        connection.start();

        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        Topic topic = session.createTopic("test-topic");

        MessageConsumer consumer = session.createConsumer(topic);

        consumer.setMessageListener(new MessageListener() {
            @Override
            public void onMessage(Message message) {
                TextMessage textMessage = (TextMessage)message;
                try{
                    System.out.println("consumer2"+ textMessage.getText());
                }catch(JMSException e){
                    e.printStackTrace();
                }

            }
        });

        System.in.read();

        consumer.close();
        session.close();
        connection.close();


    }

}

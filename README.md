# eureka-demo
Demo for Eureka Service Discovery
When all services are registered with Eureka like:

🟢 user-service
🟢 order-service
🟢 payment-service

Then any service can call another service just by using its name, without needing to remember IP addresses or port numbers.

For example, if order-service wants to call payment-service, it can make a REST call like:

perl
Copy
Edit
http://payment-service/payment/do
Eureka will automatically resolve the actual IP and port of payment-service.

This is called Service Discovery — it helps in dynamic service-to-service communication in microservice architecture.

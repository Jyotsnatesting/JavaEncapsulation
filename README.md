# JavaEncapsulation

Encapsulation: in Java is a mechanism of wrapping up the data (variables) and behavior (methods) together in one single unit (Class).

In Encapsulation, the variables of a class will be hidden from the other classes, and can only be accessed through the methods of the current class in which they are declared.

As in encapsulation, the data in a class is hidden from another class, so it is also known as data-hiding.

Data Encapsulation: 
1. Define the variables as private in a class. 
2. We can not access the class variables outside the class, even after using the class object.
3. That means we are hiding the data, as we are not able to access them.
4. when we hide the (data)varaiables in a class, we can access that data using the class object when we write getters and setters.
5. Getters and setters are the methods, Setters are used to write data to the variables and Getters are used to read the data from variables.

===============================================================
In this code, i have written 2 Java classes about the simple Bank application.
Used getters and Setters for data encapsulation.
  a. AccountDetails.java --> It has variables Bank account number, Customer name, Phone number,EmailID, CUrrent Balance and option to           choose customer want to Deposit/WithDrawl and Deposit/WithDrawl Amount. We used getters and setters to access these variables in           BankaccountDemo.java
  b. BankaccountDemo.java --> Take the input and set the variables in AccountDetails.java by calling setter methods
     and get the data  modified data using getters and printing them.
   

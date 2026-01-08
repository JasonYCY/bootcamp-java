package com.bootcamp.lombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Account {
  // inner enum
  public enum Currency {
    HKD,
    USD,
    CNY;
  }

  public enum Type {
    CURRENT,
    SAVING;
  }

  // attribute
  private double balance;
  private Currency currency;
  private Type type;



  // main method
  public static void main(String[] args) {
    // Test Case
    Account john = new Account(0, Currency.USD, Type.SAVING);

    // Expected Value
    double expectedBalance = 0;
    Currency expectedCurrency = Currency.USD;
    Type expectedType = Type.SAVING;
    
    // Actual Value
    double actualBalance = john.getBalance();
    Currency actualCurrency = john.getCurrency();
    Type actualType = john.getType();

    // Test Constructor
    System.out.println(expectedBalance == actualBalance);
    System.out.println(expectedCurrency == actualCurrency);
    System.out.println(expectedType == actualType);

    // Test Setter
    john.setBalance(100.0);
    System.out.println(100.0 == john.getBalance());
    System.out.println(Currency.USD == john.getCurrency());
    System.out.println(Type.SAVING == john.getType());
    
    john.setCurrency(Currency.CNY);
    System.out.println(100.0 == john.getBalance());
    System.out.println(Currency.CNY == john.getCurrency());
    System.out.println(Type.SAVING == john.getType());

    john.setType(Type.CURRENT);
    System.out.println(100.0 == john.getBalance());
    System.out.println(Currency.CNY == john.getCurrency());
    System.out.println(Type.CURRENT == john.getType());

    // Test Equals
    Account peter = new Account(100.0, Currency.CNY, Type.CURRENT);
    System.out.println(john.equals(peter));
    System.out.println(john.hashCode() == peter.hashCode());







  }
}

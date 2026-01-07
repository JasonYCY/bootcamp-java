public record AccountEntry(Action action, Currency currency, double amount) {
  // inner enum definition
  public enum Action {
    DEBIT,
    CREDIT;
  }
  public enum Currency {
    HKD,
    USD,
    CNY;
  }

  /*
   * Record auto generates these boilerplate codes for you
   */
  // // attribute
  // // Action action, Currency currency, double amount
  // private Action action;
  // private Currency currency;
  // private double amount;

  // // constructor
  // public AccountEntry(Action action, Currency currency, double amount) {
  //   this.action = action;
  //   this.currency = currency;
  //   this.amount = amount;
  // }

  public AccountEntry {
    if (amount < 0) throw new IllegalArgumentException("amount must be positive!");
  }

  // // getter
  // public Action getAction() {
  //   return action;
  // }

  // public Currency getCurrency() {
  //   return currency;
  // }

  // public double getAmount() {
  //   return amount;
  // }


  // main method
  public static void main(String[] args) {
    AccountEntry entry = new AccountEntry(Action.CREDIT, Currency.USD, 100);
    System.out.println(entry);
    System.out.println(entry.action());
    System.out.println(entry.currency());
    System.out.println(entry.amount());





  }
}
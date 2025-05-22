import java.util.Scanner;

class Bank{
    private final int accountNumber;
    private String holderName;
    private double balance;

    public Bank(String _name, int _accNumber){
        if(_name.isEmpty()){ throw new IllegalArgumentException("Name cant be empty"); }
        if(_accNumber < 0 ){ throw new IllegalArgumentException("invalid account number"); }

        this.holderName = _name;
        this.accountNumber = _accNumber;
    }

    public void setHolderName(String _name){
        if(_name.trim().isEmpty()){ throw new IllegalArgumentException("Name cant be empty"); }
        this.holderName = _name.trim();
    } private String getHolderName(){
        return this.holderName;
    }

    private int getAccountNumber(){
        return this.accountNumber;
    }

    public void deposit(double _deposit){
        this.balance += _deposit;
    }

    public void withdraw(double _withdraw){
        if(this.balance < _withdraw ){ throw new IllegalArgumentException("Insufficient balance"); }
        this.balance -= _withdraw;
    }

    public double getBalance(){
        return this.balance;
    }

    public void getDetails(){
        System.out.println("Account Holder Name: "+ getHolderName());
        System.out.println("Account number: "+ getAccountNumber());
        System.out.println("Current Balance: "+ getBalance());
    }

}

class BankManagement{
    private final Bank bank;

    public BankManagement(Bank _bank){
        this.bank = _bank;
    }

    public void setName(String _name){
        bank.setHolderName(_name);
        System.out.println("changed the name");
    }

    public void deposit(double _deposit){
        if(_deposit < 0){throw new IllegalArgumentException("deposits must be more than 0"); }
        bank.deposit(_deposit);
        System.out.print("\nDeposit successful");
    }

    public void withdraw(double _withdraw){
        if(_withdraw < 0){throw new IllegalArgumentException("withdraw must be more than 0"); }
        bank.withdraw(_withdraw);
        System.out.print("\nwithdrawal successful");
    }

    public double getBalance(){
        return bank.getBalance();
    }

    public void getDetails(){
        bank.getDetails();
    }
}

class Main{

    public static void main (String... args){
       try(Scanner sc = new Scanner(System.in)){

           System.out.print("Name: ");
           String name = sc.nextLine().trim();

           System.out.print("Account number: ");
           int accNumber = sc.nextInt();
           sc.nextLine();

           Bank personOne = new Bank(name,accNumber);
           BankManagement manager = new BankManagement(personOne);

           while(true){
               System.out.println("\nChoose an Action:");
               System.out.println("1. Change the name\n2. Deposit\n3. Withdraw\n4. Check Balance\n5. Details\n6. Exit");
               System.out.print("Enter: ");

               if(sc.hasNextInt()){
               int choice = sc.nextInt();
               sc.nextLine();

                   switch(choice){
                       case 1:
                           System.out.print("Enter your new Name: ");
                           String newName = sc.nextLine();
                           manager.setName(newName);
                           break;

                       case 2:
                           System.out.print("Enter your deposit money: ");
                           double depositMoney = sc.nextDouble();
                           sc.nextLine();
                           manager.deposit(depositMoney);
                           break;

                       case 3:
                           System.out.print("Enter your withdraw money: ");
                           double withdrawMoney = sc.nextDouble();
                           sc.nextLine();
                           manager.withdraw(withdrawMoney);
                           break;

                       case 4:
                           System.out.print("balance: "+manager.getBalance());
                           break;

                       case 5:
                           manager.getDetails();
                           break;

                       case 6:
                           return;

                       default:
                           System.out.println("error!: invalid input");
                   }
               }else{
                   System.out.println("invalid");
                   sc.next();
               }
           }

        }catch(Exception e){
           System.out.println("Error: "+e.getMessage());
        }
    }
}
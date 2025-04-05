class accountDetails {
    String name;
    String email;
    String password;
    int age;
    String address;
    String phoneNumber;
    public accountDetails(){}
    public accountDetails(String name, String email, String password, int age, String address, String phoneNumber){
        this.name = name;
        this.email= email;
        this.password = password;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void displayDetails(){
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Holder Email: " + email);
        System.out.println("Account Holder Age: " + age);
        System.out.println("Account Holder Address: " + address);
        System.out.println("Account Holder Phone Number: " + phoneNumber);
    }
}

class Bank extends accountDetails{
    String branchName;
    String branchAddress;
    String branchPhoneNumber;
    public Bank(){}
    public Bank(String name, String email, String password, int age, String address, String phoneNumber, String branchName, String branchAddress, String branchPhoneNumber){
        super(name, email, password, age, address, phoneNumber);
        this.branchName = branchName;
        this.branchAddress = branchAddress;
        this.branchPhoneNumber = branchPhoneNumber;
    }
    
    public void displayBranchDetails(){
        System.out.println("Branch Name: " + branchName);
        System.out.println("Branch Address: " + branchAddress);
        System.out.println("Branch Phone Number: " + branchPhoneNumber);
    }
}

public class account{
    public static void main(String args[])
    {
        accountDetails account1 = new accountDetails("Nid","abc@gmail.com","123456", 25, "Greater Noida", "8967888999");
        System.out.println("Account Holder Name: " + account1.name);

        Bank BOB = new Bank();
        BOB.branchName = "Bank of Baroda";
        BOB.branchAddress = "Alpha Commercial belt, Greater Noida";
        BOB.branchPhoneNumber = "0120-1234567";
        BOB.displayBranchDetails();
    
    }
}
class BankAccount{
        int AccountNumber;
        private double balance;
        private String ownerName;

        BankAccount(){}

        void create(int Acc,String name){
                AccountNumber = Acc;
                ownerName = name;
                balance = 0;
        }

        void Add(double bal){
                balance += bal;
        }

        void Subtract(double bal){
                if(bal > balance){
                        double val = balance;
                        balance = 0;
                }
                else{
                        balance -= bal;
                }
        }

        void display(){
                System.out.println("AccountNumber = " + AccountNumber);
                System.out.println("Name = " + ownerName);
                System.out.println("Balance = " + balance);
                System.out.println("---------------------------");
        }

}

class AccountManager{
        private int n;
        private BankAccount Arr[];
        private int nums[] = {11200,11201,11202,11203,11204,11205,11206};
        private String alpha[] = {"Varun","Sabuj","Rupayan","Saptarshi","Virat","Rohit","Messi"};

        AccountManager(int size){
                n = size;
                Arr = new BankAccount[n];
        }


        void create(){
                for(int i = 0;i < n;i++){
                        Arr[i] = new BankAccount();
                        Arr[i].create(nums[i],alpha[i]);

                }
        }

        void delete(){
                for(int i = 0;i < n -2;i++) Arr[i] = null;
        }

        void deposit(){
                for(int i = 0;i < n;i++){
                        Arr[i].Add((double) i * 100 + 1000);
                }
        }

        void withdraw(){
                for(int i = 0;i < n;i++){
                        Arr[i].Subtract((double) i * 40 + 251);
                }
        }

        void display(){
                for(int i = 0;i < n;i++){
                        if(Arr[i] != null) Arr[i].display();
                }
        }

} 

class Bank{
        public static void main(String args[]){
                AccountManager Accounts = new AccountManager(5);
                Accounts.create();
                Accounts.deposit();
                Accounts.withdraw();
                Accounts.display();
                Accounts.delete();
                System.out.println("===========================");
                System.out.println("After Deletion :-");
                System.out.println("===========================");
                Accounts.display();
        }
}

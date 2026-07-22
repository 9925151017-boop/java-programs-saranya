public class met1 {
        static void checkBalance(double balance, double withdrawlAmount){
            if(withdrawlAmount <= balace){
                System.out.println("withdrawl successfully");
                balance = balance - withdrawlAmount;
                System.out.println("remaining balance: " +balance);
            }else{
                System.out.println("insufficiant balance");
            }
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter balance: ");
            double balance = sc.nextDouble();
            System.out.println("Enter withdrawl Amount: ");
            double withdrawlAmount = sc.nextDouble();
            checkBalance(balance,withdrawlAmount);
        }
    }
    
}

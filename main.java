package project;

import java.util.Scanner;

public class main {

    public static void main(String[]args)
    {
        Admin ad;
        User us;
        Inventory in;
        Logs log= new Logs();

        String commands="";
        int choice;

        do {
            System.out.println("What operation do you want to do ");
            System.out.println("1.To Login as a user .\n 2. To register as a user.\n 3.To login as an Admin.\n");

            Scanner sc = new Scanner(System.in);
            choice=sc.nextInt();

            if (choice == 1)
            {
                us= new User();
                us.login(log);

            }
            else if(choice==2)
            {
                us= new User();
                us.register(log);
            }
            else if(choice == 3)
            {
                ad= new Admin();
                ad.login(log);
            }


        }while(commands=="out");

    }
}

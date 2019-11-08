import java.io.*;
/**
 * 
 * The topic was.
 * 
 * Create a java programme as a project work to generate bill on the basis of product purchased.
 * 
 * This is the class where you will see a shop.
 * 
 * The inputs to be given should be specific and no messing up with input data types.
 * 
 * To end the programme just cancel the confirmation.
 * 
 * There will be seperate bill printed for every new purchase.
 * 
 * @author (Prajyot Chandrashekhar Bhamare) 
 * 
 * @version (25-11-2016)
 * 
 */
public class Shop
{
    public static void main(String []args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        graphicsa li = new graphicsa();    // having all the sub classes in the main class
        roundoff r = new roundoff();
        bill_print b = new bill_print();
        String rep = "";
        String prdty;
        String lap;
        String desk;    //initilizing every string to be used in the programme
        String name;
        String brand = "";
        String conf;
        String mob;
        char ch = 'a';      //initilizing every character to be used in the programme
        char comp = 'a';
        int budget = 0;
        int error = 0;
        int f = 0;    //initilizing every intiger to be used in the programme
        int dp = 0;
        int fp = 0;
        int pr = 0;
        double dis = 1.0;    //initilizing every double value to be used in the programme
        double price = 1.0;
        do //starting with the main menu
        {
            System.out.println("\u000C");     //clearing last run data
            li.line();
            li.line();
            System.out.println("Welcome to prajyot's computer mall \n\nHow can we healp you? \nwe have all the types of pc's you would need");
            System.out.println("if you want you can also use our techinical support system");
            li.line();
            System.out.println("Please Enter your name");
            name = br.readLine();
            li.line();                       //welcome and customer info input
            System.out.println("Enter your mobile number in case we need to contact you");
            mob = br.readLine();
            li.line();
            System.out.println("So now please enter the type of computer you need Desktop or laptop");
            prdty = br.readLine();
            lap = "Laptop";
            desk = "Desktop";
            if(lap.equalsIgnoreCase(prdty))//checking for laptop or desktop
            {
                li.line();
                System.out.println("You choose for a Laptop");
                ch = 'l';
            }
            else if(desk.equalsIgnoreCase(prdty))
            {
                li.line();
                System.out.println("You choose for a Desktop");
                ch = 'd';
            }
            else
            {
                pr = 100;
            }
            if(pr != 100)//to skip the whole process if pc type is entered wrong
            {
                System.out.println("Enter your budget in INR \nRange is 30000 to 100000 INR");
                budget = Integer.parseInt(br.readLine());
                budget = r.main(budget);
                switch(ch)//start to check brand
                {
                    case 'l':
                    System.out.println("We have 3 brands of laptops you can select them according to your need \nFor good looks and performance you can choose HP");
                    System.out.println("For everything balanced you can choose DELL \nFor massive processing speed choose IBM");
                    System.out.println("Enter your choice HP , DELL , IBM");
                    li.line(); 
                    brand = br.readLine();
                    budget = r.main(budget);
                    li.line();
                    if(brand.equalsIgnoreCase("HP"))
                    {
                        System.out.println("you choose for " + brand + " laptop");
                        comp = 'H';
                    }
                    else if(brand.equalsIgnoreCase("DELL"))
                    {
                        System.out.println("you choose for " + brand + " laptop");
                        comp = 'D';
                    }
                    else if(brand.equalsIgnoreCase("IBM"))
                    {
                        System.out.println("you choose for " + brand + " laptop");
                        comp = 'I';
                    }
                    else
                    {
                        error++;
                        break;
                    }
                    switch(comp)
                    {
                        case 'H':
                        if(budget > 30000)
                        {
                            price = budget*0.9;
                            dp = 10;
                            dis = budget * 0.1;
                        }
                        else if(budget > 30000 && budget <= 50000 && budget < 75000)
                        {
                            price = budget*0.87;
                            dp = 13;
                            dis = budget * 0.13;
                        }
                        else if(budget > 30000 && budget <= 50000 && budget < 75000 && budget >= 75000 )
                        {
                            budget = 100000;
                            price = budget*0.83;
                            dp = 17;
                            dis = budget * 0.17;
                        }
                        else
                        {
                            System.out.println("we don't have a computer of your budget");
                            fp = 10;
                            break;
                        }
                        break;
                        case 'D' :
                        if(budget > 30000)
                        {
                            price = budget*0.88;
                            dp = 12;
                            dis = budget * 0.12;
                        }
                        else if(budget > 30000 && budget <= 50000 && budget < 75000)
                        {
                            price = budget*0.85;
                            dp = 15;
                            dis = budget * 0.15;
                        }
                        else if(budget > 30000 && budget <= 50000 && budget < 75000 && budget >= 75000 )
                        {
                            budget = 100000;
                            price = budget*0.81;
                            dp = 19;
                            dis = budget * 0.19;
                        }
                        else
                        {
                            System.out.println("we don't have a computer of your budget");
                            fp = 10;
                            break;
                        }
                        break; 
                        case 'I':
                        if(budget > 30000)
                        {
                            price = budget*0.87;
                            dp = 13;
                            dis = budget * 0.13;
                        }
                        else if(budget > 30000 && budget <= 50000 && budget < 75000)
                        {
                            price = budget*0.85;
                            dp = 15;
                            dis = budget * 0.15;
                        }
                        else if(budget > 30000 && budget <= 50000 && budget < 75000 && budget >= 75000 )
                        {
                            budget = 100000;
                            price = budget*0.88;
                            dp = 12;
                            dis = budget * 0.12;
                        }
                        else
                        {
                            System.out.println("we don't have a computer of your budget");
                            fp = 10;
                            break;
                        }
                        break;
                    }
                    break;
                    case 'd':
                    System.out.println("We have 3 brands of desktops you can select them according to your need \nFor good looks and performance you can choose HP");
                    System.out.println("For everything balanced you can choose DELL \nFor massive processing speed choose IBM");
                    li.line();
                    System.out.println("Enter your choice HP , DELL , IBM");
                    brand = br.readLine();
                    li.line();
                    if(brand.equalsIgnoreCase("HP"))
                    {
                        System.out.println("you choose for " + brand + " desktop");
                        comp = 'H';
                    }
                    else if(brand.equalsIgnoreCase("DELL"))
                    {
                        System.out.println("you choose for " + brand + " desktop");
                        comp = 'D';
                    }
                    else if(brand.equalsIgnoreCase("IBM"))
                    {
                        System.out.println("you choose for " + brand + " desktop");
                        comp = 'I';
                    }
                    else
                    {
                        error++;
                        break;
                    }
                    switch(comp)
                    {
                        case 'H':
                        if(budget > 30000)
                        {
                            price = budget*0.9;
                            dp = 10;
                            dis = budget * 0.1;
                        }
                        else if(budget > 30000 && budget <= 50000 && budget < 75000)
                        {
                            price = budget*0.87;
                            dp = 13;
                            dis = budget * 0.13;
                        }
                        else if(budget > 30000 && budget <= 50000 && budget < 75000 && budget >= 75000 )
                        {
                            budget = 100000;
                            price = budget*0.83;
                            dp = 17;
                            dis = budget * 0.17;
                        }
                        else
                        {
                            System.out.println("we don't have a computer of your budget");
                            fp = 10;
                            break;
                        }
                        break;
                        case 'D' :
                        if(budget > 30000)
                        {
                            price = budget*0.88;
                            dp = 12;
                            dis = budget * 0.12;
                        }
                        else if(budget > 30000 && budget <= 50000 && budget < 75000)
                        {
                            price = budget*0.85;
                            dp = 15;
                            dis = budget * 0.15;
                        }
                        else if(budget > 30000 && budget <= 50000 && budget < 75000 && budget >= 75000 )
                        {
                            budget = 100000;
                            price = budget*0.81;
                            dp = 19;
                            dis = budget * 0.19;
                        }
                        else
                        {
                            System.out.println("we don't have a computer of your budget");
                            fp = 10;
                            break;
                        }
                        break; 
                        case 'I':
                        if(budget > 30000)
                        {
                            price = budget*0.87;
                            dp = 13;
                            dis = budget * 0.13;
                        }
                        else if(budget > 30000 && budget <= 50000 && budget < 75000)
                        {
                            price = budget*0.85;
                            dp = 15;
                            dis = budget * 0.15;
                        }
                        else if(budget > 30000 && budget <= 50000 && budget < 75000 && budget >= 75000 )
                        {
                            budget = 100000;
                            price = budget*0.88;
                            dp = 12;
                            dis = budget * 0.12;
                        }
                        else
                        {
                            System.out.println("we don't have a computer of your budget");
                            fp = 10;
                            break;
                        }
                        break;
                    }
                    break;
                }//brand checking and discount application finished
                System.out.println("Do you confirm your purchase pc of " + budget + " for " + price + " INR.");
                conf = br.readLine();
                
                if(conf.equalsIgnoreCase("yes"))//starting bill procedure
                {
                    f = 2;
                }
                if(f == 2 && (error == 0 || fp != 10))
                {
                    System.out.println("you purchased a item for " + budget + "\nyou will pay "+ price);
                }
                if(error > 0)
                {
                    System.out.println("Sorry the brand is invalid or not available");
                }
            
                System.out.println("Do you want to buy another pc type yes or no");
                rep = br.readLine();
                System.out.println(rep);
            }
            if(rep.equalsIgnoreCase("yes") && (lap.equalsIgnoreCase(prdty) || desk.equalsIgnoreCase(prdty)))//printing bill
            {
                for(int i = 20 ; i >= 0 ; i--)
                {
                    System.out.println("\f");
                    System.out.println("This is the bill of the pc that you purchased last");
                    b.print(name,mob,prdty,brand,budget,price,dp,dis);
                    System.out.print("we will redirect you to the menu again in : ");
                    System.out.print(i +" seconds");
                    Thread.sleep(1000);
                    int count = 1; 
                }
            }
            System.out.println("\f");
        }
        while(rep.equalsIgnoreCase("yes"));
        if(f != 2 || fp == 10)
        {
            System.out.println("Thank you for visiting");
        }
        else if(f == 2 && (lap.equalsIgnoreCase(prdty) || desk.equalsIgnoreCase(prdty)) && fp != 10)//printing bill final
        {
            System.out.println("This is your last bill");
            b.print(name,mob,prdty,brand,budget,price,dp,dis);
        }
        else
        {
            System.out.println("sorry the thing you have entered does not seem to be a computer");
        }
    }
}
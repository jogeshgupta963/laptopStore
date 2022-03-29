import java.util.Scanner;
class project
{
    static Scanner sc=new Scanner(System.in);
    static Scanner ab=new Scanner(System.in);
    static int choice;
    static double sum=0;;
    static String name;
    static long mbno;
    static String mail;
    static int qty[]=new int[6];
    static String a[]=new String[6];
    static int qty2[]=new int[6];
    static String b[]=new String[6];
    static double tp;
    static String s;
    static char ch;
    public static void main(String args[])
    {
        name();
    }

    public static void name()
    {
        System.out.println("*****************************************************************************************************");
        System.out.println("   TTTTTTTTTTTT  EEEEEEE  CCCCCCC HH   HH  NNNNN   N  OOOOOOO  HH   HH  UU      UU  BBBBBBBB");
        System.out.println("       TTTT      EEEEEEE  C       HH   HH  N   N   N  OOOOOOO  HH   HH  UU      UU  BBBBBBBB ");
        System.out.println("        TT       E        C       HH   HH  N   N   N  OO   OO  HH   HH  UU      UU  BB     B ");
        System.out.println("        TT       EEEE     C       HHHHHHH  N   N   N  OO   OO  HHHHHHH  UU      UU  BB     B ");
        System.out.println("        TT       EEEE     C       HHHHHHH  N   N   N  OO   OO  HHHHHHH  UU      UU  BBBBBBB");
        System.out.println("        TT       E        C       HH   HH  N   N   N  OO   OO  HH   HH  UU      UU  BB     B");
        System.out.println("        TT       EEEEEE   C       HH   HH  N   N   N  OOOOOOO  HH   HH  UUUUUUUUUU  BB     B");
        System.out.println("        TT       EEEEEE   CCCCCCC HH   HH  N   NNNNN  OOOOOOO  HH   HH  UUUUUUUUUU  BBBBBBB ");
        System.out.println("*****************************************************************************************************");
        System.out.println("ENTER YOUR NAME");
        name=sc.nextLine();
        System.out.println("ENTER YOUR MOBILE NUMBER");
        mbno=sc.nextLong();
        System.out.println("ENTER YOUR EMAIL ID");
        mail=ab.nextLine();
        System.out.println("   DO YOU WANT TO PROCEED");
        System.out.println("1.CONTINUE");
        System.out.println("2.ENTER DETAILS AGAIN");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            prog();
            break;
            case 2:
            name();
            break;
            default:
            System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            name();
        }
    }

    public static void prog()
    {
        System.out.println("\f********************************************************************************************************************");
        System.out.println("      ww               ww  EEEEEEEEEEEEE   LLL            CCCCCCC   OOOOOO    MMMM       MMMM   EEEEEEEEEEEEE         ");
        System.out.println("      ww               ww  EEEEEEEEEEEEE   LLL           C         O      O   MMM  MM  MM MMM   EEEEEEEEEEEEE         ");
        System.out.println("      ww               ww  E               LLL           C         O      O   MM   MM  MM  MM   E                     ");
        System.out.println("      ww     wwwww     ww  EEEEEE          LLL           C         O      O   MM   MM  MM  MM   EEEEEE                ");
        System.out.println("      ww     wwwww     ww  EEEEEE          LLL           C         O      O   MM   MMMMMM  MM   EEEEEE                ");
        System.out.println("      ww     ww ww     ww  E               LLL           C         O      O   MM           MM   E                     ");
        System.out.println("      ww     ww  ww    ww  EEEEEEEEEEEE    LLLLLLLLLL    C         O      O   MM           MM   EEEEEEEEEEEE          ");         
        System.out.println("      wwwwwwww   wwwwwwww  EEEEEEEEEEEEE   LLLLLLLLLL     CCCCCCCC  OOOOOO    MM           MM   EEEEEEEEEEEEE         ");
        System.out.println("**********************************************************************************************************************");

        while(true)
        {

            System.out.println("1.Laptop");
            System.out.println("2.Desktop");

            System.out.println("3.exit"); 
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            if(choice>=1 && choice<=3)
            {
                break;
            }
            else
            {
                System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
                ab.nextLine();
                prog();
            }
        }

        switch(choice)
        {
            case 1:laptop();
            break;
            case 2:desktop();
            break;
            case 3:exit();
            break;
        }
    }

    public static void exit()
    {
        System.exit(0);
    }

    public static void laptop()
    {
        System.out.println("\fWelcome To Laptop Section");
        System.out.println("1.Lenovo");
        System.out.println("2.DELL");
        System.out.println("3.Apple");
        System.out.println("4.Back");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1: lenovo();
            break;
            case 2: dell();
            break;
            case 3:apple();
            break;
            case 4:
            prog();
            default:
            System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            laptop();
        }
    }

    public static void lenovo()
    {
        System.out.println("\fWelcome to Lenovo Laptops");
        System.out.println("1.Lenovo Ideapad 320E Core i3 6th Gen");
        System.out.println("2.Lenovo Core i7 7th Gen");
        System.out.println("3.Back");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:Lenovoideapad();
            break;
            case 2:lenovocore();
            break;
            case 3:laptop();
            default:
            System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            lenovo();
        }
    }

    public static void Lenovoideapad()
    {
        System.out.println("\fyour choice is Lenovo Ideapad 320E Core i3 6th Gen");
        System.out.println("1.CONTINUE");
        System.out.println("2.BACK");
        int choice=sc.nextInt();
        while(true)
        {
            if(choice==1)
            {
                break;
            }
            else if(choice==2)
            {
                lenovo();
            }
            else
            {
                System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
                ab.nextLine();
                Lenovoideapad();
            }
        }
        System.out.println("\fSpecifications of LENOVO IDEAPAD 320E Core i3 6th Gen are as follows:");
        System.out.println("1.Color-Onyx Black");
        System.out.println("2.RAM-4 GB");
        System.out.println("3.Hard Disk Capacity-1 TB");
        System.out.println("4.Screen Size-35.56 cm (14 inch)");
        System.out.println("5.Screen Resolution-1366 x 768 Pixel");
        System.out.println("6.Screen Type-HD LED Backlit Anti-glare TN Display");
        System.out.println("7.Warranty Summary-1 Year Onsite Warranty");
        System.out.println("8.Domestic Warranty-1 Year");
        System.out.println("9.Operating System-DOS");
        System.out.println("********************************************");
        System.out.println("                PRICE=27,970");
        System.out.println("*******************************************");
        System.out.println("1.CONFIRM PURCHASE");
        System.out.println("2.DO NOT WANT TO BUY THE PRODUCT");
        System.out.println("\n*****************************************");
        System.out.println("  NOTE:18% GST WILL BE ADDED TO YOUR BILL");
        System.out.println("*****************************************");

        choice=sc.nextInt();

        if(choice==1)
        {

            System.out.println("\nHow many products would you like to buy");
            qty[0]=sc.nextInt();
            sum=(27970*qty[0]);
            tp=27970*qty[0]+0.18*qty[0];
            a[0]="Lenovo Ideapad";

            BILL1();
        }
        else if(choice==2)
        {
            prog();
        }

        else
        {
            System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            Lenovoideapad();
        }

    }

    public static void lenovocore()
    {
        System.out.println("\fyour choice is Lenovo Core i7 7th Gen   ");
        System.out.println("1.CONTINUE");
        System.out.println("2.BACK");
        int choice=sc.nextInt();
        while(true)
        {
            if(choice==1)
            {
                break;
            }
            else if(choice==2)
            {
                lenovo();
            }
            else
            {
                System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
                ab.nextLine();
                lenovocore();
            }
        } 
        System.out.println("\fSpecifications of Lenovo Core i7 7th Gen are as follows:");
        System.out.println("1.Color-Grey");
        System.out.println("2.RAM-8 GB");
        System.out.println("3.SSD Capacity-256GB");
        System.out.println("4.Screen Size-33.78 cm (13.3 inch)");
        System.out.println("5.Screen Resolution-1920 x 1080 Pixel");
        System.out.println("6.Screen Type-Full HD LED Backlit IPS Display");
        System.out.println("7.Warranty Summary-1 Year Onsite Warranty");
        System.out.println("8.Domestic Warranty-1 Year");
        System.out.println("9.Operating System-Windows 10");
        System.out.println("********************************************");
        System.out.println("                PRICE=93,082");
        System.out.println("*******************************************");
        System.out.println("1.CONFIRM PURCHASE");
        System.out.println("2.NOT BUY THE PRODUCT");
        System.out.println("\n*****************************************");
        System.out.println("  NOTE:18% GST WILL BE ADDED TO YOUR BILL");
        System.out.println("*****************************************");
        choice=sc.nextInt();

        if(choice==1)
        {
            sum=93082;
            System.out.println("\nHow many products would you like to buy");
            qty[1]=sc.nextInt();
            sum=93082*qty[1];
            tp=93082*qty[1]+0.18*qty[1];
            a[1]="Lenovo Core";
            BILL2();
        }
        else if(choice==2)
        {
            prog();
        }

        else
        {
            System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            lenovocore();
        }

    }

    public static void dell()
    {
        System.out.println("\fWelcome to DELL Laptops");
        System.out.println("1.Dell Vostro 15 3000 Core i5 8th Gen");
        System.out.println("2.Dell Inspiron 15 7000 Core i7 8th Gen");
        System.out.println("3.Back");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:dellvostro();
            break;
            case 2:dellinspiron();
            break;
            case 3:laptop();
            break;
            default:
            System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            dell();
        }

    }

    public static void dellvostro()
    {
        System.out.println("\f Your Choice is DELL VOSTRO 15 3000 CORE i5 8th Gen");
        System.out.println("1.CONTINUE");
        System.out.println("2.BACK");
        int choice=sc.nextInt();
        while(true)
        {
            if(choice==1)
            {
                break;
            }
            else if(choice==2)
            {
                dell();
            }
            else
            {
                System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
                ab.nextLine();
                dellvostro();
            }
        } 
        System.out.println("\fSpecifications of Dell Vostro 15 3000 Core i5 8th Gen are as follows:");
        System.out.println("1.Color-Black");
        System.out.println("2.RAM-8 GB");
        System.out.println("3.HARD DISK Capacity-1TB");
        System.out.println("4.Screen Size-39.62 cm (15.6 inch)");
        System.out.println("5.Screen Resolution-1920 x 1080 Pixel");
        System.out.println("6.Screen Type-Full HD LED Backlit Display");
        System.out.println("7.Warranty Summary-1 Year Onsite Warranty");
        System.out.println("8.Domestic Warranty-1 Year");
        System.out.println("9.Operating System-Windows 10");
        System.out.println("10.Dedicated Graphic Memory Capacity-2 GB");
        System.out.println("********************************************");
        System.out.println("                PRICE=49,807");
        System.out.println("********************************************");
        System.out.println("1.CONFIRM PURCHASE");
        System.out.println("2.NOT BUY THE PRODUCT");
        System.out.println("\n*****************************************");
        System.out.println("  NOTE:18% GST WILL BE ADDED TO YOUR BILL");
        System.out.println("*****************************************");
        choice=sc.nextInt();

        if(choice==1)
        {

            System.out.println("\nHow many products would you like to buy");
            qty[2]=sc.nextInt();
            sum=49807*qty[2];       
            tp=49807*qty[2]+0.18*qty[2];
            a[2]="Dell Vostro";
            BILL3();
        }
        else if(choice==2)
        {
            prog();
        }

        else
        {
            System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            dellvostro();
        }

    }

    public static void dellinspiron()
    {
        System.out.println("\f Your Choice is DELL INSPIRON 15 7000 Core i7 8th Gen");
        System.out.println("1.CONTINUE");
        System.out.println("2.BACK");
        int choice=sc.nextInt();
        while(true)
        {
            if(choice==1)
            {
                break;
            }
            else if(choice==2)
            {
                dell();
            }
            else
            {
                System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
                ab.nextLine();
                dellinspiron();
            }
        } 
        System.out.println("\fSpecifications of Dell Inspiron 15 7000 Core i7 8th Gen are as follows:");
        System.out.println("1.Color-Platinum Silver");
        System.out.println("2.RAM-8 GB");
        System.out.println("3.HARD DISK Capacity-1TB");
        System.out.println("4.Screen Size-39.62 cm (15.6 inch)");
        System.out.println("5.Screen Resolution-1920 x 1080 Pixel");
        System.out.println("6.Screen Type-Full HD LED Backlit IPS Display");
        System.out.println("7.Warranty Summary-1 Year Onsite Warranty");
        System.out.println("8.Domestic Warranty-1 Year");
        System.out.println("9.Operating System-Windows 10");
        System.out.println("10.Dedicated Graphic Memory Capacity-4 GB");
        System.out.println("11.SSD Capacity-256 GB");
        System.out.println("********************************************");
        System.out.println("                PRICE=92,382");
        System.out.println("********************************************");
        System.out.println("1.CONFIRMING PURCHASE");
        System.out.println("2.NOT TO BUY THE PRODUCT");
        System.out.println("\n*****************************************");
        System.out.println("  NOTE:18% GST WILL BE ADDED TO YOUR BILL");
        System.out.println("*****************************************");
        choice=sc.nextInt();

        if(choice==1)
        {
            System.out.println("\nHow many products would you like to buy");
            qty[3]=sc.nextInt();
            sum=92382*qty[3];     
            tp=92382*qty[3]+0.18*qty[3];
            a[3]="Dell Inspiron";
            BILL4();
        }
        else if(choice==2)
        {
            prog();
        }

        else
        {
            System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            dellinspiron();   
        }

    }

    public static void apple()
    {
        System.out.println("\fWelcome to APPLE Laptops");
        System.out.println("1.Apple Macbook Pro Core i7");
        System.out.println("2.Apple Macbook Air Core i5 5th Gen");
        System.out.println("3.Back");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:apple1();
            break;
            case 2:apple2();
            break;
            case 3:laptop();
            break;
            default:
            System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            apple();
        }
    }

    public static void apple1()
    {
        System.out.println("\fYour choice is APPLE MACBBOK PRO CODEi7");
        System.out.println("1.CONTINUE");
        System.out.println("2.BACK");
        choice=sc.nextInt();
        while(true)
        {
            if(choice==1)
            {
                break;
            }
            else if(choice==2)
            {
                apple();
            }
            else 
            {
                System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
                ab.nextLine();
                apple();
            }
        }
        System.out.println("\fSpecifications of APPLE MACBOOK PRO CORE i7 are as follows:");
        System.out.println("1.Color-Space Grey");
        System.out.println("2.RAM-16 GB");
        System.out.println("3.Screen Size-38.1 cm (15 inch)");
        System.out.println("4.Screen Resolution-2880 x 1800 Pixel");
        System.out.println("5.Keyboard-Full Size Backlit Keyboard");
        System.out.println("6.Warranty Summary-1 Year ");
        System.out.println("7.Domestic Warranty-1 Year");
        System.out.println("8.Operating System- Mac Os Sierra");
        System.out.println("9.Dedicated Graphic Memory Capacity-2 GB");
        System.out.println("10.SSD Capacity-256 GB");
        System.out.println("********************************************");
        System.out.println("                PRICE=2,05,900");
        System.out.println("********************************************");
        System.out.println("1.CONFIRM PURCHASE");
        System.out.println("2.NOT BUY THE PRODUCT");
        System.out.println("\n*****************************************");
        System.out.println("  NOTE:18% GST WILL BE ADDED TO YOUR BILL");
        System.out.println("*****************************************");
        choice=sc.nextInt();

        if(choice==1)
        {
            System.out.println("\nHow many products would you like to buy");
            qty[4]=sc.nextInt();
            sum=205900*qty[4];
            tp=205900*qty[4]+0.18*qty[4];
            a[4]="APPLE MACBOOK PRO CORE";
            BILL5();
        }
        else if(choice==2)
        {
            prog();
        }

        else
        {
            System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            apple1();

        }

    }

    public static void apple2()
    {
        System.out.println("\fYour choice is APPLE MACBOOK AIR CORE i5 5th Gen");
        System.out.println("1.CONTINUE");
        System.out.println("2.BACK");
        choice=sc.nextInt();
        while(true)
        {
            if(choice==1)
            {
                break;
            }
            else if(choice==2)
            {
                apple();
            }
            else
            {
                System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
                ab.nextLine();
                apple2();
            }
        }
        System.out.println("\fSpecifications of APPLE MACBOOK AIR CORE i5 5th Gen are as follows:");
        System.out.println("1.Color-Silver");
        System.out.println("2.RAM-8 GB");
        System.out.println("3.Screen Size-33.78 cm (13.3 inch)");
        System.out.println("4.Screen Resolution-1440 x 900 Pixel");
        System.out.println("5.Keyboard-Full Size Backlit Keyboard");
        System.out.println("6.Warranty Summary-1 Year ");
        System.out.println("7.Domestic Warranty-1 Year");
        System.out.println("8.Operating System- Mac Os Sierra");
        System.out.println("9.Dedicated Graphic Memory Capacity-2 GB");
        System.out.println("10.SSD Capacity-256 GB");
        System.out.println("********************************************");
        System.out.println("                PRICE=75,990");
        System.out.println("********************************************");
        System.out.println("1.CONFIRM PURCHASE");
        System.out.println("2.NOT TO BUY THE PRODUCT");
        System.out.println("\n*****************************************");
        System.out.println("  NOTE:18% GST WILL BE ADDED TO YOUR BILL");
        System.out.println("*****************************************");
        choice=sc.nextInt();

        if(choice==1)
        {
            System.out.println("\nHow many products would you like to buy");
            qty[5]=sc.nextInt();
            sum=75990*qty[5];   
            tp=759900*qty[5]+0.18*qty[5];
            a[5]="APPLE MACBOOK AIR CORE";
            BILL6();
        }
        else if(choice==2)
        {
            prog();
        }

        else
        {
            System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            apple2();
        }

    }

    public static void desktop()
    {
        System.out.println("\fWelcome To Desktop Section");
        System.out.println("1.DELL ");
        System.out.println("2.HP");
        System.out.println("3.Apple");
        System.out.println("4.Back");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1: delldesktop();
            break;
            case 2: HP();
            break;
            case 3:appledesktop();
            break;
            case 4:
            prog();
            default:
            System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            desktop();
        }
    }

    public static void delldesktop()
    {
        System.out.println("\fWelcome to DELL DESKTOPS");
        System.out.println("1.Dell Core i3 (6th Gen)");
        System.out.println("2.Dell Pentium Quad Core");
        System.out.println("3.Back");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1: dellcore();
            break;
            case 2:dellpentium();
            break;
            case 3:desktop();
            break;   
        }
    }

    public static void dellcore()
    {
        System.out.println("\fYour choice is DELL CORE i3 (6th Gen)");
        System.out.println("1.CONTINUE");
        System.out.println("2.BACK");
        choice=sc.nextInt();
        while(true)
        {
            if(choice==1)
            {
                break;
            }
            else if(choice==2)
            {
                delldesktop();
            }
            else
            {
                System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
                ab.nextLine();
                dellcore();
            }
        }
        System.out.println("\fSpecifications of DELL CORE i3 (6th Gen) are as follows:");
        System.out.println("1.Colour-Black");
        System.out.println("2.Cache Memory-3 MB");
        System.out.println("3.Processor Brand-Intel");
        System.out.println("4.Operating System-Windows 10 Home");
        System.out.println("5.Display Size-23.8 inch");
        System.out.println("6.Integrated Graphic Processor-Intel HD Graphics 520");
        System.out.println("7.USB-4 x USB Ports");
        System.out.println("8.Hard Drive-1 TB");
        System.out.println("9.Processor Frequency-2.3 GHz");
        System.out.println("10.Input Devices-Wireless Mouse,Keyboard");
        System.out.println("********************************************");
        System.out.println("                PRICE=52,000");
        System.out.println("********************************************");
        System.out.println("1.CONFIRM PURCHASE");
        System.out.println("2.NOT TO BUY THE PRODUCT");
        System.out.println("\n*****************************************");
        System.out.println("  NOTE:18% GST WILL BE ADDED TO YOUR BILL");
        System.out.println("*****************************************");
        choice=sc.nextInt();

        if(choice==1)
        {
            System.out.println("\nHow many products would you like to buy");
            qty2[0]=sc.nextInt();
            sum=52000*qty2[0];    
            tp=52000*qty2[0]+0.18*qty2[0];
            b[0]="DELL CORE";
            BILL7();
        }
        else if(choice==2)
        {
            prog();
        }

        else
        {
            System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            dellcore();
        }

    }

    public static void dellpentium()
    {
        System.out.println("\fYour choice is DELL PENTIUM QUAD CORE");
        System.out.println("1.CONTINUE");
        System.out.println("2.BACK");
        choice=sc.nextInt();
        while(true)
        {
            if(choice==1)
            {
                break;
            }
            else if(choice==2)
            {
                delldesktop();
            }
            else
            {
                System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
                ab.nextLine();
                dellpentium();
            }
        }
        System.out.println("\fSpecifications of Dell Pentium Quad Core are as follows:");
        System.out.println("1.Colour-Black");
        System.out.println("2.Cache Memory-2 MB");
        System.out.println("3.Processor Brand-Intel");
        System.out.println("4.Operating System-Ubuntu");
        System.out.println("5.Display Size-19.5 inch");
        System.out.println("6.Integrated Graphic Processor-Intel HD Graphics 405");
        System.out.println("7.USB-4 x USB Ports");
        System.out.println("8.Hard Drive-500 GB");
        System.out.println("9.Processor Frequency-1.6 GHz with Turbo Boost Upto 2.64 GHz");
        System.out.println("10.Input Devices-Wireless Mouse,Keyboard");
        System.out.println("********************************************");
        System.out.println("                PRICE=40,826");
        System.out.println("********************************************");
        System.out.println("1.CONFIRM PURCHASE");
        System.out.println("2.NOT TO BUY THE PRODUCT");
        System.out.println("\n*****************************************");
        System.out.println("  NOTE:18% GST WILL BE ADDED TO YOUR BILL");
        System.out.println("*****************************************");
        choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("\nHow many products would you like to buy");
            qty2[1]=sc.nextInt();
            sum=40826*qty2[1];
            tp=40826*qty2[1]+0.18*qty2[1];
            b[1]="Dell Pentium Quad Core";
            BILL8();
        }
        else if(choice==2)
        {
            prog();
        }

        else
        {
            System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            dellpentium();
        }

    }

    public static void HP()
    {
        System.out.println("\fWelcome to hp DESKTOPS");
        System.out.println("1.HP - (Core i5 (4th Gen)");
        System.out.println("2.HP - (Core i3 (6th Gen)");
        System.out.println("3.Back");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:hp1();
            break;
            case 2:hp2();
            break;
            case 3:desktop();
            break;   
            default:
            System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            HP();
        }
    }

    public static void hp1()
    {
        System.out.println("\fYour choice is HP - (Core i5 (4th Gen)");
        System.out.println("1.CONTINUE");
        System.out.println("2.BACK");
        choice=sc.nextInt();
        while(true)
        {
            if(choice==1)
            {
                break;
            }
            else if(choice==2)
            {
                HP();
            }
            else
            {
                System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
                ab.nextLine();
                hp1();
            }
        }
        System.out.println("\fSpecifications of HP - (Core i5 (4th Gen) are as follows:");
        System.out.println("1.Colour-SILVER BLACK");
        System.out.println("2.Cache Memory-2 MB");
        System.out.println("3.Processor Brand-Intel");
        System.out.println("4.Operating System-Free DOS");
        System.out.println("5.Display Size-19.5 inch");
        System.out.println("6.Integrated Graphic Processor-Intel HD Graphics 405");
        System.out.println("7.USB-4 x 2.0, 2 x 3.0");
        System.out.println("8.Hard Drive-500 GB");
        System.out.println("9.Processor Frequency-2.0 GHz");
        System.out.println("10.Input Devices-Wireless Mouse,Keyboard");
        System.out.println("********************************************");
        System.out.println("                PRICE=30,826");
        System.out.println("********************************************");
        System.out.println("1.CONFIRM PURCHASE");
        System.out.println("2.NOT TO BUY THE PRODUCT ");
        System.out.println("\n*****************************************");
        System.out.println("  NOTE:18% GST WILL BE ADDED TO YOUR BILL");
        System.out.println("*****************************************");
        choice=sc.nextInt();

        if(choice==1)
        {
            System.out.println("\nHow many products would you like to buy");
            qty2[2]=sc.nextInt();
            sum=30826*qty2[2];
            tp=30826*qty2[2]+0.18*qty2[2];
            b[2]=" HP Core i5";
            BILL9();
        }
        else if(choice==2)
        {
            prog();
        }

        else
        {
            System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            hp1();
        }

    }

    public static void hp2()
    {
        System.out.println("\fYour choice is HP - (Core i3 (6th Gen)");
        System.out.println("1.CONTINUE");
        System.out.println("2.BACK");
        choice=sc.nextInt();
        while(true)
        {
            if(choice==1)
            {
                break;
            }
            else if(choice==2)
            {
                HP();
            }
            else
            {
                System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
                ab.nextLine();
                hp2();
            }
        }
        System.out.println("\fSpecifications of HP - (Core i3 (6th Gen) are as follows:");
        System.out.println("1.Colour-SILVER");
        System.out.println("2.Cache Memory-3 MB");
        System.out.println("3.Processor Brand-Intel");
        System.out.println("4.Operating System-Free DOS");
        System.out.println("5.Display Size-39.62 cm (15.6 inch)");
        System.out.println("6.Screen Resolution-1366 x 768 pixel");
        System.out.println("Screen Type-HD LED Backlit Display");
        System.out.println("7.USB-1 x USB 3.0, 2 x USB 2.0");
        System.out.println("8.Hard Drive-1 TB");
        System.out.println("9.Processor Frequency-2.0 GHz");
        System.out.println("10.Keyboard-Full Size Textured Island-style Keyboard");
        System.out.println("Dedicated Graphic Memory Capacity-2 GB");
        System.out.println("********************************************");
        System.out.println("                PRICE=33,490");
        System.out.println("********************************************");
        System.out.println("1.CONFIRM PURCHASE");
        System.out.println("2.NOT TO BUY THE PRODUCT");
        System.out.println("\n*****************************************");
        System.out.println("  NOTE:18% GST WILL BE ADDED TO YOUR BILL");
        System.out.println("*****************************************");
        choice=sc.nextInt();

        if(choice==1)
        {
            System.out.println("How many products would u like to buy");
            qty2[3]=sc.nextInt();
            sum=33490*qty2[3];
            tp=33490*qty2[3]+0.18*qty2[3];
            b[3]=" HP Core i3";
            BILL10();
        }
        else if(choice==2)
        {
            prog();
        }

        else
        {
            System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            hp2();
        }

    }

    public static void appledesktop()
    {
        System.out.println("\fWelcome to APPLE DESKTOPS");
        System.out.println("1.Apple - (Core i5 (5th Gen)");
        System.out.println("2.Apple - (Core i5 (7th Gen)");
        System.out.println("3.Back");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:app1();
            break;
            case 2:app2();
            break;
            case 3:desktop();
            break;   
            case 4:System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            HP();
        }
    }

    public static void app1()
    {
        System.out.println("\fYour choice is Apple-(Core i5 (5th Gen)");
        System.out.println("1.CONTINUE");
        System.out.println("2.BACK");
        choice=sc.nextInt();
        while(true)
        {
            if(choice==1)
            {
                break;
            }
            else if(choice==2)
            {
                app1();
            }
            else
            {
                System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
                ab.nextLine();
                app1();
            }
        }
        System.out.println("\fSpecifications of Apple-(Core i5 (5th Gen) are as follows:");
        System.out.println("1.Colour-SILVER");
        System.out.println("2.Processor Frequency-2.8 GHz");
        System.out.println("3.Processor Brand-Intel");
        System.out.println("4.Operating System-Mac OS X Lion");
        System.out.println("5.Display Size-21.5 inch");
        System.out.println("6.System Memory-8 GB DDR3");

        System.out.println("7.USB-4 x USB 3.0 (Compatible USB 2.0), 2 x thunderbolts ports)");
        System.out.println("8.Hard Drive-1 TB");

        System.out.println("9..Dedicated Graphic Memory Capacity-1 GB");
        System.out.println("********************************************");
        System.out.println("                PRICE=1,07,900");
        System.out.println("********************************************");
        System.out.println("1.CONFIRM PURCHASE");
        System.out.println("2.NOT TO BUY THE PRODUCT");
        System.out.println("\n*****************************************");
        System.out.println("  NOTE:18% GST WILL BE ADDED TO YOUR BILL");
        System.out.println("*****************************************");
        choice=sc.nextInt();

        if(choice==1)
        { 
            System.out.println("\nHow many products would you like to buy");
            qty2[4]=sc.nextInt();
            sum=107900*qty2[4];   
            tp=107900*qty2[4]+0.18*qty2[4];
            b[4]=" Apple Core i5(5th Gen)";
            BILL11();
        }
        else if(choice==2)
        {
            prog();
        }

        else
        {
            System.out.println("invalid input,press enter to continue");
            ab.nextLine();
            app1();
        }

    }

    public static void app2()
    {
        System.out.println("\fYour choice is Apple-(Core i5 (7th Gen)");
        System.out.println("1.CONTINUE");
        System.out.println("2.BACK");
        choice=sc.nextInt();
        while(true)
        {
            if(choice==1)
            {
                break;
            }
            else if(choice==2)
            {
                app1();
            }
            else
            {
                System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
                ab.nextLine();
                app1();
            }
        }
        System.out.println("\fSpecifications of Apple - (Core i5 (7th Gen) are as follows:");
        System.out.println("1.Colour-White");
        System.out.println("2.Processor Frequency-3.4 GHz with Turbo Boost Upto 3.8 GHz");
        System.out.println("3.Processor Brand-Intel");
        System.out.println("4.Operating System-Mac OS X Sierra");
        System.out.println("5.Display Size-21.5 inch");
        System.out.println("6.System Memory-8 GB DDR3");
        System.out.println("Display Resolution-4096 x 2304 Pixel");
        System.out.println("7.USB-4 x USB 3.0 (Compatible USB 2.0), 2 x thunderbolts ports)");
        System.out.println("8.Hard Drive-1 TB");
        System.out.println("9.INPUT DEVICES-Magic Mouse 2 & Magic Keyboard with Numeric Keypad");
        System.out.println("10. BUILT IN MICROPHONES");
        System.out.println("11.Dedicated Graphic Memory Capacity-4 GB");
        System.out.println("********************************************");
        System.out.println("                PRICE=1,23,700");
        System.out.println("********************************************");
        System.out.println("1.CONFIRM PURCHASE");
        System.out.println("2.NOT TO BUY THE PRODUCT");
        System.out.println("\n*****************************************");
        System.out.println("  NOTE:18% GST WILL BE ADDED TO YOUR BILL");
        System.out.println("*****************************************");
        choice=sc.nextInt();

        if(choice==1)
        {
            System.out.println("\nHow many products would you like to buy");
            qty2[5]=sc.nextInt();
            sum=123700*qty2[5]; 
            tp=123700*qty2[5]+0.18*qty2[5];
            b[5]=" Apple Core i5(7th Gen)";
            BILL12();
        }
        else if(choice==2)
        {
            prog();
        }

        else
        {
            System.out.println("WRONG INPUT PRESS ENTER TO TRY AGAIN");
            ab.nextLine();
            app2();
        }

    }

    public static void BILL1()//lenovo 1
    {
        System.out.println("\f-----------------------------------------------------------------------------------------");
        System.out.println("                                TECHNOHUB                                                           ");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.print("|   name="+" "+name+"          ");
        System.out.print("|MOBILE NO="+""+mbno+"           ");
        System.out.println("|email id="+""+mail+"        ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("   PRODUCT NAME"+"         "+"|QUANTITY"+"            "+"|PRICE"+"\n"+"\n   "+a[0]+"         "+qty[0]+"\t\t\tsum="+sum+
        "\n\t\t\t\t\t\t"+"GST="+(0.18*qty[0]+"\n\t\t\t\t\t\t"+"Total Price="+tp));
        System.out.println("--------------------------------------------------------------------------------------------"); 
        System.out.println("\nWould u like to buy more?");
        s=sc.next();
        s=s.toUpperCase();
        ch=s.charAt(0);
        if(ch=='Y')
        {
            prog();
        }
        else if(ch=='N')
        {
            System.out.println("press enter to exit");
            ab.nextLine();
            exit();
        }
    }

    public static void BILL2()//lenovo 2
    {
        System.out.println("\f------------------------------------------------------------------------------------------");
        System.out.println("                                TECHNOHUB                                                           ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.print("   name="+" "+name+"          ");
        System.out.print("|  MOBILE NO="+""+mbno+"           ");
        System.out.println(" email id="+""+mail+"        ");
        System.out.println(" -------------------------------------------------------------------------------------------");
        System.out.println("   PRODUCT NAME"+"         "+"|QUANTITY"+"            "+"|PRICE"+"\n"+"\n   "+a[1]+"           "+qty[1]+
        "\t\t\tsum="+sum+"\n\t\t\t\t\t\t"+"GST="+(0.18*qty[1]+"\n\t\t\t\t\t\t"+"Total Price="+tp));
        System.out.println("--------------------------------------------------------------------------------------------"); 
        System.out.println("\nWould u like to buy more?");
        s=sc.next();
        s=s.toUpperCase();
        ch=s.charAt(0);
        if(ch=='Y')
        {
            prog();
        }
        else if(ch=='N')
        {
            System.out.println("press enter to exit");
            ab.nextLine();
            exit();
        }
    }

    public static void BILL3()//dell 1
    {
        System.out.println("\f-----------------------------------------------------------------------------------------");
        System.out.println("                                TECHNOHUB                                                           ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.print("   name="+" "+name+"          ");
        System.out.print("|  MOBILE NO="+""+mbno+"           ");
        System.out.println(" email id="+""+mail+"        ");
        System.out.println(" -------------------------------------------------------------------------------------------");
        System.out.println("   PRODUCT NAME"+"         "+"|QUANTITY"+"            "+"|PRICE"+"\n"+"\n   "+a[2]+"             "+qty[2]+
        "\t\t\tsum="+sum+"\n\t\t\t\t\t\t"+"GST="+(0.18*qty[2]+"\n\t\t\t\t\t\t"+"Total Price="+tp));
        System.out.println("--------------------------------------------------------------------------------------------"); 
        System.out.println("\nWould u like to buy more?");
        s=sc.next();
        s=s.toUpperCase();
        ch=s.charAt(0);
        if(ch=='Y')
        {
            prog();
        }
        else if(ch=='N')
        {
            System.out.println("press enter to exit");
            ab.nextLine();
            exit();
        }
    }

    public static void BILL4()//dell 2
    {
        System.out.println("\f-----------------------------------------------------------------------------------------");
        System.out.println("                                TECHNOHUB                                                           ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.print("|   name="+" "+name+"          ");
        System.out.print("|  MOBILE NO="+""+mbno+"           ");
        System.out.println(" email id="+""+mail+"        ");
        System.out.println(" -------------------------------------------------------------------------------------------");
        System.out.println("   PRODUCT NAME"+"         "+"|QUANTITY"+"            "+" |PRICE"+"\n"+"\n   "+a[3]+"           "+qty[3]+
        "\t\t\tsum="+sum+"\n\t\t\t\t\t\t"+"GST="+(0.18*qty[3]+"\n\t\t\t\t\t\t"+"Total Price="+tp));
        System.out.println("--------------------------------------------------------------------------------------------"); 
        System.out.println("\nWould u like to buy more?");
        s=sc.next();
        s=s.toUpperCase();
        ch=s.charAt(0);
        if(ch=='Y')
        {
            prog();
        }
        else if(ch=='N')
        {
            System.out.println("press enter to exit");
            ab.nextLine();
            exit();
        }
    }

    public static void BILL5()//apple 1
    {
        System.out.println("\f-----------------------------------------------------------------------------------------");
        System.out.println("                                TECHNOHUB                                                           ");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.print("|   name="+" "+name+"          ");
        System.out.print("|  MOBILE NO="+""+mbno+"           ");
        System.out.println(" email id="+""+mail+"        ");
        System.out.println(" ------------------------------------------------------------------------------------------");
        System.out.println("   PRODUCT NAME"+"                     "+"|QUANTITY"+"            "+"|PRICE"+"\n"+"\n   "+a[4]+"             "+qty[4]+
        "\t\t\tsum="+sum+"\n\t\t\t\t\t\t\t"+"GST="+(0.18*qty[4]+"\n\t\t\t\t\t\t\t"+"Total Price="+tp));
        System.out.println("-------------------------------------------------------------------------------------------"); 
        System.out.println("\nWould u like to buy more?");
        s=sc.next();
        s=s.toUpperCase();
        ch=s.charAt(0);
        if(ch=='Y')
        {
            prog();
        }
        else if(ch=='N')
        {
            System.out.println("press enter to exit");
            ab.nextLine();
            exit();
        }
    }

    public static void BILL6()//apple 2
    {
        System.out.println("\f-----------------------------------------------------------------------------------------");
        System.out.println("                                   TECHNOHUB                                                           ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.print("|   name="+" "+name+"          ");
        System.out.print("|  MOBILE NO="+""+mbno+"           ");
        System.out.println(" email id="+""+mail+"        ");
        System.out.println(" -------------------------------------------------------------------------------------------");
        System.out.println("   PRODUCT NAME"+"                  "+"|QUANTITY"+"            "+"|PRICE"+"\n"+"\n   "+a[5]+"             "+qty[5]+
        "\t\tsum="+sum+"\n\t\t\t\t\t\t\t"+"GST="+(0.18*qty[5]+"\n\t\t\t\t\t\t\t"+"Total Price="+tp));
        System.out.println("--------------------------------------------------------------------------------------------"); 
        System.out.println("\nWould u like to buy more?");
        s=sc.next();
        s=s.toUpperCase();
        ch=s.charAt(0);
        if(ch=='Y')
        {
            prog();
        }
        else if(ch=='N')
        {
            System.out.println("press enter to exit");
            ab.nextLine();
            exit();
        }
    }

    public static void BILL7()//dell 1
    {
        System.out.println("\f------------------------------------------------------------------------------------------");
        System.out.println("                                       TECHNOHUB                                                           ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.print("|   name="+" "+name+"          ");
        System.out.print("|  MOBILE NO="+""+mbno+"           ");
        System.out.println(" email id="+""+mail+"        ");
        System.out.println(" -------------------------------------------------------------------------------------------");
        System.out.println("   PRODUCT NAME"+"         "+"|QUANTITY"+"        \t "+"|PRICE"+"\n"+"\n   "+b[0]+"             "+qty2[0]+
        " \t\t\tsum="+sum+"\n \t\t\t\t\t\t"+"GST="+(0.18*qty2[0]+"\n \t\t\t\t\t\t"+"Total Price="+tp));
        System.out.println("--------------------------------------------------------------------------------------------"); 
        System.out.println("\nWould u like to buy more?");
        s=sc.next();
        s=s.toUpperCase();
        ch=s.charAt(0);
        if(ch=='Y')
        {
            prog();
        }
        else if(ch=='N')
        {
            System.out.println("press enter to exit");
            ab.nextLine();
            exit();
        }
    }

    public static void BILL8()//dell 2
    {
        System.out.println("\f------------------------------------------------------------------------------------------");
        System.out.println("                                       TECHNOHUB                                                           ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.print("|   name="+" "+name+"          ");
        System.out.print("|  MOBILE NO="+""+mbno+"           ");
        System.out.println(" email id="+""+mail+"        ");
        System.out.println(" ------------------------------------------------------------------------------------------");
        System.out.println("   PRODUCT NAME"+"                     "+"|QUANTITY"+"            "+"|PRICE"+"\n"+"\n   "+b[1]+"             "+qty2[1]+
        "\t\t\tsum="+sum+"\n\t\t\t\t\t\t\t"+"GST="+(0.18*qty2[1]+"\n\t\t\t\t\t\t\t"+"Total Price="+tp));;
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("\nWould u like to buy more?");
        s=sc.next();
        s=s.toUpperCase();
        ch=s.charAt(0);
        if(ch=='Y')
        {
            prog();
        }
        else if(ch=='N')
        {
            System.out.println("press enter to exit");
            ab.nextLine();
            exit();
        }
    }

    public static void BILL9()//hp 1
    {
        System.out.println("\f-------------------------------------------------------------------------------------------");
        System.out.println("                                    TECHNOHUB                                                           ");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.print("|   name="+" "+name+"          ");
        System.out.print("|  MOBILE NO="+""+mbno+"           ");
        System.out.println(" email id="+""+mail+"        ");
        System.out.println(" -------------------------------------------------------------------------------------------");
        System.out.println("   PRODUCT NAME"+"          "+"|QUANTITY"+"            "+"|PRICE"+"\n"+"\n   "+b[2]+"            "+qty2[2]+
        "\t\t\t\t\tsum="+sum+"\n\t\t\t\t\t\t\t\t"+"GST="+(0.18*qty2[2]+"\n\t\t\t\t\t\t\t"+"Total Price="+tp));;
        System.out.println("--------------------------------------------------------------------------------------------"); 
        System.out.println("\nWould u like to buy more?");
        s=sc.next();
        s=s.toUpperCase();
        ch=s.charAt(0);
        if(ch=='Y')
        {
            prog();
        }
        else if(ch=='N')
        {
            System.out.println("press enter to exit");
            ab.nextLine();
            exit();
        }
    }

    public static void BILL10()//hp 2
    {
        System.out.println("\f-----------------------------------------------------------------------------------------");
        System.out.println("                                      TECHNOHUB                                                           ");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.print("|   name="+" "+name+"          ");
        System.out.print("|  MOBILE NO="+""+mbno+"           ");
        System.out.println(" email id="+""+mail+"        ");
        System.out.println(" ------------------------------------------------------------------------------------------");
        System.out.println("   PRODUCT NAME"+"                     "+"|QUANTITY"+"            "+"|PRICE"+"\n"+"\n   "+b[3]+"  \t\t\t"+qty2[3]+
        "\t\tsum="+sum+"\n\t\t\t\t\t\t\t"+"GST="+(0.18*qty2[3]+"\n\t\t\t\t\t\t\t"+"Total Price="+tp));;
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("\nWould u like to buy more?");
        s=sc.next();
        s=s.toUpperCase();
        ch=s.charAt(0);
        if(ch=='Y')
        {
            prog();
        }
        else if(ch=='N')
        {
            System.out.println("press enter to exit");
            ab.nextLine();
            exit();
        }
    }

    public static void BILL11()//apple 1
    {
        System.out.println("\f-----------------------------------------------------------------------------------------");
        System.out.println("                                TECHNOHUB                                                           ");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.print("|   name="+" "+name+"          ");
        System.out.print("|  MOBILE NO="+""+mbno+"           ");
        System.out.println(" email id="+""+mail+"        ");
        System.out.println(" ------------------------------------------------------------------------------------------");
        System.out.println("   PRODUCT NAME"+"                     "+"|QUANTITY"+"          "+"|PRICE"+"\n"+"\n  "+b[4]+"             "+qty2[4]+
        "\t\t\tsum="+sum+"\n\t\t\t\t\t\t\t"+"GST="+(0.18*qty2[4]+"\n\t\t\t\t\t\t\t"+"Total Price="+tp));;
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("\nWould u like to buy more?");
        s=sc.next();
        s=s.toUpperCase();
        ch=s.charAt(0);
        if(ch=='Y')
        {
            prog();
        }
        else if(ch=='N')
        {
            System.out.println("press enter to exit");
            ab.nextLine();
            exit();
        }
    }

    public static void BILL12()//apple 2
    {
        System.out.println("\f-----------------------------------------------------------------------------------------");
        System.out.println("                                TECHNOHUB                                                           ");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.print("|   name="+" "+name+"          ");
        System.out.print("|  MOBILE NO="+""+mbno+"           ");
        System.out.println(" email id="+""+mail+"        ");
        System.out.println(" ------------------------------------------------------------------------------------------");
        System.out.println("   PRODUCT NAME"+"                     "+"|QUANTITY"+"           "+"|PRICE"+"\n"+"\n  "+b[5]+"             "+qty2[5]+
        "\t\t\tsum="+sum+"\n \t\t\t\t\t\t\t"+"GST="+(0.18*qty2[5]+"\n\t\t\t\t\t\t\t"+"Total Price="+tp));
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println("\nWould u like to buy more?");
        s=sc.next();
        s=s.toUpperCase();
        ch=s.charAt(0);
        if(ch=='Y')
        {
            prog();
        }
        else if(ch=='N')
        {
            System.out.println("press enter to exit");
            ab.nextLine();
            exit();
        }
    }    
}   



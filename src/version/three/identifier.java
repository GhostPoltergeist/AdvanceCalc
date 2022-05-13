package version.three;

import java.awt.*;
import java.util.Scanner;
import java.text.MessageFormat;
import java.util.concurrent.Phaser;

public class identifier {
    /** Object::For::Banner
     * >| Range 1-10
     * */
    static Banners BanZ = new Banners();

    static Scanner in = new Scanner(System.in);
    public static final double PI = 3.14;
    public static void main(String[] args) throws InterruptedException {
    //Math.Random:Operation::For::Banner
        int banner = (int)(Math.random() * 10) + 1;
        switch(banner) {
            case 1 -> BanZ.FirstBanner();
            case 2 -> BanZ.SecondBanner();
            case 3 -> BanZ.ThirdBanner();
            case 4 -> BanZ.FourthBanner();
            case 5 -> BanZ.FifthBanner();
            case 6 -> BanZ.SixthBanner();
            case 7 -> BanZ.SeventhBanner();
            case 8 -> BanZ.EighthBanner();
            case 9 -> BanZ.NinthBanner();
            case 10 -> BanZ.TenthBanner();
        }
        BanZ.Choice();
        Thread.sleep(500);System.out.print("#~: ");
        int choice = (in.nextInt());
     if(choice==1) {
	         Formula Degree = new Formula();
	         System.out.println(Color.RED_BOLD_BRIGHT);
	         System.out.println("::Sin(0)");
	         System.out.print(">|::Degree: ");
	         int degree = (in.nextInt());
	         System.out.print(">|::Opposite: ");
             double opposite = (in.nextDouble());
             System.out.print(">|::Hypotenuse: ");
             double hypotenuse = (in.nextDouble());
             Thread.sleep(1500);
	         Degree.PerformSinCalc(degree, opposite, hypotenuse);
        }
     if(choice==2) {
	         Formula Degree = new Formula();
             System.out.println(Color.RED_BOLD_BRIGHT);
             System.out.println("::Cos(0)");
             System.out.print(">|::Degree: ");
             int degree = (in.nextInt());
             System.out.print(">|::Adjacent: ");
             double adjacent = (in.nextDouble());
             System.out.print(">|::Hypotenuse: ");
             double hypotenuse = (in.nextDouble());
             Thread.sleep(1500);
             Degree.PerformCosCalc(degree, adjacent, hypotenuse);
	     }
     if(choice==3) {
            Formula Degree = new Formula();
            System.out.println(Color.RED_BOLD_BRIGHT);
            System.out.println("::Tan(0)");
            System.out.print(">|::Degree: ");
            int degree = (in.nextInt());
            System.out.print(">|::Opposite: ");
            double opposite = (in.nextDouble());
            System.out.print(">|::Adjacent: ");
            double adjacent = (in.nextDouble());
            Thread.sleep(1500);
            Degree.PerformTanCalc(degree, opposite, adjacent);
        }
	if(choice==4) {
            Formula Degree = new Formula();
            /*Calling::Functin::NewObject*/
             //ChangeFactors::ValuesDependingOnUser'sInput
            System.out.println(Color.RED_BOLD_BRIGHT);
            System.out.print("::Radian -> Degree:: \n");
            System.out.print("::Radian: ");
            int fx = (in.nextInt());
            Thread.sleep(1500);
            Degree.PerformRadianCalc(fx);
            System.out.println(Color.RESET);
        }
        //ChangingPhaseIfChoice==04;
          if(choice==44){
              Banners ChangeBanner = new Banners();
              PhaseOne Po = new PhaseOne();
              //Break
              ChangeBanner.Phase1();
               System.out.print("#~: ");
               int ph1 = (in.nextInt());
                if (ph1==1) {

                    //Break
                    System.out.println(Color.RED_BOLD_BRIGHT);
                    System.out.print("::Degree -> Gradian:: \n");
                    System.out.print("::Degree: ");
                    int degree = (in.nextInt());
                    Thread.sleep(1500);
                    Po.DegreeToGradian(degree);
                    System.out.println(Color.RESET);
                    System.out.println("");
                }
          }


    if(choice==5) {
           Formula Degree = new Formula();
           /*Calling::Functin::NewObject*/
           System.out.println(Color.RED_BOLD_BRIGHT);
           System.out.print("::Degree -> Radian:: \n");
           System.out.print("::Degree: ");
            int fx = (in.nextInt());
            Thread.sleep(1500);
            Degree.data(fx);
           System.out.println(Color.RESET);
       }
      

    }
}

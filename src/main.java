import java.util.Scanner;
public class main {
    public static void main(String[] args) {
      double armutkg,elmakg,muzkg,domateskg,patlıcankg;
      double armutfıyat=2.14;
      double elmafıyat=3.67;
      double muzfıyat=0.95;
      double domatesfıyat=1.11;
      double patlıcanfıyat=5;
        Scanner input=new Scanner(System.in);
        System.out.print("aldıgınız armut kilogramı:");
        armutkg= input.nextDouble();
        System.out.print("aldıgınız elma kilogramı:");
        elmakg= input.nextDouble();
        System.out.print("aldıgınız muz kilogramı:");
        muzkg= input.nextDouble();
        System.out.print("aldıgınız domates kilogramı:");
        domateskg= input.nextDouble();
        System.out.print("aldıgınız patlıcan kilogramı:");
        patlıcankg= input.nextDouble();
        double tutar;
        tutar=(armutkg*armutfıyat)+(elmafıyat*elmakg)+(muzfıyat*muzkg)+(domatesfıyat*domateskg)+(patlıcanfıyat*patlıcankg);
        System.out.println("ödemeniz gereken tutar="+tutar);
    }
}

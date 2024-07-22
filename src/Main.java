import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String userName, password;
        int balance = 9000, right = 3, select;


        Scanner input = new Scanner(System.in);

        while (right > 0){
            System.out.print("Kullanıcı adı giriniz: ");
            userName = input.nextLine();

            System.out.print("Parola giriniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Patika bankasına hoş geldiniz.");
                do {
                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Çıkış");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    input.nextLine();

                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutar:");
                            int deposit = input.nextInt();
                            balance += deposit;
                            System.out.println(deposit + " TL hesabınıza yatırıldı.");
                            System.out.println("Güncel bakiyeniz: " + balance + " TL");
                            break;
                        case 2:
                            System.out.println("Güncel bakiyeniz: " + balance + " TL");
                            System.out.print("Çekmek istediğiniz tutar:");
                            int withDraw = input.nextInt();
                            if (withDraw > balance){
                                System.out.println("Yetersiz Bakiye");
                            }else {
                                balance -= withDraw;
                                System.out.println(withDraw + " TL hesabınızdan çekildi.");

                            }
                            System.out.println("Güncel bakiyeniz: " + balance + " TL");
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance + " TL" );

                    }
                }while (select != 4);
                System.out.println("Çıkış yapılıyor...");
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                    System.out.println("Hatalı giriş yaptınız, tekrar deneyin.");
                if (right == 0){
                    System.out.println("Hesabınız bloke oldu, lütfen banka ile iletişime geçin");
                } else {
                    System.out.println("Kalan hakkınız: " + right);
                }

            }

        }

    }
}
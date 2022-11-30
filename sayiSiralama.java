import java.util.Scanner;
public class sayiSiralama {
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        int a,b,c;
        System.out.print("İlk tam sayıyı giriniz:");
        a=input.nextInt();
        System.out.print("İkinci tam sayıyı giriniz:");
        b=input.nextInt();
        System.out.print("Üçüncü tam sayıyı giriniz:");
        c=input.nextInt();
        if(a>b && a>c && b>c){
            System.out.print("SONUÇ:"+"a>b>c");
        }
        else if(a>b && a>c && c>b){
            System.out.print("SONUÇ:"+"a>c>b");
        }
        else if(b>a && b>c && a>c){
            System.out.print("SONUÇ:"+"b>a>c");
        }
        else if(b>a && b>c && c>a){
            System.out.print("SONUÇ:"+"b>c>a");
        }
        else if(c>a && c>b && a>b){
            System.out.print("SONUÇ:"+"c>a>b");
        }
        else if(c>a && c>b && b>a){
            System.out.print("SONUÇ:"+"c>b>a");
        }
        else if(a==b && a>c){
            System.out.print("SONUÇ:"+"a=b>c");
        }
        else if(a==b && c>a){
            System.out.print("SONUÇ:"+"c>a=b");
        }
        else if(a==c && a>b){
            System.out.print("SONUÇ:"+"a=c>b");
        }
        else if(a==c && b>a){
            System.out.print("SONUÇ:"+"b>a=c");
        }
        else if(b==c && b>a){
            System.out.print("SONUÇ:"+"b=c>a");
        }
        else if(b==c && a>b){
            System.out.print("SONUÇ:"+"a>b=c");
        }
        else{
            System.out.println("SONUÇ:"+"a=b=c");
        }




    }
}

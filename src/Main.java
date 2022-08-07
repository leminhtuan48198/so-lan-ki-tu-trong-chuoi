import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String str=scanner.nextLine();
        System.out.println("Nhập vào kí tự cần kiểm tra");
        char ch=scanner.next().charAt(0);
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                sum+=1;
            }
            
        }
            System.out.println("Số lần xuất hiện là " +sum);
    }
}

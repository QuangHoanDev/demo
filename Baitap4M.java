package MyHomeWork;
import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class Baitap4M {
    public static void main(String arg[]) {
        // timMax();
        // System.out.println("Tong dung for la: " + tinhTongMang());
        System.out.println("Tong Num la: " + tinhTong());
        // tinhTongMinMax();
        // tinhHieuChanLe();

    }

    // 1. Tìm Max
    static void timMax() {

        int[] mang;
        mang = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Nhap phan tu thu " + i + " : ");
            mang[i] = sc.nextInt();
        }
        int max = mang[0];
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] > max)
                max = mang[i];
        }
        System.out.println("So lon nhat la: " + max);

    }

    // 3. Tính Tổng (level 2)
    static int tinhTongMang() {
        int[] mang;
        mang = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Nhap phan tu thu " + i + " : ");
            mang[i] = sc.nextInt();
        }
        int tong = 0;
        for (int i = 0; i < mang.length; i++) {
            tong += mang[i];
        }
        return tong;
    }

    // 2. Tính Tổng
    static int tinhTong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = sc.nextInt();

        int tong = 0;
        // for(int i=1;i<=n;i++)
        // {
        // tong +=i;
        // }
        // return tong;

        int i = 1;
        while (i <= n) {
            tong += i;
            i++;
        }
        return tong;

        // do{
        // tong += i;
        // i++;
        // }while(i<=n);
        // return tong;
    }

    // 4. Tính tổng(level 3)
    static void tinhTongMinMax() {
        int[] mang;
        mang = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Nhap phan tu thu " + i + " : ");
            mang[i] = sc.nextInt();
        }
        int max = mang[0];
        int min = mang[0];
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] > max)
                max = mang[i];
            else if (mang[i] < min) {
                min = mang[i];
            }
        }
        System.out.println("So lon nhat la: " + max);
        System.out.println("So nho nhat la: " + min);
        System.out.println("Tong 2 So La: " + (max + min));
    }

    
    // 5. Tính Tổng(level 4)
    static void tinhHieuChanLe() {
        int[] mang;
        mang = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Nhap phan tu thu " + i + " : ");
            mang[i] = sc.nextInt();
        }
        int tongChan = 0, tongLe = 0;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 == 0) {
                tongChan += mang[i];
            } else if (mang[i] % 2 != 0) {
                tongLe += mang[i];
            }
        }
        System.out.println("Hieu cua so chan - so le la: " + (tongChan - tongLe));
    }
}

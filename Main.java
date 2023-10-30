public class Main {
    public int tambah(int a, int b){
    return a+b;
    }
    public double kurang (int a, int b){
    return a-b;
    }
    public double kali (int a, int b){
    return a*b;
    }
    public double bagi(int a, int b){
    return a/b;
    }


    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("a= 6, b=3");
        System.out.println("hasil tambah: "+obj.tambah(6,3));
        System.out.println("hasil kurang: "+obj.kurang(6,3));
        System.out.println("hasil kali: "+obj.kali(6,3));
        System.out.println("hasil pembagian: "+obj.bagi(6,3));
    }
}
import java.util.Scanner;

public class PenjumlahanMatriks {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("masukkan jumlah baris matriks: ");
        int baris=input.nextInt();
        System.out.println("masukkan jumlah kolom matriks: ");
        int kolom=input.nextInt();
        int [][] matriksA=new int [baris][kolom];
        int [][] matriksB=new int [baris][kolom];
        int [][] hasil=new int [baris][kolom];
        System.out.println("masukkan elemen matriks A: ");
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                System.out.print("elemen["+i+"]["+j+"]: ");
                matriksA[i][j]=input.nextInt();
            }
        }
        System.out.println("masukkan elemen matriks B: ");
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                System.out.print("elemen["+i+"]["+j+"]: ");
                matriksB[i][j]=input.nextInt();
            }
        }
        System.out.println("\n-----hasil penjumlahan matriks------");
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                hasil[i][j]=matriksA[i][j]+matriksB[i][j];
                System.out.print(hasil[i][j]+" ");
            }
}
}
}


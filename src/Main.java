import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanSoal = new Scanner(System.in);
        int inputSoal;

        System.out.println("Soal no : ");
        inputSoal = scanSoal.nextInt();

        switch (inputSoal) {
            case 1:
                Scanner scan = new Scanner(System.in);
                int inputInt;

                System.out.println("Enter numbers : ");
                inputInt = scan.nextInt();

                if (inputInt > 0 && inputInt < 100){
                    if (inputInt % 2==0){
                        System.out.println("Weird");
                    }else if (inputInt % 2!=0 && inputInt > 2 && inputInt < 5){
                        System.out.println("Not Weird");
                    }else if (inputInt > 6 && inputInt < 20){
                        System.out.println("Weird");
                    }else if (inputInt % 2==0 && inputInt > 20){
                        System.out.println("Not Weird");
                    }
                }else {
                    System.out.println("Angka harus diantara 1-100");
                }
                break;

            case 2:
                int min = 1;
                int max = 100;

                int randomNumber = (int)(Math.random()*(max-min+1)+min);
                System.out.println("Randomnya : "+randomNumber);
                if (randomNumber<=60 ){
                    System.out.println("Kurang");
                }else if (randomNumber>60 && randomNumber<=70){
                    System.out.println("Cukup");
                }else if (randomNumber>70 && randomNumber<=80){
                    System.out.println("Baik");
                }else if (randomNumber>80){
                    System.out.println("Luar Biasa");
                }
                break;

            case 3:
                System.out.println("select id_mhs,nama_mhs, nama_matkul from mata_kuliah_mahasiswa a " +
                        "join mahasiswa B on a.id_mhs = B.id_mhs " +
                        "join mata_kuliah c on a.nama_matkul=c.nama_matkul");
                break;

            case 4:
                String param =  "Selamat Pagi Semua";
                String format1 = param.toUpperCase();
                System.out.println("Format 1 : "+format1);
                String format2 = param.toLowerCase();
                System.out.println("Format 2 : "+format2);
                String format3 = param.replaceAll(" ", "");
                System.out.println("Format 3 : "+format3);
                String format4 = param.replaceAll(" ", "").toUpperCase();
                System.out.println("Format 4 : "+format4);
                break;


            case 5:
                Integer angka = 1225441;

                List arrOfAngka = List.of(angka.toString().split(""));

                for(int i = 0; i < arrOfAngka.size(); i++){
                    System.out.println(arrOfAngka.get(i) + "0".repeat(arrOfAngka.size()-(i+1)));
                }
                break;


            case 6:

                for(int i = 1; i <= 100; i++) {
                    if (((i % 3) == 0) && ((i % 5) == 0))
                        System.out.print("Mitra Pajakku");
                    else if ((i % 3) == 0) System.out.print("Mitra");
                    else if ((i % 5) == 0) System.out.print("Pajakku");
                    else System.out.print(i);
                    System.out.print(" ");
                }
                System.out.println();
                break;

            case 7:
                Scanner scanString = new Scanner(System.in);
                String inputString;

                System.out.println("Enter teks : ");
                inputString = scanString.next();
                isValid(inputString);
                break;

            case 8:


                System.out.println("20000, Pph < 2000, terurut membesar berdasarkan ID. \n" +
                        "select  * from T_SPT_21_TIDAK_FINAL\n" +
                        "where Bruto > 20000 and Pph < 2000\n" +
                        "order by ID asc\n");

                System.out.println("select count(*) as Jumlah, avg(Pph) as rata_rata_Pph\n" +
                        "from T_SPT_21_TIDAK_FINAL\n");

                break;

            case 9:
                FakturKeluaran();

                break;

            default:
                System.out.println("tap");
        }


    }

    private static void FakturKeluaran() {
        System.out.println("asdasd");
    }

    private static void Urutkan() {
        Integer[] intList = {22,22,1,3};
        Arrays.sort(intList);

        for (int x = 0; x < intList.length; x++){
            System.out.print("\t"+intList[x]);

        }

    }

    private static void isValid(String teks) {
        String poli = "";

        for(int i=teks.length();i>0;i--){
            String test1 = teks.substring(i-1, i);
            poli += test1;
        }

        if(teks.equals(poli)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }


}
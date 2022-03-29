import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("===Gudang Penyimpanan Peralatan Olahraga===\n");

        //deklarasi variabel data yang digunakan
        Scanner input = new Scanner(System.in);
        boolean bool = true;

        int ukuran = 10;

        String[] kok = new String[ukuran];
        Stack<String> matras = new Stack<>();
        LinkedList<String> rompi = new LinkedList<>();

        //variabel antrian
        int count = 0;
        int isiKok = 1;
        int pinjam = 0;
        String[] pinjamKok = new String[10];

        //variabel stack
        int isiMatras = 1;
        int countt = 0;
        String[] pinjamMatras = new String[10];

        //variabel linkedlist
        int isiRompi = 1;
        int counttt = 0;
        String[] pinjamRompi = new String[10];

        

        //membuat menu
        do {
            System.out.println("\nPilihan Menu Tersedia : ");
            System.out.println("1. Tambah Peralatan");
            System.out.println("2. Lihat Stok");
            System.out.println("3. Ambil Peralatan");
            System.out.println("4. Pengembalian");
            System.out.println("5. Cek Binary Tree");
            System.out.println("6. Exit");
    
            System.out.printf("Pilih Menu [1-6] : ");
            int menu = input.nextInt();

            System.out.println("======================================\n");

            switch (menu) {
                case 1:
                System.out.println("\nPilihan Barang : ");
                System.out.println("1. Shuttlecock");
                System.out.println("2. Matras");
                System.out.println("3. Rompi Futsal");

                System.out.printf("Pilih Menu [1-3] : ");
                int barang = input.nextInt();
                    switch (barang) {
                        case 1:
                            kok[count] = "Shuttlecock ke-"+isiKok;
                            
                            System.out.println("\nShuttlecock ke-"+isiKok+" sudah ditambahkan ke gudang");
                            isiKok++;
                            count++;
                            
                            break;

                        case 2:
                            matras.push("Matras ke-"+isiMatras);

                            System.out.println("\nMatras ke-"+isiMatras+" sudah ditambahkan ke gudang");
                            isiMatras++;
                            
                            break;

                        case 3:
                            rompi.add("Rompi ke-"+isiRompi);

                            System.out.println("\nRompi ke-"+isiRompi+" sudah ditambahkan ke gudang");
                            isiRompi++;

                            break;
                    
                        default:
                            break;
                    }
                    break;

                case 2:
                    System.out.println("===Daftar Barang===");

                    System.out.println("Shuttlecock");
                    for (int i = 0; i<10; i++) {
                        System.out.println(kok[i]);    
                    }

                    System.out.println("\nMatras");
                    System.out.println(matras);    

                    System.out.println("\nRompi futsal yang tersimpan sekarang adalah : "+rompi);
                    break;


                case 3:
                System.out.println("\nPilihan Barang : ");
                System.out.println("1. Shuttlecock");
                System.out.println("2. Matras");
                System.out.println("3. Rompi Futsal");

                System.out.printf("Pilih Menu [1-3] : ");
                int barangg = input.nextInt();
                    switch (barangg) {
                        case 1:
                        pinjamKok[pinjam] = kok[0];
                        pinjam++;
                        System.out.println("\n"+kok[0]+" sudah diambil dari gudang");
                        for (int i = 0; i < ukuran-1; i++) {
                            kok[i] = kok[i+1];
                        }
                        count--;

                            break;

                        case 2:
                        String tempMatras = matras.pop();
                        System.out.println("\nMatras ke-"+tempMatras+" sudah diambil dari gudang");

                        pinjamMatras[countt] = tempMatras;
                        countt++;
                            break;

                        case 3:
                        Scanner key = new Scanner(System.in);
                        System.out.printf("\nRompi ke-berapa yang ingin diambil[Angka] : ");
                        int ambilRompi = key.nextInt();
                        int index = ambilRompi-1;
                        System.out.printf("\nRompi ke-"+ambilRompi+" sudah diambil dari gudang");

                        pinjamRompi[counttt] = rompi.remove(index);
                        counttt++;

                            break;
                    
                        default:
                            break;
                    }
                    break;

                case 4:
                System.out.println("\nPilihan Barang : ");
                System.out.println("1. Shuttlecock");
                System.out.println("2. Matras");
                System.out.println("3. Rompi Futsal");

                System.out.printf("Pilih Menu [1-3] : ");
                int baranggg = input.nextInt();
                    switch (baranggg) {
                        case 1:
                        kok[count] = pinjamKok[0];
                        System.out.println("\n"+kok[count]+" sudah dikembalikan ke gudang");
                        count++;
                        for (int i = 0; i < ukuran-1; i++) {
                            pinjamKok[i] = pinjamKok[i+1];
                        }
                        pinjam--;

                            break;

                        case 2:
                            matras.push(pinjamMatras[0]);
                            System.out.println("\n"+pinjamMatras[0]+" sudah dikembalikan ke gudang");
                            for (int i = 0; i < 9; i++) {
                                pinjamMatras[i] = pinjamMatras[i+1];
                            }
                            break;

                        case 3:
                            Scanner indKey = new Scanner(System.in);
                            System.out.printf("\nIngin meletakkan rompi pada urutan[1-10] : ");
                            int indx = indKey.nextInt();
                            int indxx = indx-1;

                            rompi.add(indxx, pinjamRompi[0]);

                            for (int i = 0; i < 9; i++) {
                                pinjamRompi[i] = pinjamRompi[i+1];
                            }

                            break;
                    
                        default:
                            break;
                    }    

                    break;
                
                case 5:
                    System.out.println("\n\n");
                    BinaryTree tree = new BinaryTree();
                    tree.root = new Node(1);
                    tree.root.left = new Node(2);
                    tree.root.right = new Node(3);
                    tree.root.left.left = new Node(4);
                    tree.root.left.right = new Node(5);
                    tree.root.right.left = new Node(6);
                    tree.root.right.right = new Node(7);

                    System.out.print("PreOrder  [Shutlecock]     : ");
                    tree.printPreorder();

                    System.out.print("\ninOrder   [Matras]         : ");
                    tree.printInorder();

                    System.out.print("\nPostOrder [Rompi futsal]   : ");
                    tree.printPostorder();
                    System.out.println("\n");
                
                    break;

                case 6:
                    System.out.println("Terima kasih telah Menggunakan Program Ini ^^\n");
                    System.exit(0);

                default:
                    System.out.println("Masukan inputan menu yang tersedia pada pilihan!");
                    break;

                    
            
            }
        
        }while(bool=true);
    
        

    }
}
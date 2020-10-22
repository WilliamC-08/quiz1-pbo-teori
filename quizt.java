import java.util.Scanner;

public class quizt{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		String nama,kemb; byte tipe; int meter; int bayar, tot,kembalian,hdasar;
		tot=0; bayar=0; hdasar=0; kembalian=0;
		System.out.print("Nama: ");
		nama = input.nextLine();
		System.out.println("Tipe rumah (31/32/33/34/35/40): ");
		tipe = input.nextByte();
		System.out.print("Meteran: ");
		meter = input.nextInt();
		
		switch(tipe){
			case 31:
					hdasar=100000;
					tot=hdasar*meter;
					break;
			case 32:
					hdasar=125000;
					tot=hdasar*meter;
					break;
			case 33:
					hdasar=450000;
					tot=hdasar*meter;
					break;
			case 34:
					hdasar=480000;
					tot=hdasar*meter;
					break;
			case 35:
					hdasar=500000;
					tot=hdasar*meter;
					break;
			case 40:
					hdasar=550000;
					tot=hdasar*meter;
					break;
			default:
					System.out.println("Inputan Salah");
					break;
					}
					
		System.out.println("TOTAL HARGA = "+tot);
		while(bayar<tot){
			System.out.print("Bayar = "); 
		bayar = input.nextInt();
			if (bayar > tot){
				kembalian=bayar-tot;
			}
			else if (bayar<tot){
				System.out.println("Uang anda kurang, mohon ditambah");
			}
		}
		
		System.out.println();
		System.out.println("===============================================");
		System.out.println("Nama = "+nama);
		System.out.println("Total Harga: ");
		System.out.println("Tipe "+tipe+" - "+hdasar+" * "+meter+" = "+tot);
		System.out.println("Anda Membayar = "+bayar);
		System.out.println("Kembalian Anda: "+kembalian);
		
		
		
	}
}
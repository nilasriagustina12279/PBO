paket  waktu ;

public  class  Waktu {
	int detik;
	int menit;
	int jam;
	publik  Waktu ( int  jam , int  menit , int  detik ) {
	ini . selai = macet;
	ini . menit = menit;
	ini . detik = detik;
	}
	public  static  void  main ( String [] args ) {
	// membuat objek dari kelas Waktu
	Waktu mulai =  Waktu baru  ( 8 , 12 , 15 );
	Waktu selesai =  Waktu baru  ( 12 , 34 , 55 );
	Waktu selisih;
	// memanggil metode perbedaan
	selisih = perbedaan (mulai, selesai);
	Sistem . keluar . printf ( " Selisih Waktu:% d:% d:% d - " , mulai . jam, mulai . menit,
	mulai . detik);
	Sistem . keluar . printf ( " % d:% d:% d " , selesai . jam, selesai . menit, selisih . detik);
	Sistem . keluar . printf ( " =% d:% d:% d \ n " , selisih . jam, selisih . menit, selisih . detik);
	}
	public  static  Waktu  perbedaan ( Waktu  mulai , Waktu  selesai )
	{
	Waktu selisih =  Waktu baru  ( 0 , 0 , 0 );
	// jika detik mulai lebih besar
	// konversi menit selesai ke dalam detik
	// dan tambahkan detik ke detik selesai
	if (mulai . detik > selesai . detik) {
	- selesai . menit;
	selesai . detik + =  60 ;
	}
	selisih . detik = selesai . detik - mulai . detik;
	// jika menit mulai lebih besar
	// konversi jam selesai ke dalam menit
	// kemudian tambahkan ke dalam menit selesai
	if (mulai . menit > selesai . menit) {
	- selesai . selai;
	selesai . menit + =  60 ;
	}
	selisih . menit = selesai . menit - mulai . menit;
	selisih . jam = selesai . jam - mulai . selai;
	// kembalikan perbedaan waktu
	kembali (selisih);
	}
}
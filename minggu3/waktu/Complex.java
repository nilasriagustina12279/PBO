paket  waktu ;

public  class  Complex {
	ganda nyata;
	gambar ganda ;
	Public  Complex ( double  real , double  imag ) {
	ini . nyata = nyata;
	ini . imag = imag;
	}
	public  static  void  main ( String [] args ) {
	Kompleks n1 =  Kompleks baru  ( 2.3 , 4.5 ),
	n2 =  Kompleks baru  ( 3.4 , 5.0 ),
	suhu;
	temp = tambahkan (n1, n2);
	Sistem . keluar . printf ( " Jumlah =% .1f +% .1fi " , temp . real, temp . imag);
	}
	public  static  Kompleks  add ( Kompleks  n1 , Kompleks  n2 )
	{
	Suhu kompleks =  Kompleks baru  ( 0,0 , 0,0 );
	suhu . nyata = n1 . nyata + n2 . nyata;
	suhu . gambar = n1 . gambar + n2 . membayangkan;
	kembali (temp);
	}
}
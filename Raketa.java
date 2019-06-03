import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Raketa {


	public static void main (String[] args) throws Exception { //

		String thisLine = null;
		
		try {

			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

			System.out.println (" ? raketos_greitis: " );

			String raketos_greitis_str = br.readLine ();

			double raketos_greitis = Double.parseDouble ( raketos_greitis_str )  ;
			
			System.out.println("raketos_greitis: " + raketos_greitis +" laikas");		

			System.out.println( " ? laiko zingsnis:" );

			String laiko_zingsnis_str = br.readLine ();
			
			double  laiko_zingsnis = Double.parseDouble ( laiko_zingsnis_str )  ;
			
			System.out.println( "skaiciuosime kas " +  laiko_zingsnis +" sek." );

    skaiciavimo pab 
			
			
			System.out.println();
			System.out.println( " val.  raketos_greitis" );

			for ( int val = 1; val < 2; val++ )  {
				
				tprad=0
				
				sk_str
				
				int sk =Integen.parseInt(skstr);
				
				int greitis km/h = 100;
				
				for (int = t =60; i<sk; i++) {
					
		
					
				}System.out.parseIn (fakt)
				
				
				System.out.println ( String.format ( "%3d. %8.2f", laikas, raketos_greitis ) );
			}
				
		} catch (Exception e) {


			e.printStackTrace();

		}
	}
}

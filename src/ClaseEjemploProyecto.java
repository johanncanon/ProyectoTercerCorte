import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class ClaseEjemploProyecto {

	/***
	 * 
	 */
	private static BufferedReader stdin;
	/***
	 * 
	 */
	private static String face = "23456789TJQKA";
	/***
	 * 
	 */
	private static String suit = "CDSH";

	/***
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Reader rdr = new InputStreamReader(System.in);
		stdin = new BufferedReader(rdr);
		int n = Integer.parseInt(stdin.readLine());

		for (int i = 0; i < n; i++)
			(new ClaseEjemploProyecto()).solve();

	}

	/***
	 * 
	 * @param n
	 * @return
	 * @throws IOException
	 */
	public int[] readCards(int n) throws IOException , NoSuchElementException , StringIndexOutOfBoundsException {
		StringTokenizer sb = new StringTokenizer(stdin.readLine());
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			String card = sb.nextToken();
			int f = face.indexOf(card.charAt(0)); // errores aqui!
			int s = face.indexOf(card.charAt(1));
			c[i] = f * 4 + s;
		}
		return c;
	}
					
	/***
	 * 
	 * @throws IOException
	 */
	public void solve() throws IOException {
		int ncards = Integer.parseInt(stdin.readLine());
		int [] his = readCards(ncards);
		int [] mine = readCards(ncards);
		
		Arrays.sort(his);
		Arrays.sort(mine);
		
		int pts = 0;
		int lo = 0 , hi = ncards;
		
		for (int i = 0; i < ncards; i++) {
			if (mine[i] > his[lo])  {
				++lo;
				++pts;
			}
		}
		
		

	}

}

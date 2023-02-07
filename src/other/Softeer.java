package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Softeer {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = 0;
		String[] arr = new String[2];
		String[] arr2 = new String[2];
		
		for(int i=0; i<5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr = st.nextToken().split(":");
			arr2 = st.nextToken().split(":");
			for(int j = 0; j<2; j++) {
				int a = Integer.parseInt(arr[j]);
				int b = Integer.parseInt(arr2[j]);
				if(j == 0) {
					total += (b - a)*60;
				}else if(j == 1){
					if(b > a) {
						total += b - a;
					}else if(b < a) {
						if(a != 0) {
							total += 60 - a - 60;
						}
						if(b != 0) {
							total += b;
						}
					}
				}
			}
		}
		
		System.out.println(total);
		
		
	}

}

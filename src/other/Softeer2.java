package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Softeer2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = 0;
		String[] arr = new String[2];
		String[] arr2 = new String[2];
		
		for(int i=0; i<5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr = st.nextToken().split(":");
			arr2 = st.nextToken().split(":");
			for(int j = 0; j<2; j++) {
				if(j == 0) {
					total += (Integer.parseInt(arr2[j]) - Integer.parseInt(arr[j]))*60;
				}else if(j == 1){
					if(Integer.parseInt(arr2[j]) > Integer.parseInt(arr[j])) {
						total += Integer.parseInt(arr2[j]) - Integer.parseInt(arr[j]);
					}else if(Integer.parseInt(arr2[j]) < Integer.parseInt(arr[j])) {
						if(Integer.parseInt(arr[j]) != 0) {
							total += 60 - Integer.parseInt(arr[j]) - 60;
						}
						if(Integer.parseInt(arr2[j]) != 0) {
							total += Integer.parseInt(arr2[j]);
						}
					}
				}
			}
		}
		
		System.out.println(total);
		
		
	}

}

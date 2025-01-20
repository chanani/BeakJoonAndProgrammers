import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String arr[] = new String[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = br.readLine();
		}
		for(int i=0; i<arr[0].length(); i++) {
			int num = 1;
			char s = arr[0].charAt(i);
			
			for(int j=1; j<n; j++) {
				if(s != arr[j].charAt(i)) {
					num = 0;
					break;
				}
			}
			if(num == 1) {
				sb.append(s);
			}
			else {
				sb.append("?");
			}
		}
		System.out.println(sb);
		br.close();
	}
}
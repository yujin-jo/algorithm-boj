package step8;

import java.util.*;
import java.io.*;

public class Boj_2869_plan2{
	public static void main (String[] args) throws java.lang.Exception	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 콘솔에서 입력받는 경우
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());	// 낮에 올라갈 수 있는 길이
		int B = Integer.parseInt(st.nextToken());	// 자는 동안 미끄러지는 길이
		int V = Integer.parseInt(st.nextToken());	// 나무막대 높이
		
		// length / (A-B) 나무막대 높이에서 낮-밤을 뺀 값을 나누면 되는 줄 알았으나
		// 정상에 올라간 후에는 미끄러지지 않는다 조건 때문에 불가!
		int day = (V-B) / (A-B); 
		if((V-B)%(A-B)!=0){ //나머지가 있을 경우 == 잔여일수가 있을 경우
			day++;
		}
		bw.write(String.valueOf(day));
		bw.flush();
		bw.close();
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//배열 생성
		int[] Switch = new int[N];
		for (int i=0;i<N;i++) {
			Switch[i] = sc.nextInt();
		}
		
		int studentNumber = sc.nextInt();
		for(int t = 0; t<studentNumber;t++) {
			int st[] = {sc.nextInt(),sc.nextInt()-1};
			
			//남학생이라면
			if (st[0]==1) {
				//배수 해당하는 인덱스 스위치 상태바꾸기
				for (int i =st[1];i<N;i+=(st[1]+1)) {
					if (Switch[i]==1)
						Switch[i] = 0;
					else
						Switch[i] = 1;
				}
			}
			//여학생이라면
			else {
				//대칭 길이 확인
				int cnt = 0;
				for (int i=1;st[1]+i<N&&st[1]-i>=0;i++) {
					if (Switch[st[1]+ i]==Switch[st[1]-i])
						cnt += 1;
					else
						break;
				}
				
				//해당 범위의 스위치 상태바꾸기
				for (int i=st[1]-cnt;i<=st[1]+cnt;i++) {
					if(Switch[i]==1)
						Switch[i]=0;
					else
						Switch[i]=1;
				}
			}
		}
		
		//출력
		for(int i =0;i<N;i++) {
			System.out.print(Switch[i] + " ");
			if ((i + 1) % 20 == 0) System.out.println();
		}
	}
}

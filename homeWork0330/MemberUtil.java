package homeWork0330;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberUtil {

	List<Member> members = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public MemberUtil() {

	}
	// 회원정보입력
	public void memberInfo() {

		/*Member member01 = new Member("A", "000");
		Member member02 = new Member("B", "111");
		Member member03 = new Member("C", "222");

		members.add(member01);
		members.add(member02);
		members.add(member03);*/
		
		members.add(new Member("A","000"));
		members.add(new Member("B","111"));
		members.add(new Member("C","222"));
		

		this.idCheck();
	}
	// 아이디 확인
	public void idCheck() {
		
		System.out.println("전체회원수 : " + members.size());
		System.out.println("***비밀번호 변경서비스***");
		System.out.print("변경할 아이디 입력 : ");
		String id = sc.nextLine();

		int idCnt = 0, index = 0;
		for (int i = 0; i < members.size(); i++) {
			if (id.equals(members.get(i).getId())) {
				idCnt++;
				index = i; //id가같을때 index값저장
			}	
		}

		if (idCnt != 1) {
			System.out.println("입력하신 " + id + " 없습니다");
			System.exit(0);
		}
		
		this.modify(index);
	}
	
	// 비밀번호수정
	public void modify(int index) {
		
		System.out.print("현재 비밀번호 입력 : ");
		String password = sc.nextLine();

		if (!password.equals(members.get(index).getPassword())) {
			System.out.println("비밀번호가 다릅니다.\n서비스를 종료합니다");
			System.exit(0);
		}

		System.out.print("변경할 비밀번호 입력 : ");
		members.get(index).setPassword(sc.nextLine());
		System.out.println("패스원드 변경완료");
		System.out.println("=====================");
		System.out.println("전체회원 목록출력");
		System.out.println("아이디\t패스워드");
		System.out.println("=====================");

		int n = 0;
		for (Member num : members) {
			System.out.println(members.get(n).getId() + "\t" + members.get(n++).getPassword());
		}
	}

}

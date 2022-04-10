package Library;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Join {
	public static void dojoin(ArrayList<Member> joinlist, ArrayList<BookUser> booklist) {
		
		int sum=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("\n===============================================");
		System.out.println("                 <    회원가입    >                 ");
		System.out.println("===============================================\n");
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("주민번호를 - 없이 입력하세요 : ");
		String identity = sc.nextLine();
		System.out.print("휴대폰번호를 - 없이 입력하세요 : ");
		String phonenumber = sc.nextLine();
		System.out.print("ID를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요 : ");
		String password = sc.nextLine();
		
		// 정보가 비어져 있으면 for문이 안돌아가므로 menu창에 정보 하나 입력해줌
		for(int i=0;i<joinlist.size();i++) {
			if((joinlist.get(i).getName().equals(name)&&joinlist.get(i).getIdentity().equals(identity))) {
            // 리스트가 해당 이름과 주민번호를 안가졌다면 회원가입 실행
			sum++;
			}
		}
			if(sum==0) {
				joinlist.add(new Member(name,identity,phonenumber,id,password));
				booklist.add(new BookUser(id,password,"[대여 이력이 없습니다]","[대여 이력이 없습니다]","[대여 이력이 없습니다]","[대여 이력이 없습니다]")); 
				System.out.println("\n[회원가입이 완료되었습니다]");
			} else {
				System.out.println("[이미 회원입니다]"); //name이랑 identity가 똑같으면 이미 회원
			}
			
		}
	}



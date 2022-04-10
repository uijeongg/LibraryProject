package Library;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//책 입력
public class Admin {
	void bookadd(ArrayList<BookAdmin> bookaddlist) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\n===============================================");
		System.out.println("                <    도서 입력    >                 ");
		System.out.println("===============================================\n");

		a: while (true) {

			System.out.print("\n도서 이름을 입력하세요 : ");
			String bookname = sc.nextLine();
			System.out.print("지은이를 입력하세요 : ");
			String bookwriter = sc.nextLine();

			System.out.println("\n입력한 도서의 정보가 모두 맞습니까? (Y / N)");
			String answer1 = sc.nextLine();

			if (answer1.equals("Y")) {
				BookAdmin book = new BookAdmin();
				book.setBookname(bookname);
				book.setBookwriter(bookwriter);
				// 책 한개의 객체가 입력됐고
				bookaddlist.add(book); // 그 객체를 저장하는 리스트

				System.out.println("['" + bookname + "'이(가) 정상적으로 입력되었습니다]\n");

				System.out.println("< 입력된 도서 총 목록 >");

				for (int i = 0; i < bookaddlist.size(); i++) {
					// bookaddlist.get(i).getBookname();
					System.out.println(bookaddlist.get(i).getBookname());
				}

				System.out.println("\n도서를 추가 입력 하시겠습니까? (Y / N)");
				String answer2 = sc.nextLine();

				if (answer2.equals("Y")) {
					continue a;
				} else {
					break;

				}

			}

		}
		System.out.println("[도서 입력 서비스가 종료되었습니다]\n");
	}
}

// private String bookname;
// private String writer;

// Admin(String bookname, String writer) {
// this.bookname = bookname;
// this.writer = writer;
// }

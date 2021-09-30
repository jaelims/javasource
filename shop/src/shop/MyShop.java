package shop;

import java.util.Scanner;

public class MyShop implements IShop {

	private String title;
	private Scanner sc = new Scanner(System.in);
	private String selUser;

	// 장바구니 배열
	private Product[] carts = new Product[10]; // 배열 선언+생성

	// 회원정보 배열 - 회원이름, 결제타입
	private User users[] = new User[2];

	// 상품정보 배열 - 상품이름, 가격, 상세정보
	private Product products[] = new Product[5];

	public MyShop() {
		super();
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		// 고객 2명 생성
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("성춘향", PayType.CASH);

	}

	@Override
	public void genProduct() {
		// 상품 5개 생성
		// SmartTv(2개), CellPhone(3개)
		products[0] = new SmartTV("삼성 3D SMART TV", 5000000, "4k");
		products[1] = new SmartTV("LG SMART TV", 2500000, "FULL HD");
		products[2] = new CellPhone("갤럭시 노트20", 1000000, "SKT");
		products[3] = new CellPhone("아이폰10", 950000, "KT");
		products[4] = new CellPhone("갤럭시 z플립3", 1300000, "LG");

	}

	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정선택");
		System.out.println("======================");
		for (int i = 0; i < users.length; i++) {
			System.out.printf("[%d]%s(%s)\n", i, users[i].getName(), users[i].getPayType());
		}
		System.out.println("[x]종   료");
		System.out.print("선택 : ");
		
		String menu = sc.next();
		System.out.println("## " + menu + "선택 ##");

		// 사용자가 0, 1 선택한 경우 =>

		// x를 입력한 경우 => 종료
		switch (menu) {
		case "x":
			System.exit(0);
			break;

		default: // "0", "1"
			selUser = menu;
			productList();
			break;
		}

	}

	void productList() {
		System.out.println(title + " : 상품목록 - 상품선택");
		System.out.println("======================");
		
		// 상품정보 출력 => 
		for (int i = 0; i < products.length; i++) {
			System.out.print("[" + i + "]");
			products[i].printDetail();
		}
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.print("선택 : ");
		
		// 사용자 입력 => 상품선택, 0~4(장바구니에 현재 선택한 제품 담기, h(메인화면), c
		String menu = sc.next();
		System.out.println("## " + menu + "선택 ##");
		
		// "0" => 0
		
		switch (menu) {
		case "h":
			// 메인화면 보여주기
			start();
			break;
		case "c":
			checkOut();
			break;
		default: // "0", "1", "2", "3", "4"
			// 사용자가 선택한 상품을 carts에 담기
			for (int i = 0; i < carts.length; i++) {
				if (carts[i] == null) {
					carts[i] = products[Integer.parseInt(menu)];
					break;
				}
			}
			// 상품목록 보여주기
			productList();
			break;
		}
	}

	void checkOut() {
		System.out.println(title + " : 체크 아웃");
		System.out.println("======================");
		
		int sum = 0;
		
		for (int i = 0; i < carts.length; i++) {
			if(carts[i] != null) {
			System.out.printf("[%d] %s(%s)\n", i, carts[i].getPname(), carts[i].getPrice());
			sum += carts[i].getPrice(); // 결제 금액
			}
		}
		System.out.println("======================");
		System.out.println("결제 방법 : "+users[Integer.parseInt(selUser)].getPayType());
		System.out.printf("합계 : %d원 입니다.\n", sum);
		System.out.println("[p] 이전, [q] 결제 완료");
		System.out.print("선택 : ");
		String input = sc.next();
		switch (input) {
		case "p":
			productList();
			break;
		case "q":
			System.out.println("## 결제가 완료되었습니다. 종료합니다. ##");
			break;
		default:
			break;
		}
	}
}



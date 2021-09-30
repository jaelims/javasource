package exam;

import java.util.Scanner;

public class BankApplication {

	private static Account accountArray[] = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택 > ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				// 계좌생성 작업
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌 생성
	private static void createAccount() {
		// 배열이 비어 있는지 확인
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("계좌주 : ");
		String owner = scanner.next();
		System.out.print("초기입금액 : ");
		int balance = scanner.nextInt();
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}

		}
		// 비어 있다면 사용자의 입력값을 기반으로 객체 생성 비어 있는 배열에 담기
		// 계좌번호, 계좌주, 잔액
	}

	// 계좌 목록 보기
	private static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t"
						+ accountArray[i].getBalance());
			}
		}
	}

	// 예금하기
	private static void deposit() {
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		
		Account account = findAccount(ano);
		
		if(account != null) {
			System.out.print("입금액 : ");
			int balance = scanner.nextInt();
			// 잔액 = 잔액 + 입금액;
			// acount.balance += amount;
			account.setBalance(account.getBalance()+balance);
		} else {
			System.out.println("입금계좌를 확인해 주세요.");
		}
	}

	// 출금하기
	private static void withdraw() {
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		
		Account account = findAccount(ano);
		
		if(account != null) {
			System.out.print("출금액 : ");
			int balance = scanner.nextInt();
			account.setBalance(account.getBalance()-balance);
		} else {
			System.out.println("출금계좌를 확인해 주세요.");
		}

	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		
		Account account = null;
		// ano와 동일한 Account 객체 찾기
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				// 조건  ano와 accArr[i] 가 가지고 있는 ano가 같다면
				if(ano.equals(accountArray[i].getAno())) {
					account = accountArray[i];
					break;
				}
			}
			
		}
		return account;
		
	}
}

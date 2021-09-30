package shop;

public class ShopEx {
	public static void main(String[] args) {
		MyShop ms = new MyShop();

		// 상점 이름 지정
		ms.setTitle("자바마트");

		// 고객 생성
		ms.genUser();

		// 제품 생성
		ms.genProduct();

		// 상점 시작
		ms.start();

	}
}

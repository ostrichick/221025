package j0707;

public class ShoppingMall {
	public static void main(String[] args) {
		ShoppingMall order0001 = new ShoppingMall(201803120001l, "abc123", "2018년 3월 12일", "홍길순", "PD0345-12",
				"서울시 영등포구 여의도동 20번지");
		System.out.println(order0001);
		System.out.println(order0001.orderID);
		System.out.println(order0001.customerID);
		System.out.println(order0001.orderDate);
		System.out.println(order0001.customerName);
		System.out.println(order0001.productID);

	}

	long orderID;
	String customerID;
	String orderDate;
	String customerName;
	String productID;
	String customerAddr;

	ShoppingMall(long orderID, String customerID, String orderDate, String customerName, String productID,
			String customerAddr) {
		this.orderID = orderID;
		this.customerID = customerID;
		this.orderDate = orderDate;
		this.customerName = customerName;
		this.productID = productID;
		this.customerAddr = customerAddr;
	}
}

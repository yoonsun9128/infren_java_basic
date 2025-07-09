package hello.core.order;

// 역활을 만든거다!!!
public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}

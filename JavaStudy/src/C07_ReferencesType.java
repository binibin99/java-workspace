import java.util.Arrays;

public class C07_ReferencesType {

   /*
       # 기본형 데이터 타입
       
       - byte, short, int, char, long, double, boolean..
       - 소문자로 시작하는 타입들
       - 기본형 데이터 타입 변수에는 실제 값이 저장된다
       - 기본형 데이터 타입에는 .을 찍어 사용할 수 없다
       
       # 참조형 데이터 타입
       
       - String
       - 배열 (배열타입 변수에는 해당 배열의 시작위치 주소값이 저장되어 있다)
       - 모든 클래스들 (여러 타입들을 묶어서 만들어낸 커스텀 타입)
       - 참조형 데이터 타입 변수에는 해당 인스턴스의 위치(주소값)이 저장된다
       - 참조형 데이터 타입은 .을 찍어 저장되어 있는 주소를 찾아갈 수 있다 
    */
   public static void main(String[] args) {
      
      // 기본형 데이터 타입의 경우
      int a = 10;
      int b = a;
      
      a = 13;
      
      System.out.println("a: " + a);
      System.out.println("b: " + b);
      
      // 참조형 데이터 타입의 경우
      Card c1 = new Card('♡', 10);
      Card c2 = c1; // 얕은 복사 (주소값만 복사하는 것)
      
      Card c3 = new Card(c1.shape, c1.num); 
      // 깊은 복사 (실제 동일한 인스턴스를 만들어 내는것)
      
      c2.num = 3;
      
      System.out.printf("c1: %c%d\n", c1.shape, c1.num);
      System.out.printf("c2: %c%d\n", c2.shape, c2.num);
      System.out.printf("c3: %c%d\n", c3.shape, c3.num);
   
      // 기본형 타입값을 메서드에 전달하는 경우
      int a1 = 10;
      plus(a1);
      System.out.println("a1의 값은? " + a1);
      
      //
      Card c4 = new Card('♠', 99);
      changNum(c4);
      System.out.println("메서드 실행 후 c4의 숫자: " + c4.shape + c4.num);
   
      int[] nums = {10, 11, 12, 13, 14};
      changeElement(nums);
      System.out.println(Arrays.toString(nums));
   
   }
   
   public static void changeElement (int[] arr) {
      arr[0] = arr[0] * 2;
      arr[1] = arr[1] * 5;
   }
   
   public static void changNum(Card c) {
      c.num = 3;
      System.out.println("바뀐 카드의 숫자: " + c.shape + c.num);
   }
   
   public static void plus(int num) {
      num += 3;
      System.out.println("num + 3 = " + num);
   }
   
}
# Head First : Design Patterns

## Observer Pattern 옵저버 패턴.

### 요약 : 
기준(Subject)이 되는 객체의 상태가 변하게 되면,    
등록되어있는 모든 객체(Observer)에게 알리게 되는 방식이다.  
현실의 잡지구독과 비슷하다.  
Subject가 Observer를 호출하는 (푸쉬)방식이 있고,  
반대로 Observer가 Subject에게 필요할때 호출하는 (풀)방식이 있다.  



### 기억 추적 : 
기준(Subject)를 구현할 때, Observer List를 구현한다.  
이를 활용하여 각 옵저버들에게 내용을 전달함.  
자바 클래스로 이미 구현되어 있다.  
[class] java.util.Observable   
[interface] java.util.Observer  
기준(Subject)에서 Observable을 상속 받고, 객체(Observer)는 Observer를 구현하면 끝.  


### UML
![Alt uml](./observer_uml.png?s=200 )


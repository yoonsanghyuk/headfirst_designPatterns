# Head First : Design Patterns

## Iterator Pattern 이터레이터 패턴.
  
### 요약 :       
컬렉션 구현 방법을 노출시키지 않으면서 ,  
그 집합체 안에 들어있는 모든 항목에 접근할 수 있게 해주는 방법을 제공하는 패턴이다.  
  
  
### 기억 추적 :     
인터페이스를 통해 hasNext, next를 구현한다.  
그리고 여러 종류의 컬렉션(array, list, set 등)을 통합 관리하는 반복자 역할을 한다.  
자바의 Iterator 클래스도 같은 기능이다.  



### UML
![Alt uml](./iterator_uml.png?s=200 )


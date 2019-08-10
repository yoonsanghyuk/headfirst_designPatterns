headfirst.designpatterns.factoryMethod# Head First : Design Patterns  
  
## Factory Method Pattern 팩토리 메소드 패턴.  
  
### 요약 :   
팩토리 패턴의 한 종류로서 객체를 생성하기 위한 메소드를(Factory Method) 인터페이스를 통해 정의해두고,    
어떤 클래스의 인스턴스를 만들지는 위에서 정의한 Factory Method를 통해 서브클래스에서 결정하게 하는 패턴임.  



### 기억 추적 :   
서브클래스에서 특정 파라미터 등을 전달하여, Factory Method를 통해 new 객체를 생성한다.  
객체 생성을 캡슐화 한 것으로 어떤 클래스가 생성될지는 서브클래스만이 알게된다.  

### UML
![Alt uml](./factoryMethod_uml.png?s=200 )


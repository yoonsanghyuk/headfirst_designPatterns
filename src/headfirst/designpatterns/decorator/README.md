# Head First : Design Patterns

## Decorator Pattern 데코레이터 패턴.  

### 요약 :   
객체의 추가적인 요소등을 동적으로 추가할 수 있다.  
OCP(Open-Close-Principle)처럼 추가적인 요소를 유연하게 추가 가능하다.  


### 기억 추적 :   
메인요소(ex: 커피종류)와 서브요소(ex: 옵션종류)를     
재귀함수처럼 계속해서 감싸 추가요소를 유연하게 추가가능하다.  
```java   
Beverage darkRoast = new DarkRoast();    
darkRoast = new Mocha(darkRoast);  
darkRoast = new Mocha(darkRoast);  
darkRoast = new Whip(darkRoast);  
```

java I/O Stream도 같은 개념.  
InputStream이라는 컴포넌트(ex: Beverage)를 기준으로    
FileInputStream, StringBufferInputStream, ByteArrayInputStream 등의 메인요소(ex: 커피종류)  
PushbackInputStream, BufferedInputStream, DataInputStream, LineNumberInputStream 등의 서브요소(ex: 옵션종류)  
등을 마구 조합하여 사용한다.  
  
### UML
![Alt uml](./decorator_uml.png?s=200 )

